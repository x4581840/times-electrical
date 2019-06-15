package com.timeselectrical.service.impl;

import com.timeselectrical.dao.ILoadingConfigurationDao;
import com.timeselectrical.service.ILoadingConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:27
 * @Version 1.0
 **/

@Service
public class LoadingConfigurationServiceImpl implements ILoadingConfigurationService {

    @Autowired
    private ILoadingConfigurationDao loadingConfigurationDao;

}
