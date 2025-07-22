package com.govind.autowiring_in_spring.using_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Autowired
    @Qualifier("result2")
    private Result res;

    public Result getRes() {
        return res;
    }

    public void setRes(Result res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Student{" +
                "res=" + res +
                '}';
    }
}
