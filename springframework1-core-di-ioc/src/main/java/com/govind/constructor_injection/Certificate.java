package com.govind.constructor_injection;

public class Certificate {
    private String name;

    public Certificate() {
    }

    public Certificate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                '}';
    }
}
