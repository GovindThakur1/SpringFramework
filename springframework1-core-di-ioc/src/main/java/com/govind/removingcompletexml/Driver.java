package com.govind.removingcompletexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {

        /*
            Since, we are using JavaConfig is a configuration class and then using component scan to scan the
            package we need, we don't have to use ClassPathXmlApplicationContext(), but instead we have to use
            AnnotationConfigApplicationContext()
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);


        /*
            this will only work when we use @Component on Student but not specify the name of the bean
         */
//        Student student = context.getBean("student", Student.class);
//        student.study();
//        student.setName("Govind");
//        System.out.println(student);


        /*
            Since, we are using configuration class and @Bean for generating the bean of Student class,
            we have to put the exact name of the bean method as declared inside the JavaConfig configuration class.
            So while using @Bean, we can also remove the @ComponentScan from the configuration class because there
            is no any class with @Component annotation which needs to be scanned in order to generate the bean.

                @Configuration
                @ComponentScan(basePackages = "com.govind.removingcompletexml")
                public class JavaConfig {

                    @Bean
                    public Student getStudent() {
                        return new Student();
                    }
                }
         */

        Student student = context.getBean("getStudent", Student.class);
        student.setName("govind");
        student.study();
        System.out.println(student);

    }
}
