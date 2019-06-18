package com.timeselectrical.mapper;


import com.timeselectrical.component.PageParam;
import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.dto.PartLoadingConfigurationDTO;
import com.timeselectrical.model.LoadingConfiguration;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface LoadingConfigurationMapperExt extends LoadingConfigurationMapper{

    List<LoadingConfiguration> getLoadingConfigurations(@Param("cond") LoadingConfigurationCondDTO cond,@Param("pageParam") PageParam pageParam);

    List<String> getLocChildsByCond(@Param("cond") LoadingConfigurationCondDTO cond);

    List<PartLoadingConfigurationDTO> getPartColumnLoadingConfigurationsBySqn(@Param("sqn") String sqn);

    PartLoadingConfigurationDTO getPartColumnLoadingConfigurationsById(@Param("id") String id);

    Integer getLoadingConfigurationsCount(@Param("cond") LoadingConfigurationCondDTO cond);
}