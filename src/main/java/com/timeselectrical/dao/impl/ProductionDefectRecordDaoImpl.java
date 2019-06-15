package com.timeselectrical.dao.impl;

import com.timeselectrical.dao.IProductionDefectRecordDao;
import com.timeselectrical.mapper.ProductionDefectRecordMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:21
 * @Version 1.0
 **/
@Repository
public class ProductionDefectRecordDaoImpl implements IProductionDefectRecordDao {

    @Autowired
    private ProductionDefectRecordMapperExt productionDefectRecordMapperExt;

}
