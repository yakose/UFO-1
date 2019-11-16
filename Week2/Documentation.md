## Documentation of the current performance of the program, including why you believe your performance measurements are free of errors.
If I run the program, the build and completion time gets to be around 3.4 ~ 4 seconds. This is with minimal bloatware running.

We have had a lot of trouble running the profiler in netbeans, either with an error that stops it completely from running or simply running too fast so it cannot measure it properly.   

Using the intelliJ cpu profiler we figured out that the program spends ~50% of the runtime in the reader.read() method, which makes sense since this is running through the entire .txt file, that is quite long.

## An explanation of the bottlenecks in the program.
One of the main things that contribute to the slow performance is the type of data saved. In the current program, we are using a hashmap with Int and Long.  Long is a bigger variable and will give us a lot more room for data than we need, as we at most store a 5 digit number.  
An Integer, has a width of 32 bits and a Long has a width of 64 bits, making it twice as long. (Heh)  
The maximum number that an Int can hold is 2.147.483.647 - Far higher than what we need.

Another way to possibly increase the performance would be to use another way of streaming the file. Using the ``java.io.reader`` package it might be possible to achieve something faster. While researching we found the ``java.nio.*`` to have higher performance, as well as the buffered reader instead.

## A hypothesis of what is causing the problem, and a changed program which is improved to solve the problem.
Using an Int instead of Long should increase the performance as it requires half the memory. Basically making it twice as fast.

Another way of possibly making it run faster would be to use another way of streaming the file. We have not been able to increase it enough to see substantial performance outside of the margin of error.
## Documentation of the new performance, again including documentation that the measurements are free of errors.

As said before, we have been unable to properly use any analysis tools and can only assume our hypothesis. We have however reduced the build time to about 2 seconds. This is a substantial increase but we are unable to verify it using netbeans profiler.


### Conclusion
3.4 seconds :point_right: 2 seconds


# Review
Making it into a buffered reader will increase performance by buffering it, and loading it all into memory and not from the disk directly.

Using an Array instead of a hashmap, we will be able to to initialize all pointers meannig that we skip the null pointer expection that, will take us back through the stack, to see where something can handle the error. In this case, we go through the hashmaps methods and down through the stack, and have to go back out again until we find something that can catch.

This should increase the performance by ~~400 times

```java
long[] freq = new long[127]
freq[b]++;
```
