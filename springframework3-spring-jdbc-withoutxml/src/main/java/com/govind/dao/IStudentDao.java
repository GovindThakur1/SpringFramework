package com.govind.dao;

import com.govind.model.Student;

import java.util.List;

public interface IStudentDao {
    int insert(Student student);

    int change(Student student);

    int deleteById(int id);

    Student getStudentById(int id);

    List<Student> getAllStudents();

}
