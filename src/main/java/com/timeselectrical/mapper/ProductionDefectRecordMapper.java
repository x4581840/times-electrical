package com.timeselectrical.mapper;

import com.timeselectrical.model.ProductionDefectRecord;
import com.timeselectrical.model.ProductionDefectRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionDefectRecordMapper {
    int countByExample(ProductionDefectRecordExample example);

    int deleteByExample(ProductionDefectRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductionDefectRecord record);

    int insertSelective(ProductionDefectRecord record);

    List<ProductionDefectRecord> selectByExample(ProductionDefectRecordExample example);

    ProductionDefectRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductionDefectRecord record, @Param("example") ProductionDefectRecordExample example);

    int updateByExample(@Param("record") ProductionDefectRecord record, @Param("example") ProductionDefectRecordExample example);

    int updateByPrimaryKeySelective(ProductionDefectRecord record);

    int updateByPrimaryKey(ProductionDefectRecord record);
}