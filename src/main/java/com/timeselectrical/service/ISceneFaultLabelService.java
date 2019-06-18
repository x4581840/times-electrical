package com.timeselectrical.service;


import com.timeselectrical.dto.SceneFaultLabelCondDTO;
import com.timeselectrical.model.SceneFaultLabel;



import com.timeselectrical.model.copySceneFaultLabel;



import java.util.List;

/**
 * 现场故障标签service
 */
public interface ISceneFaultLabelService {
    //根据故障编码，在现场事件表中查出详情
    List<SceneFaultLabel> getOneTabResult(String fGzpthwzbm, String startTime, String endTime,String fGzpmc);
   //弹出框模糊查询
    List<SceneFaultLabel> getTwoTabResult(String fGzpthwzbm);
   //超链接查询
   List<copySceneFaultLabel> getLinkREsult(String fGzpthwzbm, String fGzpmc, String fCxdl, String fZccx, String fZyzrdw,String startTime,String endTime );


    /**
     * 查询现场故障标签
     * @return
     */
    List<SceneFaultLabel> getSceneFaultLabels(SceneFaultLabelCondDTO cond);
}
