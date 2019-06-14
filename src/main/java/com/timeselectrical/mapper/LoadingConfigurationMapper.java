package com.timeselectrical.mapper;

import com.timeselectrical.model.LoadingConfiguration;
import com.timeselectrical.model.LoadingConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingConfigurationMapper {
    int countByExample(LoadingConfigurationExample example);

    int deleteByExample(LoadingConfigurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoadingConfiguration record);

    int insertSelective(LoadingConfiguration record);

    List<LoadingConfiguration> selectByExample(LoadingConfigurationExample example);

    LoadingConfiguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoadingConfiguration record, @Param("example") LoadingConfigurationExample example);

    int updateByExample(@Param("record") LoadingConfiguration record, @Param("example") LoadingConfigurationExample example);

    int updateByPrimaryKeySelective(LoadingConfiguration record);

    int updateByPrimaryKey(LoadingConfiguration record);
}