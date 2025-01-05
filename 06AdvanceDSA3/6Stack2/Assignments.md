Q1. Nearest Smaller Element
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.


More formally,

G[i] for an element A[i] = an element A[j] such that

j is maximum possible AND

j < i AND

A[j] < A[i]

Elements for which no smaller element exist, consider the next smaller element as -1.




Problem Constraints

1 <= |A| <= 100000


-109 <= A[i] <= 109





Input Format

The only argument given is integer array A.



Output Format

Return the integar array G such that G[i] contains the nearest smaller number than A[i]. If no such element occurs G[i] should be -1.



Example Input

Input 1:


 A = [4, 5, 2, 10, 8]

Input 2:


 A = [3, 2, 1]



Example Output

Output 1:


 [-1, 4, -1, 2, 2]

Output 2:


 [-1, -1, -1]
 
 
Q2. Largest Rectangle in Histogram
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A.


A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.




Problem Constraints

1 <= |A| <= 100000


1 <= A[i] <= 10000




Input Format

The only argument given is the integer array A.



Output Format

Return the area of the largest rectangle in the histogram.



Example Input

Input 1:

 A = [2, 1, 5, 6, 2, 3]
Input 2:

 A = [2]


Example Output

Output 1:

 10
Output 2:

 2
 
Q3. MAX and MIN
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A.


The value of an array is computed as the difference between the maximum element in the array and the minimum element in the array A.

Calculate and return the sum of values of all possible subarrays of A modulo 109+7.





Problem Constraints

1 <= |A| <= 100000


1 <= A[i] <= 1000000




Input Format

The first and only argument given is the integer array A.



Output Format

Return the sum of values of all possible subarrays of A modulo 109+7.



Example Input

Input 1:


 A = [1]

Input 2:


 A = [4, 7, 3, 8]



Example Output

Output 1:

 0
Output 2:

 26
 
