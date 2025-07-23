package com.govind.dao;

import com.govind.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentDao {
    void insert(Student student);

    Optional<Student> getStudentById(Integer id);

    List<Student> getAll();

    void deleteStudentById(int id);

    void updateStudent(Student updatedStudent);
}
