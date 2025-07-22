package com.govind.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // now we have to enable component scan for this package using context in the xml file
@Getter
@Setter
@ToString
public class Demo {

    @Value("#{22 + 11}")
    private int x;

    @Value("#{4 > 5 ? 4 : 5}")
    private int y;

    // invoking static methods
    @Value("#{T(Math).sqrt(35)}")
    private double z;

    @Value("#{T(Math).PI}")
    private double pi;


    // creating object in spEL
    @Value("#{new String('Govind')}")
    private String name;

    // Boolean type using spEL
    @Value("#{T(Boolean).TRUE}")
    private boolean isActive;

    @Value("#{ 8 - 3 > 3 }")
    private boolean isGreaterThanThree;

}
