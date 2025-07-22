package com.govind.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        // spring container object
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_expressionlanguage.xml");

        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);


        // creating object of spring expression language parser
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("22 + 44");
        System.out.println("\nThe value from expression is: " + expression.getValue());

    }
}
