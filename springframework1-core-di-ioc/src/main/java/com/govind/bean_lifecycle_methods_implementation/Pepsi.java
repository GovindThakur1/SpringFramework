package com.govind.bean_lifecycle_methods_implementation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting pepsi property price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    // this acts as init method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside pepsi afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside pepsi destroy method");
    }


}
