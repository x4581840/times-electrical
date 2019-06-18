package com.timeselectrical.service.impl;


import com.timeselectrical.dto.SceneFaultLabelCondDTO;
import com.timeselectrical.mapper.SceneFaultLabelMapperExt;
import com.timeselectrical.model.SceneFaultLabel;


import com.timeselectrical.model.copySceneFaultLabel;

import com.timeselectrical.service.ISceneFaultLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import java.util.List;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-15 11:30
 * @Version 1.0
 **/

@Service
public class SceneFaultLabelServiceImpl implements ISceneFaultLabelService {

    @Autowired
    private SceneFaultLabelMapperExt sceneFaultLabelMapperExt;

    public List<SceneFaultLabel> getOneTabResult(String fGzpthwzbm, String startTime, String endTime,String fGzpmc){
        return  sceneFaultLabelMapperExt.getOneTable(fGzpthwzbm,startTime,endTime,fGzpmc);
    }
    public List<SceneFaultLabel> getTwoTabResult(String fGzpthwzbm){
        return sceneFaultLabelMapperExt.childSelect(fGzpthwzbm);
    }
    public   List<copySceneFaultLabel> getLinkREsult(String fGzpthwzbm, String fGzpmc, String fCxdl, String fZccx, String fZyzrdw,String startTime, String endTime ){
        return  sceneFaultLabelMapperExt.linkSelect(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw,startTime,endTime);
    }

    @Override
    public List<SceneFaultLabel> getSceneFaultLabels(SceneFaultLabelCondDTO cond) {
        return sceneFaultLabelMapperExt.getSceneFaultLabels(cond);
    }
}
