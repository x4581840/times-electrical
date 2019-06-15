package com.timeselectrical.mapper;


import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.model.LoadingConfiguration;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface LoadingConfigurationMapperExt extends LoadingConfigurationMapper{

    List<LoadingConfiguration> getLoadingConfigurations(@Param("cond") LoadingConfigurationCondDTO cond);

    List<String> getLocByCond(@Param("cond") LoadingConfigurationCondDTO cond);
}