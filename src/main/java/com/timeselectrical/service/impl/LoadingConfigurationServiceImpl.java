package com.timeselectrical.service.impl;

import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.dto.ComponentLocationDTO;
import com.timeselectrical.dto.ComponentLocationDTO.*;
import com.timeselectrical.dto.PartLoadingConfigurationDTO;
import com.timeselectrical.mapper.LoadingConfigurationMapperExt;
import com.timeselectrical.model.LoadingConfiguration;
import com.timeselectrical.service.ILoadingConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:27
 * @Version 1.0
 **/

@Service
public class LoadingConfigurationServiceImpl implements ILoadingConfigurationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoadingConfigurationServiceImpl.class);

    @Autowired
    private LoadingConfigurationMapperExt loadingConfigurationMapperExt;

    @Override
    public List<LoadingConfiguration> getLoadingConfigurationsByCond(LoadingConfigurationCondDTO cond) {
        return loadingConfigurationMapperExt.getLoadingConfigurations(cond);
    }

    @Override
    public List<String> getLocChildsByCond(LoadingConfigurationCondDTO cond) {
        List<String> locChildList = loadingConfigurationMapperExt.getLocChildsByCond(cond);
        LOGGER.info("get locChildList from db, locChildList:"+locChildList);
        if(CollectionUtils.isEmpty(locChildList)) {
            return null;
        }
        Set<String> locSet = new HashSet<>();
        for (String loc : locChildList) {
            if(!StringUtils.isEmpty(loc)) {
                locSet.add(loc);
            }
        }
        return new ArrayList<>(locChildList);
    }

    @Override
    public ComponentLocationDTO getComponentLocations(String sqn, String locChildLike) {
        LoadingConfigurationCondDTO cond = new LoadingConfigurationCondDTO();
        cond.setSqn(sqn);
        cond.setLocChildLike(locChildLike);
        List<String> locChildList = this.getLocChildsByCond(cond);
        if(CollectionUtils.isEmpty(locChildList)) {
            return null;
        }
        locChildList.removeAll(Collections.singleton(null));
        ComponentLocationDTO clDto = new ComponentLocationDTO();
        List<ComonentLocation> cls = new ArrayList<>(locChildList.size());
        ComonentLocation cl = null;
        int i = 1;
        for (String loc : locChildList) {
            cl = clDto.new ComonentLocation(String.valueOf(i), loc);
            cls.add(cl);
            i++;
        }
        clDto.setResults(cls);
        return clDto;
    }

    @Override
    public List<Map<String, Object>> getTreeData(String sqn) {
        if(StringUtils.isEmpty(sqn)) {
            return null;
        }
        List<Map<String, Object>> resList = new ArrayList<>();
        List<PartLoadingConfigurationDTO> res = loadingConfigurationMapperExt.getPartColumnLoadingConfigurationsBySqn(sqn);
        if(CollectionUtils.isEmpty(res)) {
            return null;
        }
        Map<String, Object> root = new HashMap<>();
        root.put("id", res.get(0).getId());
        root.put("text", sqn);
        buildChildData(res, root);
        resList.add(root);
        return resList;
    }


    private void buildChildData(List<PartLoadingConfigurationDTO> res, Map<String, Object> map){
        List<Map<String, Object>> subNodes = new ArrayList<>();
        for(PartLoadingConfigurationDTO plc : res) {
            Map<String, Object> map1 = new HashMap();
            map1.put("id", plc.getIdChild());
            map1.put("text", plc.getSqnChild());
            List<String> tags = new ArrayList<>();
            tags.add(plc.getLocChild());
            tags.add(plc.getLocdesc());
            tags.add(plc.getItemnum());
            map1.put("tags", tags);
            if(!StringUtils.isEmpty(plc.getIdChild())) {
                PartLoadingConfigurationDTO child = loadingConfigurationMapperExt.getPartColumnLoadingConfigurationsById(plc.getIdChild());
                if(child != null) {
                    List<PartLoadingConfigurationDTO> subChild = loadingConfigurationMapperExt.getPartColumnLoadingConfigurationsBySqn(child.getSqn());
                    if(!CollectionUtils.isEmpty(subChild)) {
                        buildChildData(subChild, map1);
                    }
                }
            }
            subNodes.add(map1);
        }
        map.put("nodes", subNodes);
    }

}
