                                AUTOWIRING IN SPRING
--> Feature of spring Framework in which spring container injects the dependencies automatically
--> Autowiring can't be used for injecting primitive types or string. It can only be used for reference types.

## Autowiring can be done in two different ways:
1. XML
2. Annotation


# XML
--> Autowiring modes:
1. no (default)
2. byName
3. byType
4. constructor
5. autodetect (deprecated)

## Annotation
--> Using @Autowired



# Autowiring Using XML Configuration
--> Fot autowiring using XML configuration, we need to create classes and then declare the dependency inside a class.
Now, we have to declare beans of the classes. Inside the bean tag of the class that needs the dependency, we have to use
autowire attribute as shown below:

### autowiring using xml using byName mode
--> Here byName matches the name of the dependency object inside the Employee class with the bean declared with the
same id. This mode can be used when we have multiple beans with different names and we need a particular one.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean class="com.govind.autowiring_in_spring.Address" id="address">
        <property name="street" value="katyayani marg"/>
        <property name="city" value="kathmandu"/>
    </bean>
    
    <!-- Autowiring byName -->
    <bean class="com.govind.autowiring_in_spring.Employee" id="employee"  autowire="byName"/>

</beans>
```

### autowiring using xml using byType mode
--> Here byType matches just the type of the bean defined inside the class and then injects the dependency.

```xml
    <!-- Autowiring using byType-->
<bean class="com.govind.autowiring_in_spring.Employee" id="employee2" autowire="byType"/>
```



### autowiring using xml using constructor mode
--> Here, if there is a parameterized constructor setting up the dependency by taking the arguments then the constructor
will be called and the dependency will be injected. For the bean, spring will search for the matching bean type inside
the xml configuration file and then inject it.

```xml
    <!-- Autowiring using constructor-->
<bean class="com.govind.autowiring_in_spring.Employee" id="employee3" autowire="constructor"/>
```



# Autowiring Using Annotation - @Autowired
--> It can be done by putting the @Autowired annotation on the reference name, constructor or the setter method.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">


    <!-- Enable the annotations   -->
    <context:annotation-config/>

    <bean class="com.govind.autowiring_in_spring.using_annotations.Result" id="result">
        <property name="subject" value="nepali"/>
        <property name="marks" value="88"/>
    </bean>
    
    <bean class="com.govind.autowiring_in_spring.using_annotations.Student" id="student"/>
</beans>
```




# @Qualifier annotation using Autowiring
--> It can be used when we have multiple beans with different names, and we want a particular bean.
--> Also the name of the bean is different than that of the name of the reference declared inside the class.

```java


```
