# STEREOTYPE ANNOTATIONS

1. Instead of using xml configuration, we can use annotations for various purposes.
2. Such as instead of using <bean/> tag for creating bean, we can use @Component annotation
3. We can use various annotations for various purposes, such as @Value
4. For this, we also have to enable component-scan inside the xml file which allows spring to find which class to create
   bean of.
5. It is shown in example below:

```java

@Component
public class Student {
    @Value("Govind")
    private String studentName;
    @Value("Kathmandu")
    private String city;
}
```

## Collections with @Value annotation.

--> For this we need to create a standalone collections inside the xml file.

```java

@Component
public class Student {
    @Value("Govind")
    private String studentName;
    @Value("Kathmandu")
    private String city;

    @Value("#{cars}")
    private List<String> ownedCars;

}
```

--> The xml configuration file for this is below

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:util="http://www.springframework.org/schema/util"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd
           http://www.springframework.org/schema/util
           http://www.springframework.org/schema/util/spring-util.xsd">


    <context:component-scan base-package="com.govind.stereotype_annotations"/>


    <!-- Creating a standalone collection using util   -->
    <util:list list-class="java.util.ArrayList" id="cars">
        <value>SUV</value>
        <value>Sports</value>
        <value>Truck</value>
    </util:list>


</beans>
```

# BEAN SCOPE IN SPRING

The types of scope are as below:

1. singleton --> default, same object every time we ask
2. prototype --> new object every time we ask
3. request --> web application specific, [HttpRequest]
4. session --> web application specific, [HttpSession]
5. globalsession

We can do scope configuration in two different ways:

1. XML configuration file
2. Annotations

## Bean scope using XML

```xml
    <!-- Bean scope using annotations   -->
<bean class="com.govind.stereotype_annotations.Student" id="student2" scope="prototype"/>
```

## Bean scope using Annotations

```java


@Component
@Scope("prototype")   // <-- determining the scope here
public class Student {
    @Value("Govind")
    private String studentName;
    @Value("Kathmandu")
    private String city;

    @Value("#{cars}")
    private List<String> ownedCars;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<String> ownedCars) {
        this.ownedCars = ownedCars;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", ownedCars=" + ownedCars +
                '}';
    }
}


```





