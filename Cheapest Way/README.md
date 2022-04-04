# Cheapest Way
 
### Explan

+ Given an m*n matrix of integers, you are to write a program that computes a path of minimal weight from left to right across the matrix
+ A path starts anywhere in column 1 and consists of a sequence of steps termination in column n.
+ Each stop consists of traveling from column i to column i+1 in an adjacent (horizontal or diagonal) row
+ The first and last rows (rows 1 and m) of a matrix are considered adjacent

***

### Example
![](https://media.vlpt.us/images/jomo34/post/e71b31d1-b614-4ce6-9fd2-5e17e23ca90d/image.png)
=

***

### Input
```
5 6			        5 6
3 4 1 2 8 6			3 4 1 2 8 6
6 1 8 2 7 4			6 1 8 2 7 4
5 9 3 9 9 5			5 9 3 9 9 5
8 4 1 3 2 6			8 4 1 3 2 6
3 7 2 8 6 4			3 7 2 1 2 3
```
+ he first line is the Integer of row and column numbers to create a matrix of m*n size.
+ From the next line, it will be about the Matrix.

***

### Output
```
16 11
```
+ Your program must print a minimal weight from left to right across the matrix.
