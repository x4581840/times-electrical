package com.timeselectrical.mapper;


import com.timeselectrical.component.PageParam;
import com.timeselectrical.dto.SceneFaultLabelCondDTO;
import com.timeselectrical.model.SceneFaultLabel;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

import com.timeselectrical.model.copySceneFaultLabel;

import java.util.List;

@Resource
public interface SceneFaultLabelMapperExt extends StudentMapperExt{
        //根据故障物料编码，查出对应现场事件单信息
     List<SceneFaultLabel> getOneTable(@Param("fGzpthwzbm")String fGzpthwzbm, @Param("startTime") String startTime, @Param("endTime")String endTime,@Param("fGzpmc")String fGzpmc,@Param("curPage") int curPage,@Param("pageSize") int pageSize);
     int getOneTableCount(@Param("fGzpthwzbm")String fGzpthwzbm, @Param("startTime") String startTime, @Param("endTime")String endTime,@Param("fGzpmc")String fGzpmc);
        //弹出框进行模糊查询
     List<SceneFaultLabel> childSelect(@Param("fGzpthwzbm")String fGzpthwzbm,@Param("curPage") int curPage,@Param("pageSize") int pageSize);
       //针对查询框分页时的总条数，不支持pageHelp
    int getchildCount(@Param("fGzpthwzbm")String fGzpthwzbm);
    //超链接查询

    List<copySceneFaultLabel> linkSelect(@Param("fGzpthwzbm")String fGzpthwzbm, @Param("fGzpmc")String fGzpmc, @Param("fCxdl")String fCxdl, @Param("fZccx")String fZccx, @Param("fZyzrdw")String fZyzrdw, @Param("startTime") String startTime, @Param("endTime")String endTime);

    List<SceneFaultLabel> getSceneFaultLabels(@Param("cond") SceneFaultLabelCondDTO cond, @Param("pageParam") PageParam pageParam);

    Integer getSceneFaultLabelsCount(@Param("cond") SceneFaultLabelCondDTO cond);

    List<copySceneFaultLabel> linkSelect(@Param("fGzpthwzbm")String fGzpthwzbm, @Param("fGzpmc")String fGzpmc, @Param("fCxdl")String fCxdl, @Param("fZccx")String fZccx, @Param("fZyzrdw")String fZyzrdw, @Param("startTime") String startTime, @Param("endTime")String endTime,@Param("curPage") int curPage,@Param("pageSize") int pageSize);
   int linkSelectCount(@Param("fGzpthwzbm")String fGzpthwzbm, @Param("fGzpmc")String fGzpmc, @Param("fCxdl")String fCxdl, @Param("fZccx")String fZccx, @Param("fZyzrdw")String fZyzrdw, @Param("startTime") String startTime, @Param("endTime")String endTime);
    List<SceneFaultLabel> getSceneFaultLabels(@Param("cond") SceneFaultLabelCondDTO cond);

}