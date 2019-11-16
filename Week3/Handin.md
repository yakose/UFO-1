# 🎉UFO - Hand in 3 🎉

## Case 📉
Our clients from all over the world is having different experiences with our messaging system. Our only server is located in central Europe, Frankfurt. The clients that are from Asia and North America are saying that they are experiencing 'lag', or slow response time.

Our job is to setup an experiment, about the geographical location and it's effects on response time, and execute it.

## Hypothesis ✈️
The internet, just like many other things travel not instantly, but at a very very high speed. The further away we are from something the longer it takes to get there. The speed of light when traveling to other planets is seen as the normal measurement, just as kilometres per hour is seen when we are driving around.

So, the internet travels very fast but has its limits.

## Experiment 📈
Our experiment will include various different ways of connecting to servers far away and see if we can establish a relationship between the distance away from us and the response time.

We have found 6 different servers located around the world

| Datacenter Location | Expected Latency |
| ------------- |:-------------:|
| Netherlands | Low |
| New York | Medium |
| Atlanta | Medium |
| Seattle | Medium |
| Los Angeles | Medium |
| Australia | High |

Hopefully this is the same as the results
## Execution 🔧
There are a couple of different ways we can execute our experiment. We can use online tools to test our internet speed and ping, such as Digital oceans own speedtester that specifically tests YOUR own connection to the server in question.

Another very popular tool is [Speedtest.net](Speedtest.net) that has a lot more servers available in a lot more locations.

Using [Speedtest.net](Speedtest.net), we can try and let it find the server on its own and it will most likely find the one with the lowest ping.
Running this test and selecting a few different locations has given us these results.

| Server location | Latency | Distance |
| - | - | |
|Taastrup | 8 | 60 km
Malmö | 10 | 104 km
Stockholm | 19 | 603 km
New york | 93 | 6143 km
New Delhi | 194 | 5874 km
Melbourne | 351 | 15999 km

## Evalution 📊
This lines up with our hypothesis that higher distance equals higher ping. We can see that further our target is, the higher the latency is.
The only thing that does support our hypothesis is that New York and New Delhi has roughly the same distance but the latter has twice the amount of latency. There could be many factors for this but we believe the cables that are running through to New Delhi are of lower quality and take in more 'noise' thus making it slower. The cables to New York are going underwater and therefore should have less noise.

### Errors ❓
Our test is not water tight, as the connection that we are using could be under stress or vary in other ways. This means that our connection is a variable in itself that can change the outcome and someone else with a different connection will get different numbers.
