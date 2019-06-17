package com.timeselectrical.controller;

import com.github.pagehelper.PageHelper;
import com.timeselectrical.component.PageWrapper;
import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.dto.ProductionDefectRecordCondDTO;
import com.timeselectrical.dto.SceneFaultLabelCondDTO;
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
        return ResponseEntity.ok(loadingConfigurationService.getTreeData(sqn));
    }

    @RequestMapping("/getLoadConfigurationList")
    public ResponseEntity getLigetLoadConfigurationListst(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                  @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                  @RequestParam(name = "sqn", required = false) String sqn,
                                  @RequestParam(name = "locChildList", required = false) List<String> locChildList) {
        LOGGER.info("locChildList=="+locChildList);
        LoadingConfigurationCondDTO cond = new LoadingConfigurationCondDTO();
        cond.setSqn(sqn);
        cond.setLocChildList(locChildList);
        PageHelper.startPage(pageNo, pageSize, true);
        List<LoadingConfiguration> lcList = loadingConfigurationService.getLoadingConfigurationsByCond(cond);
        /*List<LoadingConfigurationExt> lcExtList = new ArrayList<>();
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
        }*/
        if(!CollectionUtils.isEmpty(lcList)) {
            for(LoadingConfiguration lc : lcList) {
                lc.setOnlinetime_long(lc.getOnlinetime() != null ? lc.getOnlinetime().getTime() : 0);
                lc.setReleasedate_long(lc.getReleasedate() != null ? lc.getReleasedate().getTime() : 0);
                lc.setUpdatetime_long(lc.getUpdatetime() != null ? lc.getUpdatetime().getTime() : 0);
                lc.setfGzfssj_long(lc.getfGzfssj() != null ? lc.getfGzfssj().getTime() : 0);
                lc.setCountScgz(lc.getCountXcgz() == null ? 0 : lc.getCountXcgz());
                lc.setCountXcgz(lc.getCountScgz() == null ? 0 : lc.getCountScgz());
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(lcList));
    }

    @RequestMapping("/getLocSelectData")
    public ResponseEntity getSelectData(@RequestParam(name = "sqn", required = false) String sqn,
                                        @RequestParam(name = "locChildLike", required = false) String locChildLike) {
        return ResponseEntity.ok(loadingConfigurationService.getComponentLocations(sqn, locChildLike));
    }

    @RequestMapping("/getProductDefectRecordList")
    public ResponseEntity getProductDefectRecordList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                                     @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                                     @RequestParam(name = "sqn", required = false) String sqn) {
        PageHelper.startPage(pageNo, pageSize, true);
        ProductionDefectRecordCondDTO cond = new ProductionDefectRecordCondDTO();
        cond.setSqn(sqn);
        List<ProductionDefectRecord> pdrList = productionDefectRecordService.getProductiondefectRecords(cond);
        /*List<ProductionDefectRecordExt> pdrExtList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(pdrList)) {
            ProductionDefectRecordExt pdrExt = null;
            for(ProductionDefectRecord pdr : pdrList) {
                pdrExt = new ProductionDefectRecordExt();
                BeanUtils.copyProperties(pdr, pdrExt);
                pdrExt.setZsxrq_long(pdr.getZsxrq() != null ? pdr.getZsxrq().getTime() : 0);
                pdrExt.setZsxsj_long(pdr.getZsxsj() != null ? pdr.getZsxsj().getTime() : 0);
                pdrExtList.add(pdrExt);
            }
        }*/
        if(!CollectionUtils.isEmpty(pdrList)) {
            for(ProductionDefectRecord pdr : pdrList) {
                pdr.setZsxrq_long(pdr.getZsxrq() != null ? pdr.getZsxrq().getTime() : 0);
                pdr.setZsxsj_long(pdr.getZsxsj() != null ? pdr.getZsxsj().getTime() : 0);
                pdr.setCount(pdr.getCount() == null ? 0 : pdr.getCount());
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(pdrList));
    }

    @RequestMapping("/getSceneFaultLabelList")
    public ResponseEntity getSceneFaultLabelList(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                                 @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                                 @RequestParam(name = "sqn", required = false) String sqn) {
        PageHelper.startPage(pageNo, pageSize, true);
        SceneFaultLabelCondDTO cond = new SceneFaultLabelCondDTO();
        cond.setSqn(sqn);
        List<SceneFaultLabel> sflList = sceneFaultLabelService.getSceneFaultLabels(cond);
        /*List<SceneFaultLabelExt> sflExtList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(sflList)) {
            SceneFaultLabelExt sflExt = null;
            for(SceneFaultLabel sfl : sflList) {
                sflExt = new SceneFaultLabelExt();
                BeanUtils.copyProperties(sfl, sflExt);
                sflExt.setfGzfssj_long(sfl.getfGzfssj() != null ? sfl.getfGzfssj().getTime() : 0);
                sflExtList.add(sflExt);
            }
        }*/
        if(!CollectionUtils.isEmpty(sflList)) {
            for (SceneFaultLabel sfl : sflList) {
                sfl.setfGzfssj_long(sfl.getfGzfssj() != null ? sfl.getfGzfssj().getTime() : 0);
                sfl.setCount(sfl.getCount() == null ? 0 : sfl.getCount());
            }
        }
        return ResponseEntity.ok(new PageWrapper<>(sflList));
    }
}
