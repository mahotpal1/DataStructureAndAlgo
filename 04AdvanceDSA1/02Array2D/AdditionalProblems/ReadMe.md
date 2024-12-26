Q1. Maximum Sum Square SubMatrix
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.



Problem Constraints

1 <= N <= 103.

1 <= B <= N

-102 <= A[i][j] <= 102.



Input Format

First arguement is an 2D integer matrix A.

Second argument is an integer B.



Output Format

Return a single integer denoting the maximum sum of submatrix of size B x B.



Example Input

Input 1:

 A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
 B = 3
Input 2:

 A = [
        [2, 2]
        [2, 2]
    ]
 B = 2


Example Output

Output 1:

 48
Output 2:

 8


Example Explanation

Explanation 1:

    Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48
Explanation 2:

 Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8
  
Q2. Minimum Swaps
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
-109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:

 A = [5, 17, 100, 11]
 B = 20


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
Explanation 2:

 A = [5, 17, 100, 11]
 After swapping 100 and 11, A => [5, 17, 11, 100].
 Now, all elements less than or equal to 20 are together.
 
 
Q3. Minimum Swaps 2
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].

It is allowed to swap any two elements (not necessarily consecutive).



Find the minimum number of swaps required to sort the array in ascending order.






Problem Constraints

1 <= N <= 100000
0 <= A[i] < N



Input Format

The only argument given is the integer array A.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

A = [1, 2, 3, 4, 0]
Input 2:

A = [2, 0, 1, 3]


Example Output

Output 1:

4
Output 2:

2'


Q4. Row with maximum number of ones
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).


Problem Constraints

1 <= N <= 1000

0 <= A[i] <= 1



Input Format

The only argument given is the integer matrix A.



Output Format

Return the row with the maximum number of 1.



Example Input

Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 0, 0, 1]
         [0, 0, 1, 1]
         [0, 1, 1, 1]    ]


Example Output

Output 1:

 0
Output 2:

 3


Example Explanation

Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 3 has maximum number of 1s.