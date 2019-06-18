package com.timeselectrical.service;

import com.timeselectrical.component.PageParam;
import com.timeselectrical.dto.ProductionDefectRecordCondDTO;
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
    List<ProductionDefectRecord> getProductiondefectRecords(ProductionDefectRecordCondDTO cond, PageParam pageParam);

    /**
     * 查询总数
     * @param cond
     * @return
     */
    Integer getProductiondefectRecordsCount(ProductionDefectRecordCondDTO cond);

}
