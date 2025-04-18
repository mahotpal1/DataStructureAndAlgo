Q1. Subset
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a set of distinct integers A, return all possible subsets.






NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The initial list is not necessarily sorted.


Problem Constraints

1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format

First and only argument of input contains a single integer array A.



Output Format

Return a vector of vectors denoting the answer.



Example Input

Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output

Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation

Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.


Q2. Permutations
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. 
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints

1 <= N <= 9



Input Format

Only argument is an integer array A of size N.



Output Format

Return a 2-D array denoting all possible permutation of the array.



Example Input

A = [1, 2, 3]


Example Output

[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3] 
  [2, 3, 1] 
  [3, 1, 2] 
  [3, 2, 1] ]


Example Explanation

All the possible permutation of array [1, 2, 3].


Q3. All Unique Permutations
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. 
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints

1 <= |A| <= 9

0 <= A[i] <= 10



Input Format

Only argument is an integer array A of size N.



Output Format

Return a 2-D array denoting all possible unique permutation of the array.



Example Input

Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2]


Example Output

Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]
Output 2:

[ [1, 2]
  [2, 1] ]
  
  
  
Q4. Unique Paths III
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a matrix of integers A of size N x M . There are 4 types of squares in it:






1. 1 represents the starting square.  There is exactly one starting square.
2. 2 represents the ending square.  There is exactly one ending square.
3. 0 represents empty squares we can walk over.
4. -1 represents obstacles that we cannot walk over.
Find and return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.








Problem Constraints

2 <= N * M <= 20
-1 <= A[i] <= 2



Input Format

The first argument given is the integer matrix A.



Output Format

Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.



Example Input

Input 1:

A = [   [1, 0, 0, 0]
        [0, 0, 0, 0]
        [0, 0, 2, -1]   ]
Input 2:

A = [   [0, 1]
        [2, 0]    ]


Example Output

Output 1:

2
Output 2:

0


Example Explanation

Explanation 1:

We have the following two paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
Explanation 1:

There are no such paths.



Additional Problems


Q1. Number of Squareful Arrays
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints

1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format

The only argument given is the integer array A.



Output Format

Return the number of permutations of A that are squareful.



Example Input

Input 1:

 A = [2, 2, 2]
Input 2:

 A = [1, 17, 8]


Example Output

Output 1:

 1
Output 2:

 2


Example Explanation

Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.
Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].
 
 
Q2. Letter Phone
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints

1 <= |A| <= 10



Input Format

The only argument is a digit string A.



Output Format

Return a string array denoting the possible letter combinations.



Example Input

Input 1:

 A = "23"
Input 2:

 A = "012"


Example Output

Output 1:

 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
Output 2:

 ["01a", "01b", "01c"]


Example Explanation

Explanation 1:

 There are 9 possible letter combinations.
Explanation 2:

 Only 3 possible letter combinations.
 
 
Q3. Remove Invalid Parentheses
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A consisting of lowercase English alphabets and parentheses '(' and ')'. Remove the minimum number of invalid parentheses in order to make the input string valid.

Return all possible results.

You can return the results in any order.



Problem Constraints

1 <= length of the string <= 20



Input Format

The only argument given is string A.



Output Format

Return all possible strings after removing the minimum number of invalid parentheses.



Example Input

Input 1:

 A = "()())()"
Input 2:

 A = "(a)())()"


Example Output

Output 1:

 ["()()()", "(())()"]
Output 2:

 ["(a)()()", "(a())()"]


Example Explanation

Explanation 1:

 By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 4 then string becomes : "()()()"
        2. Remove the parentheses at index 2 then string becomes : "(())()"
Explanation 2:

 By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 5 then string becomes : "(a)()()"
        2. Remove the parentheses at index 2 then string becomes : "(a())()"
		
		
Q4. Subsets II
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.


Problem Constraints

0 <= N <= 16



Input Format

Only argument is an integer array A of size N.



Output Format

Return a 2-D vector denoting all the possible subsets.



Example Input

Input 1:

 A = [1, 2, 2]
Input 2:

 A = [1, 1]


Example Output

Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]
Output 2:

 [
    [],
    [1],
    [1, 1]
 ]


Example Explanation

Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.

