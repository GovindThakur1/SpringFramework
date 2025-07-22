package com.govind.constructor_injection;

import java.util.List;

public class Person {
    private String personName;
    private int personId;
    private Certificate certificate;
    private List<String> phones;

    public Person() {
    }

    public Person(String personName, int personId, Certificate certificate) {
        this.personName = personName;
        this.personId = personId;
        this.certificate = certificate;
    }

    public Person(String personName, int personId, Certificate certificate, List<String> phones) {
        this.personName = personName;
        this.personId = personId;
        this.certificate = certificate;
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", phones=" + phones +
                '}';
    }
}
