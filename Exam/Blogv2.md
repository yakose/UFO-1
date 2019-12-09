# How are we building a calculator ?

There are different ways to build a calculator and we will look at them now. Knowing the extent of the calculators features will help in this matter. We will look at building it with a monolithic design and with microservices and explain what the differences are.

## Why do this?
So we know that there are two different ways to build systems or projects and want to explore what make them different. In this article we will be circling around the idea of making a calculator app, or system. Having built it in different ways we can look at some of the differences and what they mean, and with the knowledge, this should easily be applicable to other systems that have the same core concepts in how they work.

## Ready, set, GO!
So we will be building the calculator and measure certain metrics that will help you decide what works best.

Let us start with a simple explanation of the differences between monolithic and microservices and what they essentially are.

To keep it short here is a picture of what monolithic design is:
![monolithic](https://miro.medium.com/max/2800/1*TRmj8lWyzCufEGjxCONAog.jpeg)

We see that everything is in the same 'box' or 'container'. This makes it work differently than microservices as you cannot scale a single component and everything is very tightly coupled, this means everything is reliant on each other. It also means that if something breaks down, everything with break down.

Here is it in microservices!
![microservices](https://miro.medium.com/max/3444/1*FYrICPQmw3ebh70oswdA6g.png)

We see that each service is it's own service and that means, if we need more of one specific service, we can just clone it! We can simply just make another service of a specific one instead of having to 'clone' the entire system with everything in it. This is not only bad for performance but can also cause other issues as well. This is made super easy with kubernetes for example, where you can just up the replica variable and you will get 'x' more or less instances of that service.

## Wait, where did we go?
So to go back to the calculator, we can make it in a monolithic design where everything will be packaged into the same system, makes sense right? Yeah, kind of.

Here's why making it in with microservices could be beneficial. Assuming the calculator has more than a couple operations, and we know that we will be adding more as time goes on, we can take advantage of microservices. Instead of having it all in the same service, we can split it up so each operation will be in its own service! This has a couple benefits. It means that we can integrate new ones without touching the older operations thus ensuring we will not break them. It also means that parts of the calculator can break, but still work!

How does that make sense? It means that one of the operations can break, without the entire calculator going down. We can have a functioning calculator without the '+' operation for example.

The downside of this is that it takes longer to get the calculator to a minimum viable product. Making sure you can integrate the services or operations requires more work than just throwing them in there.


## We did it. What does it mean?
Here is our findings.
Let us say we can use the same frontend or client for both projects so we don't need to worry about it. We just need to make the business aspect of the calculator.

We decided to use docker to make one of the projects. We concluded this was the best way to really show the scalability potential. Docker is good for many different things but it can be integrated easily with Kubernetes which truly will make the scalability great.
It makes it very easy to integrate new services and also control them. So this is quite a lot to setup before our simple plus minus operations will be available to our client.
We also wanna add some tests to be sure  our logic actually works so we will add that too. We are starting to accumulate quite a lot of different files.

Our second project we made simple. We just threw in all the code into the same file and it was made rather quickly. We again made a couple tests to ensure the logic works as we expect. Because we did not use any exterior tools and simply just wrote the code we needed it was very fast to get a working system.

### Winner? 
After adding just a couple operations we could easily see what one method was a lot faster. Not having to setup the different tools really sped it up a lot.

So far there was a clear winner in what was faster, monolithic. We just threw in all of the code and all of the tests. It works!

As we tried to add more and more operations we found out that it quickly became quite confusing and messy, looking at the monolithic design. We tried to have a friendly developer look at our code and it took him a while understanding how everything was put together and how exactly it all was working. We then asked him to look at our microservices project and he said that it was a lot easier to get to know it.   

Time to get familiar with monolithic: **20 minutes**   
Time to get familiar with microservices: **5 minutes**

### Conclusion
Based on our experiences with this experiment, we have found out that it quickly makes sense to build a project using microservices if: it will be developed by more people, it will be adding more features.
