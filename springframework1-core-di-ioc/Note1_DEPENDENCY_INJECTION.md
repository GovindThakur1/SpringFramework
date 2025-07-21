                                DEPENDENCY INJECTION

--> We can do dependency injection in various ways as follows:

1. Using Setter injection -> also called property injection - calls all the setters inside a class
2. Using constructor injection
3. Interface injection
4. Field injection - (Property injection) @Autowired
5. Method injection

# The datatypes supported by DI are as follows:

1. Primitive
2. Collection
3. Reference type (User-Defined)

                                SETTER INJECTION (Property injection)

# Injecting Primitive Types:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">


    <!-- Bean definition using setter or property injection   -->
    <bean class="com.govind.setterinjection_injectingprimitivetypes.Student" name="student">
        <!--   Setter injection for setting up the values inside Student class     -->
        <property name="studentId" value="111"/>
        <property name="studentAddress" value="ktm"/>
        <property name="studentName" value="govind thakur"/>
    </bean>


    <!-- Bean definition with property injection using p-namespace -->
    <bean class="com.govind.setterinjection_injectingprimitivetypes.Student" name="student2" p:studentId="102" p:studentName="gopal"
          p:studentAddress="brt"/>

</beans>

```

# How to inject Collection Types?

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">


    <!-- This shows how to inject collection types   -->


    <bean name="emp" class="com.govind.injectingcollections.Emp">

        <property name="employeeName" value="govind"/>

        <property name="phoneNumbers">
            <list>
                <value>9818869005</value>
                <value>9818855555</value>
                <value>null</value>
            </list>
        </property>

        <property name="addresses">
            <set>
                <value>Kathmandu</value>
                <value>Biratnagar</value>
                <value>Dharan</value>
            </set>
        </property>

        <property name="courses">
            <map>
                <entry key="english" value="2 years"/>
                <entry key="comp" value="1 year"/>
            </map>
        </property>

        <property name="properties">
            <props>
                <prop key="name">govi</prop>
                <prop key="favouriteFood">khaana</prop>
            </props>
        </property>

    </bean>

</beans>
```

# Injecting Reference Types

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- Here injecting the Object of B into A   -->

    <bean class="com.govind.injectingreferencetypes.B" name="b">
        <property name="y" value="99"/>
    </bean>

    <bean class="com.govind.injectingreferencetypes.A" name="a">
        <property name="x" value="77"/>
        <property name="obj" ref="b"/>
    </bean>


    <!-- We can do the same using p schema   -->
    <bean class="com.govind.injectingreferencetypes.A" name="a2" p:x="555" p:obj-ref="b"/>

</beans>
```

                                        CONSTRUCTOR INJECTION

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">

    <bean class="com.govind.constructor_injection.Certificate" name="certificate">
        <constructor-arg value="Java Spring Boot Passed"/>
    </bean>

    <bean name="person" class="com.govind.constructor_injection.Person">
        <constructor-arg value="govind" type="java.lang.String"/>
        <constructor-arg value="111" type="int"/>
        <constructor-arg ref="certificate"/>
    </bean>


    <!-- We can also do the above using c schema i.e., constructor schema -->
    <bean class="com.govind.constructor_injection.Certificate" name="certificate2" c:name="Python Course"/>

    <bean class="com.govind.constructor_injection.Person" name="person2">
        <constructor-arg name="personName" value="gopal" type="java.lang.String"/>
        <constructor-arg name="personId" value="511" type="int"/>
        <constructor-arg name="certificate" ref="certificate2" type="com.govind.constructor_injection.Certificate"/>
    </bean>


    <!-- Injecting the collection (list)   -->
    <bean class="com.govind.constructor_injection.Certificate" name="certificate3" c:name="C core"/>

    <bean class="com.govind.constructor_injection.Person" name="person3">
        <constructor-arg value="ram" type="java.lang.String"/>
        <constructor-arg value="333" type="int"/>
        <constructor-arg ref="certificate3" type="com.govind.constructor_injection.Certificate"/>
        <constructor-arg name="phones">
            <list>
                <value>11111</value>
                <value>22222</value>
            </list>
        </constructor-arg>


    </bean>


</beans>
```

## Ambiguity problem while doing constructor injection:

--> For this, we can use the type parameter inside the constructor-arg tag which will explicitly tell the spring which
constructor to call

```xml
  <!--Beans related to Addition class. This is used for demonstrating the ways of solving ambiguity while doing constructor injection   -->
<bean class="com.govind.constructor_injection.Addition" name="addition">
    <constructor-arg name="a" value="4" type="int"/>
    <constructor-arg name="b" value="8" type="int"/>
</bean>
```