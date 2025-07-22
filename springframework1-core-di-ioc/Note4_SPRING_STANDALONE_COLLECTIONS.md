# SPRING STANDALONE COLLECTIONS

1. When we want to declare a single collection inside xml configuration file, and then use that collection wherever
   we want, such type of collections is called Spring Standalone Collection. While using standalone collections, we can
   also initialize the type of collections we want such as for list -> arraylist, linkedlist, vector, stack and so on
   for
   other collections as well.
2. The Schema used for spring standalone collections is Util schema.

## Standalone Collections example is shown as below:

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

    <!-- Standalone List   -->
    <util:list list-class="java.util.LinkedList" id="friendsList">
        <value>Govind</value>
        <value>John</value>
        <value>Wick</value>
    </util:list>

    <!-- Standalone Map   -->
    <util:map map-class="java.util.LinkedHashMap" id="feeStru">
        <entry key="nepali" value="6700"/>
        <entry key="english" value="7700"/>
        <entry key="eph" value="8700"/>
    </util:map>

    <!-- Standalone Property   -->
    <util:properties id="dbConfig">
        <prop key="driver">com.mysql.jdbc.mydriver</prop>
        <prop key="myname">Govind</prop>
        <prop key="address">Biratnagar</prop>
    </util:properties>


    <bean class="com.govind.spring_standalone_collections.Person" id="person">
        <property name="friends" ref="friendsList"/>
        <property name="feeStructure" ref="feeStru"/>
        <property name="properties" ref="dbConfig"/>
    </bean>


</beans>
```

