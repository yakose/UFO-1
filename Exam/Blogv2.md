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

We see that each service is it's own service and that means, if we need more of one specific service, we can just clone it! We can simply just make another service of a specific one instead of having to 'clone' the entire system with everything in it. This is not only bad for performance but can also cause other issues as well.

## Wait, where did we go?
So to go back to the calculator, we can make it in a monolithic design where everything will be packaged into the same system, makes sense right? Yeah, kind of.

Here's why making it in with microservices could be beneficial. Assuming the calculator has more than a couple operations, and we know that we will be adding more as time goes on, we can take advantage of microservices. Instead of having it all in the same service, we can split it up so each operation will be in its own service! This has a couple benefits. It means that we can integrate new ones without touching the older operations thus ensuring we will not break them. It also means that parts of the calculator can break, but still work!

How does that make sense? It means that one of the operations can break, without the entire calculator going down. We can have a functioning calculator without the '+' operation for example.

The downside of this is that it takes longer to get the calculator to a minimum viable product. Making sure you can integrate the services or operations requires more work than just throwing them in there.


## We did it. What does it mean?
Here is our findings:
