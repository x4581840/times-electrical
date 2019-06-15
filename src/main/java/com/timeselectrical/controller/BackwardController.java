package com.timeselectrical.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.timeselectrical.component.PageWrapper;
import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.model.*;
import com.timeselectrical.service.ILoadingConfigurationService;
import com.timeselectrical.service.IProductionDefectRecordService;
import com.timeselectrical.service.ISceneFaultLabelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-10 21:13
 * @Version 1.0
 **/
//@RestController=@Controller+@ResponseBody
@Controller
@RequestMapping(value = "/backward")
public class BackwardController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BackwardController.class);

    @Autowired
    private ILoadingConfigurationService loadingConfigurationService;
    @Autowired
    private IProductionDefectRecordService productionDefectRecordService;
    @Autowired
    private ISceneFaultLabelService sceneFaultLabelService;

    @RequestMapping("/backwardTab")
    public String tab() {
        return "backward";
    }

    /**
     *
     * @param sqn 产品序列号,对应到装车配置表（ASSET）中的字段父项产品序列号（SQN）
     * @return
     */
    @RequestMapping(value = "/getTreeData")
    public ResponseEntity getTreeData(@RequestParam(name = "sqn") String sqn) {

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", 1);
        map1.put("text", "parent1父亲");

        List<Map<String, Object>> list1 = new ArrayList<>();
        Map<String, Object> map1_1 = new HashMap<>();
        map1_1.put("id", 2);
        map1_1.put("text", "child1孩子");
        List<String> tags = new ArrayList<>();
        tags.add("S000123");
        tags.add("longjianyong");
        tags.add("物料编码");
        tags.add("位置》L了L");
        map1_1.put("tags", tags);
        Map<String, Object> map1_2 = new HashMap<>();
        map1_2.put("id", 3);
        map1_2.put("text", "child2");
        list1.add(map1_1);
        list1.add(map1_2);
        map1.put("nodes", list1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 4);
        map2.put("text", "parent2");

        List<Map<String, Object>> list2 = new ArrayList<>();
        Map<String, Object> map2_1 = new HashMap<>();
        map2_1.put("id", 5);
        map2_1.put("text", "child3");
        Map<String, Object> map2_2 = new HashMap<>();
        map2_2.put("id", 6);
        map2_2.put("text", "child4");
        list2.add(map2_1);
        list2.add(map2_2);
        map2.put("nodes", list2);

        list.add(map1);
        list.add(map2);
        System.out.println("=========");
        String result = JSON.toJSONString(list);
        System.out.println("==="+result);
        return null;
    }

    @RequestMapping("/getLoadConfigurationList")
    public ResponseEntity getLigetLoadConfigurationListst(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                  @RequestParam(name = "sqn", required = false) String sqn,
                                  @RequestParam(name = "locList", required = false) List<String> locList) {
        LOGGER.info("locList=="+locList);
        LoadingConfigurationCondDTO cond = new LoadingConfigurationCondDTO();
        cond.setSqn(sqn);
        cond.setLocList(locList);
        PageHelper.startPage(pageNo, pageSize, true);
        List<LoadingConfiguration> lcList = loadingConfigurationService.getLoadingConfigurationsByCond(cond);
        List<LoadingConfigurationExt> lcExtList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(lcList)) {
            LoadingConfigurationExt lcExt = null;
            for(LoadingConfiguration lc : lcList) {
                lcExt = new LoadingConfigurationExt();
                BeanUtils.copyProperties(lc, lcExt);
                lcExt.setOnlinetime_long(lc.getOnlinetime() != null ? lc.getOnlinetime().getTime() : 0);
                lcExt.setReleasedate_long(lc.getReleasedate() != null ? lc.getReleasedate().getTime() : 0);
                lcExt.setUpdatetime_long(lc.getUpdatetime() != null ? lc.getUpdatetime().getTime() : 0);
                lcExt.setfGzfssj_long(lc.getfGzfssj() != null ? lc.getfGzfssj().getTime() : 0);
                lcExtList.add(lcExt);
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(lcExtList));
    }

    @RequestMapping("/getLocSelectData")
    public ResponseEntity getSelectData(@RequestParam(name = "sqn", required = false) String sqn,
                                        @RequestParam(name = "locLike", required = false) String locLike) {
        return ResponseEntity.ok(loadingConfigurationService.getComponentLocations(sqn, locLike));
    }

    @RequestMapping("/getProductDefectRecordList")
    public ResponseEntity getProductDefectRecordList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                        @RequestParam(defaultValue = "10", required = false) Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize, true);
        List<ProductionDefectRecord> pdrList = productionDefectRecordService.getProductiondefectRecords();
        List<ProductionDefectRecordExt> pdrExtList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(pdrList)) {
            ProductionDefectRecordExt pdrExt = null;
            for(ProductionDefectRecord pdr : pdrList) {
                pdrExt = new ProductionDefectRecordExt();
                BeanUtils.copyProperties(pdr, pdrExt);
                pdrExt.setZsxrq_long(pdr.getZsxrq() != null ? pdr.getZsxrq().getTime() : 0);
                pdrExt.setZsxsj_long(pdr.getZsxsj() != null ? pdr.getZsxsj().getTime() : 0);
                pdrExtList.add(pdrExt);
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(pdrExtList));
    }

    @RequestMapping("/getSceneFaultLabelList")
    public ResponseEntity getSceneFaultLabelList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                                 @RequestParam(defaultValue = "10", required = false) Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize, true);
        List<SceneFaultLabel> sflList = sceneFaultLabelService.getSceneFaultLabels();
        List<SceneFaultLabelExt> sflExtList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(sflList)) {
            SceneFaultLabelExt sflExt = null;
            for(SceneFaultLabel sfl : sflList) {
                sflExt = new SceneFaultLabelExt();
                BeanUtils.copyProperties(sfl, sflExt);
                sflExt.setfGzfssj_long(sfl.getfGzfssj() != null ? sfl.getfGzfssj().getTime() : 0);
                sflExtList.add(sflExt);
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(sflExtList));
    }
}
