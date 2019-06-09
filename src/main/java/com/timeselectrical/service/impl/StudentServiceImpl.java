package com.timeselectrical.service.impl;

import com.timeselectrical.mapper.StudentMapperExt;
import com.timeselectrical.model.Student;
import com.timeselectrical.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapperExt studentMapperExt;

    @Override
    public List<Student> getStudentByLikeName(String likeName) {
        return studentMapperExt.getStudentByName(likeName);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapperExt.selectByPrimaryKey(id);
    }
}
