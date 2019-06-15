package com.timeselectrical.service;

import com.timeselectrical.dto.ComponentLocationDTO;
import com.timeselectrical.dto.LoadingConfigurationCondDTO;
import com.timeselectrical.model.LoadingConfiguration;

import java.util.List;

/**
 * 装车配置service
 */
public interface ILoadingConfigurationService {

    /**
     * 根据父项产品序列号和组件位置号查询装车配置
     * @param cond
     * @return
     */
    List<LoadingConfiguration> getLoadingConfigurationsByCond(LoadingConfigurationCondDTO cond);

    /**
     * 根据sqn和locLike查询 父项位置号（LOC）
     * @return
     */
    List<String> getLocsByCond(LoadingConfigurationCondDTO cond);

    /**
     * 根据sqn和locLkie 构建前端组件需要的数据
     * @param sqn    父项产品序列号
     * @param locLike  父项位置号模糊字符串
     * @return
     */
    ComponentLocationDTO getComponentLocations(String sqn, String locLike);
}
