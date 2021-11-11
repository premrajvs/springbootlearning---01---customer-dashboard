# springbootlearning---01---customer-dashboard
This repository explains step by step the Spring boot concepts with code samples
1. Adding server.port to application properties file

# Understanding Dependency Injection and Autowiring
Initially lets create a java object for the class and call a method
Now, with spring framework, SpringApplication.run returns ConfigurableApplicationContext object. This acts as the bean factory which holds all objects. But, when I try running it, it returns error.

Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.performanceengineering.customerdashboard.funfact1

Reason for this error is, even though ConfigurableApplicationContext holds all the objects, It does not create objects for all the classes. It only creates objects for classes with annotation @Component.
