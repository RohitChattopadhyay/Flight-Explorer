Internet Technology Lab : Assignment 3 Report
---
Name: *Rohit Rajat Chattopadhyay*  
Roll: *001710501073*  
Date: *23rd November, 2020*  
Batch: *A3*  

## Problem Statement
Implement a web application for *Travel Thru Air* using servlets to support the following two use cases
1. A list of current special deals must appear on the home page. Each special deal must display the departure city, the arrival city, and the cost. These special deals are set up by the marketing department and change during the day, so it can’t be static. Special deals are only good for a limited amount of time.
2. A user may search for flights, given a departure city, time and an arrival city. The results must display the departure city, the arrival city, the total cost, and how many legs the flight will have.  

State and explain why and where you have used design patterns.

## Solution Approach
**Class Diagram**  
![](https://i.imgur.com/vQaQPXq.png)  
**Servlet**  
![](https://i.imgur.com/2gm505D.png)

The Deals and Flights are stored in CSV format and can be modified using the Admin Management panel

### User Interface
![](https://i.imgur.com/OqZslnB.png)

### Search Algorithm
Implemented using *Depth First Search* Algorithm  

![](https://i.imgur.com/lU6YgjZ.png)


## Salient Features
- **Deals**  
    Carousel like display, continuously scrolling horizontally displaying active deals.  
    ![](https://i.imgur.com/xDjDw8r.png)

- **Search Box**
    ![](https://i.imgur.com/RQWazh7.png)

- **Airport Code Suggestor**  
    ![](https://i.imgur.com/faqyjrd.png)

- **Password protected Admin Panel**  
    ![](https://i.imgur.com/o2x750h.png)  
    ![](https://i.imgur.com/RCCr5YJ.png)  

- **Multi Leg Flights**  
    ![](https://i.imgur.com/PfIl139.png)


- **Proper Error Message**
    ![](https://i.imgur.com/rX7nC7V.png)
