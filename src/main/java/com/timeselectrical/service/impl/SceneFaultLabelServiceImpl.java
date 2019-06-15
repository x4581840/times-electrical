package com.timeselectrical.service.impl;

import com.timeselectrical.dao.ISceneFaultLabelDao;
import com.timeselectrical.service.ISceneFaultLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:30
 * @Version 1.0
 **/

@Service
public class SceneFaultLabelServiceImpl implements ISceneFaultLabelService {

    @Autowired
    private ISceneFaultLabelDao sceneFaultLabelDao;

}
