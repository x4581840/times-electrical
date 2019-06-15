package com.timeselectrical.mapper;

import com.timeselectrical.model.SceneFaultLabel;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface SceneFaultLabelMapperExt extends StudentMapperExt{

    List<SceneFaultLabel> getSceneFaultLabels();
}