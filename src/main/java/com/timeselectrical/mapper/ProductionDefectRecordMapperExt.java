package com.timeselectrical.mapper;


import com.timeselectrical.component.PageParam;
import com.timeselectrical.dto.ProductionDefectRecordCondDTO;
import com.timeselectrical.model.ProductionDefectRecord;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ProductionDefectRecordMapperExt extends ProductionDefectRecordMapper{

    List<ProductionDefectRecord> getProductionDefectRecords(@Param("cond") ProductionDefectRecordCondDTO cond,@Param("pageParam") PageParam pageParam);

    Integer getProductionDefectRecordsCount(@Param("cond") ProductionDefectRecordCondDTO cond);
}