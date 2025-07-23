package com.govind.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private String city;

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
