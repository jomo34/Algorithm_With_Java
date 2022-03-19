# Smart Elephant
 
### Explan

+ Some people think that the bigger an elephant is, the smarter it is. 
+ To disprove this, you want to analyze a collection of elephants and place as large a subset of elephants as possible into a sequence whose weights are increasing but IQ’s are decreasing.

***

### Example
![](https://images.velog.io/images/jomo34/post/251a236a-138b-41ca-a9d8-f74ab680fc95/image.png)
=

***

### Input
```
6008 1300		6008 1300		6000 2100
6000 2100		6000 2100		1000 4000
500  2000		500  2000		8000 1400
1000 4000		1000 3500		2000 1900
1100 3000		1100 4000		6008 1300
6000 2000		8000 1400		500  2000
8000 1400		3000 1500
6000 1200		2000 1900
2000 1900
```
+ The input will consist of data for a bunch of elephants, at on elephant per line terminated by the end-of-file.
+ The data for each particular elephant will consist of a pair of integers : the first representing its size in kilograms and the second representing its IQ in the hundredths of IQ points.
+ Both integers are between 1 and 10,000.
+ The data contains information on at most 1,000 elephants.
+ Two elephants may have the same weight, the same IQ, or even the same weight and IQ.

***

### Output
```
// Possible Outputs
4               4		3
4598		3871		645
4591		3876		643
4597		4871		245
4521		4876		243
4527		5871		215
4561		5876		213
4567
```
+ As the sequence goes back, the weight becomes heavier and the IQ must decrease.
+ The first line print the length of the longest sequence of subsequences.
+ The next line print a sequence.
