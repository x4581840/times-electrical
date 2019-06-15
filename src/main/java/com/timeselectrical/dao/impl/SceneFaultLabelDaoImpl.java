package com.timeselectrical.dao.impl;

import com.timeselectrical.dao.ISceneFaultLabelDao;
import com.timeselectrical.mapper.SceneFaultLabelMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:22
 * @Version 1.0
 **/

@Repository
public class SceneFaultLabelDaoImpl implements ISceneFaultLabelDao {

    @Autowired
    private SceneFaultLabelMapperExt sceneFaultLabelMapperExt;

}
