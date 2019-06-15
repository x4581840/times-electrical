package com.timeselectrical.service;

import com.timeselectrical.model.ProductionDefectRecord;

import java.util.List;

/**
 * 生产缺陷记录 service
 */
public interface IProductionDefectRecordService {

    /**
     * 查询生产缺陷记录
     * @return
     */
    List<ProductionDefectRecord> getProductiondefectRecords();

}
