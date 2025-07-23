package com.govind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DirectlyUsingJdbcDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);


//        String query = "INSERT INTO student(id, name, city) VALUES(?, ?, ?)";
//        int result = template.update(query, 1, "Govind Thakur", "Kathmandu");
//        System.out.println("Number of records inserted : " + result);


        // since using serial for table student, no need to pass id
        String query = "INSERT INTO student(name, city) VALUES(?, ?)";
        int result = template.update(query, "Shyam", "Lalitpur");
        System.out.println("Number of records inserted : " + result);


    }
}
