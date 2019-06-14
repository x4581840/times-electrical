package com.timeselectrical.mapper;

import com.timeselectrical.model.SceneFaultLabel;
import com.timeselectrical.model.SceneFaultLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneFaultLabelMapper {
    int countByExample(SceneFaultLabelExample example);

    int deleteByExample(SceneFaultLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SceneFaultLabel record);

    int insertSelective(SceneFaultLabel record);

    List<SceneFaultLabel> selectByExample(SceneFaultLabelExample example);

    SceneFaultLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SceneFaultLabel record, @Param("example") SceneFaultLabelExample example);

    int updateByExample(@Param("record") SceneFaultLabel record, @Param("example") SceneFaultLabelExample example);

    int updateByPrimaryKeySelective(SceneFaultLabel record);

    int updateByPrimaryKey(SceneFaultLabel record);
}