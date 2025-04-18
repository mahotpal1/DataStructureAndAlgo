Q3. Word Break
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Given a string A and a dictionary of words B, determine if A can be segmented into a space-separated sequence of one or more dictionary words.

Input Format:

The first argument is a string, A.
The second argument is an array of strings, B.
Output Format:

Return 0 / 1 ( 0 for false, 1 for true ) for this problem.
Constraints:

1 <= len(A) <= 6500
1 <= len(B) <= 10000
1 <= len(B[i]) <= 20
Examples:

Input 1:
    A = "myinterviewtrainer",
    B = ["trainer", "my", "interview"]

Output 1:
    1

Explanation 1:
    Return 1 ( corresponding to true ) because "myinterviewtrainer" can be segmented as "my interview trainer".

Input 2:
    A = "a"
    B = ["aaa"]

Output 2:
    0

Explanation 2:
    Return 0 ( corresponding to false ) because "a" cannot be segmented as "aaa".
	
	
Q1. Combination Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.






The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.








Problem Constraints

1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format

The first argument is an integer array A.











The second argument is integer B.








Output Format

Return a vector of all combinations that sum up to B.



Example Input

Input 1:

A = [2, 3]
B = 2
Input 2:

A = [2, 3, 6, 7]
B = 7


Example Output

Output 1:

[ [2] ]
Output 2:

[ [2, 2, 3] , [7] ]


Example Explanation

Explanation 1:

All possible combinations are listed.
Explanation 2:

All possible combinations are listed.



Q2. Combination Sum II
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of size N of candidate numbers A and a target number B. Return all unique combinations in A where the candidate numbers sums to B.

Each number in A may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
Warning:

DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.

Example : itertools.combinations in python. If you do, we will disqualify your submission and give you penalty points.



Problem Constraints

1 <= N <= 20



Input Format

First argument is an integer array A denoting the collection of candidate numbers.
Second argument is an integer which represents the target number.



Output Format

Return all unique combinations in A where the candidate numbers sums to B.



Example Input

Input 1:

 A = [10, 1, 2, 7, 6, 1, 5]
 B = 8
Input 2:

 A = [2, 1, 3]
 B = 3


Example Output

Output 1:

 [ 
  [1, 1, 6 ],
  [1, 2, 5 ],
  [1, 7 ], 
  [2, 6 ] 
 ]
Output 2:

 [
  [1, 2 ],
  [3 ]
 ]
 
 
Q3. Palindrome Partitioning
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A, partition A such that every string of the partition is a palindrome.

Return all possible palindrome partitioning of A.

Ordering the results in the answer : Entry i will come before Entry j if :

len(Entryi[0]) < len(Entryj[0]) OR
(len(Entryi[0]) == len(Entryj[0]) AND len(Entryi[1]) < len(Entryj[1])) OR * * *
(len(Entryi[0]) == len(Entryj[0]) AND ... len(Entryi[k] < len(Entryj[k]))


Problem Constraints

1 <= len(A) <= 15



Input Format

First argument is a string A of lowercase characters.



Output Format

Return a list of all possible palindrome partitioning of s.



Example Input

Input 1:

A = "aab"
Input 2:

A = "a"


Example Output

Output 1:

 [
    ["a","a","b"]
    ["aa","b"],
  ]
Output 2:

 [
    ["a"]
  ]


Example Explanation

Explanation 1:

In the given example, ["a", "a", "b"] comes before ["aa", "b"] because len("a") < len("aa").
Explanation 2:

In the given example, only partition possible is "a" .


Q4. Find shortest safe route in a path with landmines
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a path in the form of a rectangular matrix of size NxM having few landmines arbitrarily placed (marked as 0), calculate length of the shortest safe route possible from any cell in the first column to any cell in the last column of the matrix.

We have to avoid landmines and their four adjacent cells (left, right, above and below) as they are also unsafe.

Note:
We are allowed to move to only adjacent cells which are not landmines. i.e. the route cannot contains any diagonal moves.


Problem Constraints

1 <= N <= 8
1 <= M <= 8
0 <= A[i][j] <= 1

It is guaranteed that the Total Number of Safe cells <= 14


Input Format

The Only Argument is the rectangular matrix of size N x M.


Output Format

Return the length of the shortest safe route as a Integer.


Example Input

Input 1:
 
A = [ [1, 1, 1],
      [1, 1, 1],
      [1, 1, 0] ]
Input 2:
 
A = [ [1, 1, 1],
      [1, 0, 1],
      [1, 1, 1] ]
Input 3:
A = [ [0, 1, 1, 1, 1],
      [1, 1, 1, 1, 1],
      [1, 1, 1, 1, 1],
      [1, 1, 1, 1, 0] ]


Example Output

Output 1:
 2
Output 2:
 -1
Output 3:
 5
 
 
Q5. Longest Possible Route in a Matrix with Hurdles
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an N x M matrix, with a few hurdles arbitrarily placed, calculate the length of the longest possible route possible from source to a destination within the matrix. If there is no path exist, return -1. Hurdles are represented as 0.

We are allowed to move to only adjacent cells which are not hurdles. The route cannot contain any diagonal moves and a location once visited in a particular path cannot be visited again.

You are given the source A, destination B and the matrix C. Return the length of the longest possible route from source to destination


Problem Constraints

1 <= N <= 10
1 <= M <= 10
4 <= N * M <= 12
0 <= A[0], B[0] < N
0 <= A[1], B[1] < M
0 <= C[i][j] <= 1

A and B are distinct


Input Format

First argument is the Source A, which is an integer array of size 2.
Second argument is the Destination B, which is an integer array of size 2.
Third argument is the Matrix C, which is a 2-D integer array consists of 0s and 1s.


Output Format

Return an Integer, which is the length of the longest possible route.


Example Input

Input 1:
A = [0, 0]
B = [2, 2]
C = [[1, 1, 1], 
     [1, 1, 1],
     [1, 1, 1]]
Input 2:
A = [0, 1]
B = [2, 0]
C = [[1, 1], 
     [0, 0],
     [1, 1]]
Input 3:
A = [1, 1]
B = [0, 3]
C = [[1, 1, 0, 1], 
     [1, 1, 0, 1],
     [1, 1, 1, 1]]


Example Output

Output 1:
8
Output 2:
-1
Output 3:
9
