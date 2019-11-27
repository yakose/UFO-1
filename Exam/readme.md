# Monolithic design could be bad !

Monoliths are bad for scalability and hard to main old features, because it's tightly coupled. If you have the wrong architecture it can hurt your development process and performance of your application. Implementing a Microservices architecture will allow you to scale the system easily and maintain the existing code with more ease. It can result in a better workflow, but is more expensive.
Microservices are harder to implement, meaning in a smaller project it can be harmful because it will take a lot of work to setup the environment. Some tools have surfaced to help solve this issue but still takes time to setup the entire production environment.

## Outlining the problem
So, when we start making a new project we have to be aware of the scale of it, we have to know how big it will be and what it’s purpose is. This should be decided before even starting the project. If you know the project will be big, have many different components or services, a different approach called microservices might be better, something we will discuss later.
Having to change this later on will cost a lot of time and unnecessary work and could essentially make you start all over. If there are concerns about the size of the project it could be better to approach it in a different way than monolithic.

In this article we will teach you everything you need to know to properly pick an architecture.

## Monoliths and microservices explained
### Monolith
A monolithic application is a single software application, where the user interface and data access code are put into a single application. A monolithic application is independent from other applications. The idea of the design is that the application can perform every task necessary for the program to function, and not just one particular task. Monolithic applications are designed without modularity. The reason we would like to modularity is so that we can reuse parts of our application logic and also make maintenance easier without having to make a wholesale replacement.

**Pros:**  
- Easy to setup and run
- Each service is tightly coupled, which means it there is no third party api libraries involved that requires you to understand and look up a lot of documentation. It is usually built in to your programming language.
- Deployment is straightforward
- The application in production will be easy to set up. Lots of documentation is written in a base case of deployment, and monolithic is usually the most simple approach to cloud hosting.
- Easier to test:
- Your application is tightly coupled. Which means each service has to be up and running in order to run tests.

**Cons:**  
- Harder to maintain
- If a mistake was made in a particular service then the whole application will not function at all. If as an example the server dies, your whole application shuts down (database, user interface etc.).
- Can be dependant on specific dependencies and versioning
- Your database might be dependant on mysql-connector v2, while your server might be dependant on mysql-connector v3. Lots of bugs occur due to version control in a monolithic application.
- Harder to scale
- Everything is build into this entire blackbox. If you have to scale even though it was only your server service that had issues, then you might have to upgrade everything, including database and user interface.



### Microservices

Microservices is a software development technique that arranges an application as a collection of services. It is the exact opposite of a monolithic application, and therefore is built on the idea of doing one thing and doing it well.
A microservice is not a layer in a monolithic application, such as a frontend-controller, it is an independent and loosely coupled piece of business functionality which can be used to implement a layered structure. Microservices are unlike monolithic applications build on modularity, which means we can easily maintain our application because everything is separated and we do not have to debug one big complex application, but a smaller part of a bigger system.

**pros:**  
- Less complex code and easier to understand and work with
- Each service in an application serve one purpose. A database serves to store data, a message broker serves to deliver messages across services, a frontend serves to create the UI etc.
- This makes it easier for the developer to understand, debug and work with the source code of that particular technology.
- Scalability is easier:
- Each part of an application takes some amount of traffic.
- A server could have lots of heavy calculations that might take a lot of your resources, while your client might not do anything other than displaying a user interface or a table of some sorts.
- In a microservice application you have every single service separated in the cloud, which makes it easier to upgrade that particular service to withstand the huge amount of traffic.
- Easier independent development of services
- When each service is separated and independent of each other, you can work safely on a specific service without fear of breaking your entire application.

**Cons:**  
Setup process is slow
- You have a server, a client and a database separated from each other that has to start up independently. Each service takes time to setup and connect between each service. This is usually done by a couple of external terminal calls or APi's.
- Deployment can be slow and complicated:
- Production type of microservices usually involves around a lot of different technologies in different environments on different computers and cloud providers. All of the services has to connect and speak to each other. By doing this you usually have to follow straight documentation of a particular host provider.
- Testing can be hard
- You have to wire each service up with API's in order to work and run tests on em. A server could be dependant on specific sort of data provided by the database service as an example. This means the database has to be online and the server has to connect through different API libraries to work together.

## Conclusion
Based on our experiences working on a couple different projects following the different approaches,  we feel that microservices works better for most projects that takes more than a few days to complete. We think that the increased time to set up the developer environment is worth the time because it will make the continued development much easier and more efficient. From the projects we have done in the past we feel like microservices is easier to work with because everything is more contained and decoupled, this makes it less overwhelming to integrate it into a larger system.










## Resources
https://www.thoughtworks.com/insights/blog/monoliths-are-bad-design-and-you-know-it

https://www.webdesignerdepot.com/2018/05/monolith-vs-microservices-which-is-the-best-option-for-you/

https://medium.com/@mstahir/why-monolith-apps-are-evil-f51237703a7d
