<h4>Sum the Difference</h4>
<hr/>
<b>Problem Description</b>

Given an integer array A of size N.
You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.
<hr/>


<b>Problem Constraints</b>

1 <= N <= 10000

1<= A[i] <=1000
<hr/>


<b>Input Format</b>

First argument is an integer array A.
<hr/>


<b>Output Format</b>

Return an integer denoting the output.
<hr/>


<b>Example Input</b>

Input 1:

A = [1, 2]

Input 2:

A = [1]
<hr/>

<b>Example Output</b>

Output 1:

1

Output 2:

0
<hr/>

<b>Example Explanation</b>

Explanation 1:

All possible non-empty subsets are:<br/>
[1]    largest-smallest = 1 - 1 = 0<br/>
[2]    largest-smallest = 2 - 2 = 0<br/>
[1 2]  largest-smallest = 2 - 1 = 1<br/>
Sum of the differences = 0 + 0 + 1 = 1<br/>
So, the resultant number is 1<br/>

Explanation 2:

Only 1 subsequence of 1 element is formed.