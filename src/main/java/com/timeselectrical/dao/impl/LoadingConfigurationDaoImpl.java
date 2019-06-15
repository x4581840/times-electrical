package com.timeselectrical.dao.impl;

import com.timeselectrical.dao.ILoadingConfigurationDao;
import com.timeselectrical.mapper.LoadingConfigurationMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:20
 * @Version 1.0
 **/

@Repository
public class LoadingConfigurationDaoImpl implements ILoadingConfigurationDao {

    @Autowired
    private LoadingConfigurationMapperExt loadingConfigurationMapperExt;

}
