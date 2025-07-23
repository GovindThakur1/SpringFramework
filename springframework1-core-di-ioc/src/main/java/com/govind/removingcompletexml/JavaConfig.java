package com.govind.removingcompletexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.govind.removingcompletexml")
// @ComponentScan is not required while using @Bean for creating beans in a separate config file, like this
public class JavaConfig {

    @Bean
    public Student getStudent() {
        return new Student(getSamosa());
    }

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }


    // The name of the bean can also be custom as shown below:
    @Bean(name = {"samosa", "sm", "temp"}) // now we can obtain the bean by any of these names
    public Samosa getSamosa2() {
        return new Samosa();
    }

}
