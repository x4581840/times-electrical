package com.timeselectrical.service.impl;


import com.timeselectrical.component.PageParam;
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

    public List<SceneFaultLabel> getOneTabResult(String fGzpthwzbm, String startTime, String endTime,String fGzpmc,int curpage,int pageSize){
         int pageNO=(curpage-1)*pageSize;
        return  sceneFaultLabelMapperExt.getOneTable(fGzpthwzbm,startTime,endTime,fGzpmc,pageNO,pageSize);
    }
   public int getOneTableCount(String fGzpthwzbm, String startTime, String endTime,String fGzpmc){
          return sceneFaultLabelMapperExt.getOneTableCount(fGzpthwzbm,startTime,endTime,fGzpmc);
    }
    public List<SceneFaultLabel> getTwoTabResult(String fGzpthwzbm,int curPage,int pageSize){
          int curPage1=(curPage-1)*pageSize;
        return sceneFaultLabelMapperExt.childSelect(fGzpthwzbm,curPage1,pageSize);
    }
    public int getChildCount(String fGzpthwzbm){
         return sceneFaultLabelMapperExt.getchildCount(fGzpthwzbm);
    }

    public   List<copySceneFaultLabel> getLinkREsult(String fGzpthwzbm, String fGzpmc, String fCxdl, String fZccx, String fZyzrdw,String startTime, String endTime,int curpage,int pageSize ){
          int pageNo=(curpage-1)*pageSize;
        return  sceneFaultLabelMapperExt.linkSelect(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw,startTime,endTime,curpage,pageSize);
    }
   public int linkSelectCount(String fGzpthwzbm, String fGzpmc, String fCxdl, String fZccx, String fZyzrdw,String startTime, String endTime){
        return sceneFaultLabelMapperExt.linkSelectCount(fGzpthwzbm,fGzpmc,fCxdl,fZccx,fZyzrdw,startTime,endTime);
   }
    @Override
    public List<SceneFaultLabel> getSceneFaultLabels(SceneFaultLabelCondDTO cond, PageParam pageParam) {
        return sceneFaultLabelMapperExt.getSceneFaultLabels(cond, pageParam);
    }

    @Override
    public Integer getSceneFaultLabelsCount(SceneFaultLabelCondDTO cond) {
        return sceneFaultLabelMapperExt.getSceneFaultLabelsCount(cond);
    }
}
