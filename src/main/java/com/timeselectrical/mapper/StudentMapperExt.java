package com.timeselectrical.mapper;

import com.timeselectrical.model.Student;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface StudentMapperExt extends StudentMapper {

    List<Student> getStudentByName(@Param("likeName") String likeName);

}
