                                LIFECYCLE METHODS OF SPRING BEANS

--> Spring Provides two important methods to every beans

1. public void init() --> contains the initialization code
2. public void destroy() --> contains the clean-up code

(note: We can change the names of the above methods but the signature should be the same)

# Configuration techniques for these methods:

1. XML
2. Spring Interface
3. Annotation

# Implementing bean life-cycle methods XML Configuration

--> For this, we have to declare and define the init() and destroy() methods inside the class
and then configure inside the xml file telling spring framework to call that particular method while initialization and
destruction as shows below:

```xml
<bean class="com.govind.bean_lifecycle_methods_implementation.Samosa" id="samosa" init-method="init"
      destroy-method="destroy">
    <property name="price" value="66"/>
</bean>

```

# Implementing bean life-cycle methods using Interfaces
--> For this, we can implement the two interfaces and then override the abstract methods.
1. InitializingBean (init)
2. DisposableBean (destroy)

```xml
<bean class="com.govind.bean_lifecycle_methods_implementation.Pepsi" id="pepsi" init-method="afterPropertiesSet"
      destroy-method="destroy">
    <property name="price" value="88"/>
</bean>

```


# Implementing bean life-cycle methods using Annotations
--> For this, we can use the following two annotations. First of all, we need to declare and define two methods which will
work as init and destroy. The method's names can be anything meaningful. And then use the following below annotations.
We don't need to mention these methods inside the xml file.
1. @PostConstruct (init)
2. @PreDestroy    (destroy)









