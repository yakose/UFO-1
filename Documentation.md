## Documentation of the current performance of the program, including why you believe your performance measurements are free of errors.
If I run the program, the build and completion time gets to be around 3.4 ~ 4 seconds. This is with minimal bloatware running.


 Help - I need profiler stuff

## An explanation of the bottlenecks in the program.
One of the main things that contribute to the slow performance is the type of data saved. In the current program, we are using a hashmap with Int and Long.  Long is a bigger variable and will give us a lot more room for data than we need, as we at most store a 5 digit number.  
An Integer, has a width of 32 bits and a Long has a width of 64 bits, making it twice as long. (Heh)  
The maximum number that an Int can hold is 2.147.483.647 - Far higher than what we need.

## A hypothesis of what is causing the problem, and a changed program which is improved to solve the problem.
Using an Int instead of Long should increase the performance as it requires half the memory.

## Documentation of the new performance, again including documentation that the measurements are free of errors.

I need more assistance from the tools I do not have.
