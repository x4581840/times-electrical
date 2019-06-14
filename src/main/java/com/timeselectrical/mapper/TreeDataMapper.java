package com.timeselectrical.mapper;

import com.timeselectrical.model.TreeData;
import com.timeselectrical.model.TreeDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeDataMapper {
    int countByExample(TreeDataExample example);

    int deleteByExample(TreeDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TreeData record);

    int insertSelective(TreeData record);

    List<TreeData> selectByExample(TreeDataExample example);

    TreeData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TreeData record, @Param("example") TreeDataExample example);

    int updateByExample(@Param("record") TreeData record, @Param("example") TreeDataExample example);

    int updateByPrimaryKeySelective(TreeData record);

    int updateByPrimaryKey(TreeData record);
}