package com.govind.injectingreferencetypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReferenceTypeInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceinjectionconfig.xml");

        A a = context.getBean("a", A.class);
        System.out.println(a);

        A a1 = context.getBean("a2", A.class);
        System.out.println(a1);

    }
}
