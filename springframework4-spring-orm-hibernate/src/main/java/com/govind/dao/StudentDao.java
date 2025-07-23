package com.govind.dao;

import com.govind.model.Student;
import lombok.Setter;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Setter
public class StudentDao implements IStudentDao {

    private HibernateTemplate hibernateTemplate;

    @Transactional(readOnly = false)
    @Override
    public void insert(Student student) {
        this.hibernateTemplate.persist(student);
        System.out.println("student saved");

    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return Optional.ofNullable(this.hibernateTemplate.get(Student.class, id));
    }

    @Override
    public List<Student> getAll() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    @Override
    public void deleteStudentById(int id) {
        Optional.ofNullable(this.hibernateTemplate.get(Student.class, id))
                .ifPresentOrElse(
                        student -> {
                            this.hibernateTemplate.delete(student);
                            System.out.println("Student deleted successfully");
                        },
                        () -> System.out.println("Student to be deleted not found.")
                );
    }

    @Transactional
    @Override
    public void updateStudent(Student updatedStudent) {
        Optional.ofNullable(this.hibernateTemplate.get(Student.class, updatedStudent.getId()))
                .ifPresentOrElse(
                        student -> {
                            Optional.ofNullable(updatedStudent.getName())
                                    .filter(name -> !name.isEmpty())
                                    .ifPresent(student::setName);
                            Optional.ofNullable(updatedStudent.getAddress())
                                    .filter(address -> !address.isEmpty())
                                    .ifPresent(student::setAddress);
                            System.out.println("Student updated successfully");
                        },
                        () -> System.out.println("Student to be updated not found")
                );
    }
}
