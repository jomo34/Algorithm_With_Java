# Saving Ink

### Explan

+ Susan likes to make a line drawing with ink. There‘re several dots on drawing paper.
+ Your job is to tell Susan how to connect the dots so as to minimize the amount of ink used.
+ If all the dots are connected, Susan will not draw anymore. In other words, the drawn figure does not need to be closed.

***

### Example
![](https://media.vlpt.us/images/jomo34/post/dab4acbc-3374-4d6c-8dfa-444ec0fcbbef/image.png)
=

***

### Input
```
3		4		5
1 1		1 4		1 1
2 2		2 5		1 2
2 4		3 6		2 1
		1 1		2 2
        		        5 5
```
+ The first line is a Integer that indicating how many inputs to enter.
+ From the next line, enter the x and y coordinates in one line.

***

### Output
```
3.41	5.83	7.24
```
+ Your program must print a single real number to two decimal places:  the minimum total length of ink lines that can connect all the dots.
