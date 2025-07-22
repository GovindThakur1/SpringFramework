package com.govind.autowiring_in_spring.using_annotations;

public class Result {
    private String subject;
    private double marks;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Result{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
