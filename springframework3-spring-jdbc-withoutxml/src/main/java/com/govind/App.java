package com.govind;


import com.govind.config.SpringJdbcConfig;
import com.govind.dao.IStudentDao;
import com.govind.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

        IStudentDao dao = context.getBean("studentDao", StudentDao.class);

        System.out.println(dao.getStudentById(1));

        System.out.println("\nPrinting all student\n");
        dao.getAllStudents().forEach(System.out::println);


    }
}
