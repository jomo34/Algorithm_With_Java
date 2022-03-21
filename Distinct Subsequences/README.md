### Explan

+ Design a code that determines the number of cases in which the string X appears in the string Z.


***

### Example
![](https://images.velog.io/images/jomo34/post/e39b1fcb-dc45-46df-aed8-7ce0c87f8c64/image.png)
=

***

### Input
```
2			2
babgbag			moonnekky
bag		        monkey

rabbbit			abcbbcc
rabbit			abc
```
+ The first line of the input contains an integer N indicating the number of test cases to follow.
+ The first line of each test case contains a string X, composed entirely of lowercase alphabetic characters and having length no greater than 10,000.
+ The second line contains another string Z having length no greater  than 100 and also composed of only lowercase alphabetic characters.
+ Be assured that neither Z nor any prefix or suffix of Z will have more than 10100 distinct occurrences in X as a subsequence.

***

### Output
```
5				8
3				7
```
+ For each test case, output the number of distinct occurrences of Z in X as a subsequence.
+ Output for each input set must be on a separate line.
