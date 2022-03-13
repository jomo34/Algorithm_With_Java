# Sweet nap
 
### Explan

![](https://images.velog.io/images/jomo34/post/30ecdbbf-d539-42f9-9ba7-a178be6c70c8/image.png)

***
### Input
```
4			        4	                        4
10:00 12:00			13:00 14:00			11:00 12:30
12:00 13:00			16:00 17:30			12:55 14:00
13:00 15:00			14:30 15:40			17:00 18:00
16:45 17:45			17:30 18:00			16:30 17:00
```
+ The first line is integer, representing the number of scheduled appointments for day.
+ The next lines contain the appointments in the format time1 time2, where time1 represents the time which the appointment starts and time2 the time it ends.
+ All times will be in the hh:mm format; the ending time will always be strictly after the starting time, and separated by a single space
+ All times will be greater than or equal of 10:00 and less than or  equal to 18:00.
+ You cannot assume, however, that the input will be in any specific  order
+ However, input may not be order in chronological order of the schedule.

***

### Output
```
Your biggest nap time is 15:00 to 16:45. You can sleep 1 hours and 45 minutes.

Your biggest nap time is 10:00 to 13:00. You can sleep 3 hours and 0 minutes.

Your biggest nap time is 14:00 to 16:30. You can sleep 2 hours and 30 minutes.
```
+ You must print the following line: Your biggest nap time is hh:mm to hh:mm. You can sleep (x hours and) y minutes.
+ hh:mm to hh:mm is the time when the nap start and end.
+ If the total nap time is at least 60 minutes, print x hours and y minutes.
+ If there is more than one longest nap with the same duration, print  the earliest one.
