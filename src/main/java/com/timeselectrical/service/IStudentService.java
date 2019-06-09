package com.timeselectrical.service;

import com.timeselectrical.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getStudentByLikeName(String likeName);

    Student getStudentById(Integer id);

}
