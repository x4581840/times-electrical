package com.timeselectrical.mapper;

import com.timeselectrical.dto.SceneFaultLabelCondDTO;
import com.timeselectrical.model.SceneFaultLabel;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface SceneFaultLabelMapperExt extends StudentMapperExt{

    List<SceneFaultLabel> getSceneFaultLabels(@Param("cond") SceneFaultLabelCondDTO cond);
}