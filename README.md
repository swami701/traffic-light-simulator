### Introduction
This repository contains a simple traffic signal simulation using Java

### Application Execution Steps
**Pre-requisites**
- [Java Runtime Environment - JRE](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

**Running the application**
- Clone this repo
- Using the terminal navigate to the cloned directory and execute `pwd` command to verify.
```
$ pwd
<your-desired-path>/traffic-light-simulator
```
- Run the application as below
```
$ cd src
$ javac TrafficSignalApplication.java
$ java TrafficSignalApplication
```

- Sample output

```

=================
Initial state
NorthSouthTrafficLight ==> GreenState
NorthWestSouthEastTrafficLight ==> GreenState
EastWestTrafficLight ==> RedState
EastNorthWestSouthTrafficLight ==> RedState
=================
1 second(s)
2 second(s)
3 second(s)
4 second(s)
5 second(s)
6 second(s)
7 second(s)
8 second(s)
9 second(s)
10 second(s)
11 second(s)
12 second(s)
13 second(s)
14 second(s)
15 second(s)
16 second(s)
17 second(s)
18 second(s)
19 second(s)
20 second(s)
21 second(s)
22 second(s)
23 second(s)
24 second(s)
25 second(s)
26 second(s)
27 second(s)
28 second(s)
29 second(s)
30 second(s)
31 second(s)
32 second(s)
33 second(s)
34 second(s)
35 second(s)
36 second(s)
37 second(s)
38 second(s)
39 second(s)
40 second(s)
41 second(s)
42 second(s)
43 second(s)
44 second(s)
45 second(s)
46 second(s)
47 second(s)
48 second(s)
49 second(s)
50 second(s)
51 second(s)
52 second(s)
53 second(s)
54 second(s)
55 second(s)
56 second(s)
57 second(s)
NorthSouthTrafficLight ==> YellowState
58 second(s)
59 second(s)
60 second(s)
NorthSouthTrafficLight ==> RedState
61 second(s)
62 second(s)
63 second(s)
64 second(s)
65 second(s)
66 second(s)
67 second(s)
NorthWestSouthEastTrafficLight ==> YellowState
68 second(s)
69 second(s)
70 second(s)
EastWestTrafficLight ==> GreenState
EastNorthWestSouthTrafficLight ==> GreenState
NorthWestSouthEastTrafficLight ==> RedState
Completed 1 cycle!
```


**App Configurations**
- [ApplicationConstants](https://github.com/swami701/traffic-light-simulator/blob/master/src/ApplicationConstants.java) file has the necessary configuration which can be modified as per our need.
```
    public static final int END_AFTER_CYCLE = 3;
    public static final int YELLOW_DURATION = 3;
    public static final int GREEN_DURATION = 57;
    public static final int TURN_RIGHT_GREEN_DURATION = GREEN_DURATION + 10;
```
- Currently the simulation will be terminated after 3 cycles.(i.e. after 210 seconds)



