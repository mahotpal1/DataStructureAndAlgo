Q1. Stairs
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are climbing a staircase and it takes A steps to reach the top.


Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Return the number of distinct ways modulo 1000000007



Problem Constraints

1 <= A <= 105



Input Format

The first and the only argument contains an integer A, the number of steps.



Output Format

Return an integer, representing the number of ways to reach the top.



Example Input

Input 1:

 A = 2
Input 2:

 A = 3


Example Output

Output 1:

 2
Output 2:

 3


Example Explanation

Explanation 1:

 Distinct ways to reach top: [1, 1], [2].
Explanation 2:

 Distinct ways to reach top: [1 1 1], [1 2], [2 1].
 
 
Q2. Fibonacci Number
Unsolved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a positive integer A, write a program to find the Ath Fibonacci number.

In a Fibonacci series, each term is the sum of the previous two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.

NOTE: 0th term is 0. 1th term is 1 and so on.



Problem Constraints

0 <= A <= 44



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the Ath Fibonacci number.



Example Input

Input 1:

 A = 4
Input 2:

 A = 6


Example Output

Output 1:

 3
Output 2:

 8


Example Explanation

Explanation 1:

 Terms of Fibonacci series are: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
 0th term is 0 So, 4th term of Fibonacci series is 3. 
Explanation 2:

 6th term of Fibonacci series is 8.
 
 
 
Q3. Minimum Number of Squares
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.



Problem Constraints

1 <= A <= 105



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the minimum count.



Example Input

Input 1:

 A = 6
Input 2:

 A = 5


Example Output

Output 1:

 3
Output 2:

 2


Example Explanation

Explanation 1:

 Possible combinations are : (12 + 12 + 12 + 12 + 12 + 12) and (12 + 12 + 22).
 Minimum count of numbers, sum of whose squares is 6 is 3. 
Explanation 2:

 We can represent 5 using only 2 numbers i.e. 12 + 22 = 5
 
 
Q4. Max Sum Without Adjacent Elements
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized. 
However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally. 

Return the maximum possible sum.

Note: You are allowed to choose more than 2 numbers from the grid.


Problem Constraints

1 <= N <= 20000
1 <= A[i] <= 2000


Input Format

The first and the only argument of input contains a 2d matrix, A.


Output Format

Return an integer, representing the maximum possible sum.


Example Input

Input 1:

 A = [   
        [1]
        [2]    
     ]
Input 2:

 A = [   
        [1, 2, 3, 4]
        [2, 3, 4, 5]    
     ]


Example Output

Output 1:

 2
Output 2:

 8
 
 
Additional Problems

Q1. Maximum Sum Value
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an array A of N integers and three integers B, C, and D.

You have to find the maximum value of A[i]*B + A[j]*C + A[k]*D, where 1 <= i <= j <= k <= N.



Problem Constraints

1 <= N <= 105

-10000 <= A[i], B, C, D <= 10000



Input Format

First argument is an array A
Second argument is an integer B
Third argument is an integer C
Fourth argument is an integer D



Output Format

Return an Integer S, i.e maximum value of (A[i] * B + A[j] * C + A[k] * D), where 1 <= i <= j <= k <= N.



Example Input

Input 1:

 A = [1, 5, -3, 4, -2]
 B = 2
 C = 1
 D = -1
Input 2:

 A = [3, 2, 1]
 B = 1
 C = -10
 D = 3


Example Output

Output 1:

 18
Output 2:

 -4


Example Explanation

Explanation 1:

 If you choose i = 2, j = 2, and k = 3 then we will get
 A[2]*B + A[2]*C + A[3]*D = 5*2 + 5*1 + (-3)*(-1) = 10 + 5 + 3 = 18
Explanation 2:

 If you choose i = 1, j = 3, and k = 3 then we will get
 A[1]*B + A[3]*C + A[3]*D = (3*1) + (-10*1) + (3*1) = 3 - 10 + 3 = -4
 
 
 
Q2. Max Product Subarray
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of size N. Find the contiguous subarray within the given array (containing at least one number) which has the largest product.

Return an integer corresponding to the maximum product possible.

NOTE: Answer will fit in 32-bit integer value.



Problem Constraints

1 <= N <= 5 * 105

-100 <= A[i] <= 100



Input Format

First and only argument is an integer array A.



Output Format

Return an integer corresponding to the maximum product possible.



Example Input

Input 1:

 A = [4, 2, -5, 1]
Input 2:

 A = [-3, 0, -5, 0]


Example Output

Output 1:

 8
Output 2:

 0


Example Explanation

Explanation 1:

 We can choose the subarray [4, 2] such that the maximum product is 8.
Explanation 2:

 0 will be the maximum product possible.
 
 
Q3. Ways to Decode
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message denoted by string A containing digits, determine the total number of ways to decode it modulo 109 + 7.



Problem Constraints

1 <= length(A) <= 105



Input Format

The first and the only argument is a string A.



Output Format

Return an integer, representing the number of ways to decode the string modulo 109 + 7.



Example Input

Input 1:

 A = "12"
Input 2:

 A = "8"


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 Given encoded message "12", it could be decoded as "AB" (1, 2) or "L" (12).
 The number of ways decoding "12" is 2.
Explanation 2:

 Given encoded message "8", it could be decoded as only "H" (8).
 The number of ways decoding "8" is 1.
 
 
 