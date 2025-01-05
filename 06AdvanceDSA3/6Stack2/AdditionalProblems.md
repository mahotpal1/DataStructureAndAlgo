Q1. Next Greater
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A, find the next greater element G[i] for every element A[i] in the array.
The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.


More formally:

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]
Elements for which no greater element exists, consider the next greater element as -1.









Problem Constraints

1 <= |A| <= 105


1 <= A[i] <= 107




Input Format

The first and the only argument of input contains the integer array, A.



Output Format

Return an integer array representing the next greater element for each index in A.



Example Input

Input 1:

 A = [4, 5, 2, 10] 
Input 2:

 A = [3, 2, 1] 



Example Output

Output 1:

 [5, 10, 10, -1] 
Output 2:

 [-1, -1, -1] 
 
 
Q2. Max Rectangle in Binary Matrix
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a 2-D binary matrix A of size N x M filled with 0's and 1's, find the largest rectangle containing only ones and return its area.




Problem Constraints

1 <= N, M <= 100



Input Format

The first argument is a 2-D binary array A.



Output Format

Return an integer denoting the area of the largest rectangle containing only ones.



Example Input

Input 1:

 A = [
       [1, 1, 1]
       [0, 1, 1]
       [1, 0, 0] 
     ]
Input 2:

 A = [
       [0, 1, 0]
       [1, 1, 1]
     ] 


Example Output

Output 1:

 4
Output 2:

 3
 
Q3. Sort stack using another stack
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints

1 <= |A| <= 5000


0 <= A[i] <= 109




Input Format

The only argument is a stack given as an integer array A.



Output Format

Return the array of integers after sorting the stack using another stack.



Example Input

Input 1:

 A = [5, 4, 3, 2, 1]
Input 2:

 A = [5, 17, 100, 11]


Example Output

Output 1:

 [1, 2, 3, 4, 5]
Output 2:

 [5, 11, 17, 100]
 
 