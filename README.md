# springbootlearning---01---customer-dashboard
This repository explains step by step the Spring boot concepts with code samples
1. Adding server.port to application properties file

# Understanding Dependency Injection and Autowiring
Initially lets create a java object for the class and call a method
Now, with spring framework, SpringApplication.run returns ConfigurableApplicationContext object. This acts as the bean factory which holds all objects. But, when I try running it, it returns error.

Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.performanceengineering.customerdashboard.funfact1

Reason for this error is, even though ConfigurableApplicationContext holds all the objects, It does not create objects for all the classes. It only creates objects for classes with annotation @Component.
!!! Please note that even if you do not call the class, still it creates 1 instance of the class due to Singleton framework

Now, lets create 3 objects using new operator and you can see 3 objects getting created (3 times constructor called). However, when you change to Spring Context object, it reuses the same object all 3 times

# Why we need Autowiring
Lets add a new class and add @Component annotation. Lets call a method in this call from the funfact class. Ideally, since it is marked as Component, we expect this object to be available. But, how do we guarantee that this dependency object is created before the reference class ? we cannot do that.

To achieve this, we should add @Autowired annotation. This will create all dependent objects before creating the reference class object