package com.govind.spring_standalone_collections;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
public class Person {
    private List<String> friends;
    private Map<String, Integer> feeStructure;
    private Properties properties;


    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }
}
