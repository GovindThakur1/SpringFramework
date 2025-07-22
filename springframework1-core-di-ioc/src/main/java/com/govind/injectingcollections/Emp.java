package com.govind.injectingcollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String employeeName;
    private List<String> phoneNumbers;
    private Set<String> addresses;
    private Map<String, String> courses;

    // variable holding property. for example we can use the properties for storing credentials for database
    private Properties properties;

    public Emp() {
    }

    public Emp(String employeeName, List<String> phoneNumbers, Set<String> addresses, Map<String, String> courses, Properties properties) {
        this.employeeName = employeeName;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
        this.courses = courses;
        this.properties = properties;
    }

    public Emp(String employeeName, List<String> phoneNumbers, Set<String> addresses, Map<String, String> courses) {
        this.employeeName = employeeName;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
        this.courses = courses;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "employeeName='" + employeeName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
