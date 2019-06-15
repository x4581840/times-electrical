package com.timeselectrical.service.impl;

import com.timeselectrical.mapper.ProductionDefectRecordMapperExt;
import com.timeselectrical.model.ProductionDefectRecord;
import com.timeselectrical.service.IProductionDefectRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:29
 * @Version 1.0
 **/
@Service
public class ProductionDefectRecordServiceImpl implements IProductionDefectRecordService {

    @Autowired
    private ProductionDefectRecordMapperExt productionDefectRecordMapperExt;

    @Override
    public List<ProductionDefectRecord> getProductiondefectRecords() {

        return productionDefectRecordMapperExt.getProductionDefectRecords(null);
    }
}
