package com.govind;


import com.govind.dao.IStudentDao;
import com.govind.dao.StudentDao;
import com.govind.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        IStudentDao dao = context.getBean("studentDao", StudentDao.class);

        // inserting a new student
//        Student student = new Student("Hari", "Janakpur");
//        int noOfRowsInserted = dao.insert(student);
//        System.out.println("The number of rows inserted is: " + noOfRowsInserted);


        // updating a student
//        Student student = new Student(1, "Govind", "Kathmandu");
//        int result = dao.change(student);
//        System.out.println("The number of row updated: " + result);


        // deleting a student by id
//        int numberOdDeletedStudent = dao.deleteById(4);
//        System.out.println("The number of student deleted is: " + numberOdDeletedStudent);


        // selecting students
        Student student = dao.getStudentById(1);
        System.out.println(student);


        System.out.println("\nGetting all students\n");
        List<Student> students = dao.getAllStudents();
        students.stream().forEach(System.out::println);


    }
}
