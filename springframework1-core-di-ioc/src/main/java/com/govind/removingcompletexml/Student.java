package com.govind.removingcompletexml;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component // Instead of using @Component, we can use @Bean inside configuration class to get the bean of desired class
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;

//    @Autowired // using this when using @Component, removing this since using JavaConfig and @Bean annotation for creating beans¬
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        samosa.samosaHi();
        System.out.println("The student is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
