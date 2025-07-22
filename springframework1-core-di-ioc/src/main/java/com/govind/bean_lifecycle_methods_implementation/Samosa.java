package com.govind.bean_lifecycle_methods_implementation;

public class Samosa {
    private double price;

    public Samosa() {
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting samosa property price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    // declaring lifecycle methods
    public void init() {
        System.out.println("Inside init method of samosa");
    }

    public void destroy() {
        System.out.println("Inside destroy method of samosa");
    }
}
