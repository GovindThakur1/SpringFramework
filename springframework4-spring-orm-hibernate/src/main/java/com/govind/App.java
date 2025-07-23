package com.govind;


import com.govind.dao.IStudentDao;
import com.govind.dao.StudentDao;
import com.govind.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        IStudentDao dao = context.getBean("studentDao", StudentDao.class);


        // inserting 10 students
//        for (int i = 1; i <= 10; i++) {
//            Student student = new Student("Student" + i, "city" + i);
//            dao.insert(student);
//        }


        // getting one student
        Optional<Student> st = dao.getStudentById(1);
        System.out.println(st);


        // getting all students
        List<Student> students = dao.getAll();
        students.forEach(System.out::println);

        // deleting a student
        dao.deleteStudentById(10);


        // updating a student
        Student updateStudent = new Student(1, "Govind", "Kathmandu");
        dao.updateStudent(updateStudent);

        System.out.println(dao.getStudentById(1));

    }
}
