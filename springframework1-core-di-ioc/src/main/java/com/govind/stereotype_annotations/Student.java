package com.govind.stereotype_annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Student {
    @Value("Govind")
    private String studentName;
    @Value("Kathmandu")
    private String city;

    @Value("#{cars}")
    private List<String> ownedCars;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<String> ownedCars) {
        this.ownedCars = ownedCars;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", ownedCars=" + ownedCars +
                '}';
    }
}
