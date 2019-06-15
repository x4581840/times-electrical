package com.timeselectrical.service.impl;

import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.dto.ComponentLocationDTO;
import com.timeselectrical.dto.ComponentLocationDTO.*;
import com.timeselectrical.mapper.LoadingConfigurationMapperExt;
import com.timeselectrical.model.LoadingConfiguration;
import com.timeselectrical.service.ILoadingConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public List<String> getLocsByCond(LoadingConfigurationCondDTO cond) {
        List<String> locList = loadingConfigurationMapperExt.getLocByCond(cond);
        LOGGER.info("get locList from db, locList:"+locList);
        if(CollectionUtils.isEmpty(locList)) {
            return null;
        }
        Set<String> locSet = new HashSet<>();
        for (String loc : locList) {
            if(!StringUtils.isEmpty(loc)) {
                locSet.add(loc);
            }
        }
        return new ArrayList<>(locList);
    }

    @Override
    public ComponentLocationDTO getComponentLocations(String sqn, String locLike) {
        LoadingConfigurationCondDTO cond = new LoadingConfigurationCondDTO();
        cond.setSqn(sqn);
        cond.setLocLike(locLike);
        List<String> locList = this.getLocsByCond(cond);
        if(CollectionUtils.isEmpty(locList)) {
            return null;
        }
        ComponentLocationDTO clDto = new ComponentLocationDTO();
        List<ComonentLocation> cls = new ArrayList<>(locList.size());
        ComonentLocation cl = null;
        int i = 1;
        for (String loc : locList) {
            cl = clDto.new ComonentLocation(String.valueOf(i), loc);
            cls.add(cl);
            i++;
        }
        clDto.setResults(cls);
        return clDto;
    }

}
