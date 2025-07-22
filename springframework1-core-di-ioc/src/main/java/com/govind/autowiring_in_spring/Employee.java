package com.govind.autowiring_in_spring;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        System.out.println("Inside Employee constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
