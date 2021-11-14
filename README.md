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

# Starting to build the micro service code that talks to other 2 services
# Data Model
Target response from experience layer
{
    id : C001
    name : Prem
    accounts : [
        {id:111, type:"savings",accnumber:"1234",balance:1},
        {id:222, type:"checking",accnumber:"5678",balance:2}
        ....
    ]
}

1. Create the inner data sets as a model class - accountitem.java
2. Create a simple rest controller with hard coded List of account items
3. Hard code the response in controller and validate the project setup
4. This being the experience layer, this is how the flow works
    1.  Call Account Transactions service and get the list of account IDs and transaction IDs
    2.  For each of the account IDs, call account details service and get the account numbers

As first step, I am hard coding the response of account transactions and account details. I am using this data to create a data object for customer dashboard. Please note that so far I am getting all transactions and I am not filtering the data set by account ID

As next step, I am using traditional for loop to iterate through the account details and transactions details response to filter only the respective account IDs

Next Step, replacing the for loops with Stream API.
* So far, no rest calls are implemented. All responses are hard coded.