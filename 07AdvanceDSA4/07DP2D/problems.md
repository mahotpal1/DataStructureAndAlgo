Q1. N digit numbers
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Find out the number of A digit positive numbers, whose digits on being added equals to a given number B.

Note that a valid number starts from digits 1-9 except the number 0 itself. i.e. leading zeroes are not allowed.

Since the answer can be large, output answer modulo 1000000007



Problem Constraints

1 <= A <= 1000

1 <= B <= 10000



Input Format

First argument is the integer A

Second argument is the integer B



Output Format

Return a single integer, the answer to the problem



Example Input

Input 1:

 A = 2
 B = 4
Input 2:

 A = 1
 B = 3


Example Output

Output 1:

 4
Output 2:

 1


Example Explanation

Explanation 1:

 Valid numbers are {22, 31, 13, 40}
 Hence output 4.
Explanation 2:

 Only valid number is 3
 
 
Q2. Unique Paths in a Grid
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a grid of size n * m, lets assume you are starting at (1,1) and your goal is to reach (n, m). 
At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).

Now consider if some obstacles are added to the grids. 
Return the total number unique paths from (1, 1) to (n, m).

Note: 
1. An obstacle is marked as 1 and empty space is marked 0 respectively in the grid.
2. Given Source Point and Destination points are 1-based index.



Problem Constraints

1 <= n, m <= 100
A[i][j] = 0 or 1


Input Format

Firts and only argument A is a 2D array of size n * m.


Output Format

Return an integer denoting the number of unique paths from (1, 1) to (n, m).


Example Input

Input 1:

 A = [
        [0, 0, 0]
        [0, 1, 0]
        [0, 0, 0]
     ]
Input 2:

 A = [
        [0, 0, 0]
        [1, 1, 1]
        [0, 0, 0]
     ]


Example Output

Output 1:

 2
Output 2:

 0


Example Explanation

Explanation 1:

 Possible paths to reach (n, m): {(1, 1), (1, 2), (1, 3), (2, 3), (3, 3)} and {(1 ,1), (2, 1), (3, 1), (3, 2), (3, 3)}  
 So, the total number of unique paths is 2. 
Explanation 2:

 It is not possible to reach (n, m) from (1, 1). So, ans is 0.
 
 
 
Q3. Dungeon Princess
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

Given a 2D array of integers A of size M x N. Find and return the knight's minimum initial health so that he is able to rescue the princess.



Problem Constraints

1 <= M, N <= 500

-100 <= A[i] <= 100



Input Format

First and only argument is a 2D integer array A denoting the grid of size M x N.



Output Format

Return an integer denoting the knight's minimum initial health so that he is able to rescue the princess.



Example Input

Input 1:

 A = [ 
       [-2, -3, 3],
       [-5, -10, 1],
       [10, 30, -5]
     ]
Input 2:

 A = [ 
       [1, -1, 0],
       [-1, 1, -1],
       [1, 0, -1]
     ]


Example Output

Output 1:

 7
Output 2:

 1


Example Explanation

Explanation 1:

 Initially knight is at A[0][0].
 If he takes the path RIGHT -> RIGHT -> DOWN -> DOWN, the minimum health required will be 7.
 At (0,0) he looses 2 health, so health becomes 5.
 At (0,1) he looses 3 health, so health becomes 2.
 At (0,2) he gains 3 health, so health becomes 5.
 At (1,2) he gains 1 health, so health becomes 6.
 At (2,2) he looses 5 health, so health becomes 1.
 At any point, the health point doesn't drop to 0 or below. So he can rescue the princess with minimum health 7.
 
Explanation 2:

 Take the path DOWN -> DOWN ->RIGHT -> RIGHT, the minimum health required will be 1.
 
 
 
Q4. Unique Binary Search Trees II
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer A, how many structurally unique BST's (binary search trees) exist that can store values 1...A?



Problem Constraints

1 <= A <=18



Input Format

First and only argument is the integer A



Output Format

Return a single integer, the answer to the problem



Example Input

Input 1:

 1
Input 2:

 2


Example Output

Output 1:

 1
Output 2:

 2


Example Explanation

Explanation 1:

 Only single node tree is possible.
Explanation 2:

 2 trees are possible, one rooted at 1 and other rooted at 2.
 
 
 
Q1. Min Sum Path in Matrix
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a M x N grid A of integers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Return the minimum sum of the path.

NOTE: You can only move either down or right at any point in time.



Problem Constraints

1 <= M, N <= 2000

-1000 <= A[i][j] <= 1000



Input Format

First and only argument is a 2-D grid A.



Output Format

Return an integer denoting the minimum sum of the path.



Example Input

Input 1:

 A = [
       [1, 3, 2]
       [4, 3, 1]
       [5, 6, 1]
     ]
Input 2:

 A = [
       [1, -3, 2]
       [2, 5, 10]
       [5, -5, 1]
     ]


Example Output

Output 1:

 8
Output 2:

 -1


Example Explanation

Explanation 1:

 The path will be: 1 -> 3 -> 2 -> 1 -> 1.
Input 2:

 The path will be: 1 -> -3 -> 5 -> -5 -> 1.
 
 
 
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


Example Explanation

Explanation 1:


 As the max area rectangle is created by the 2x2 rectangle created by (0, 1), (0, 2), (1, 1) and (1, 2).
Explanation 2:

 As the max area rectangle is created by the 1x3 rectangle created by (1, 0), (1, 1) and (1, 2).
 
 
 
Q3. Min Sum Path in Triangle
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.








Adjacent numbers for jth column of ith row is jth and (j+1)th column of (i + 1)th row








Problem Constraints

|A| <= 1000

A[i] <= 1000



Input Format

First and only argument is the vector of vector A defining the given triangle



Output Format

Return the minimum sum



Example Input

Input 1:

 
A = [ 
         [2],
        [3, 4],
       [6, 5, 7],
      [4, 1, 8, 3]
    ]
Input 2:

 A = [ [1] ]


Example Output

Output 1:

 11
Output 2:

 1


Example Explanation

Explanation 1:

 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
Explanation 2:

 Only 2 can be collected.
 
 
Q4. Intersecting Chords in a Circle
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a number A, return number of ways you can draw A chords in a circle with 2 x A points such that no 2 chords intersect.

Two ways are different if there exists a chord which is present in one way and not in other.
Return the answer modulo 109 + 7.



Problem Constraints

1 <= A <= 103



Input Format

The first and the only argument contains the integer A.



Output Format

Return an integer answering the query as described in the problem statement.



Example Input

Input 1:

 A = 1
Input 2:

 A = 2


Example Output

Output 1:

 1
Output 2:

 2


Example Explanation

Explanation 1:

 If points are numbered 1 to 2 in clockwise direction, then different ways to draw chords are: {(1-2)} only. So, we return 1.
Explanation 2:

 If points are numbered 1 to 4 in clockwise direction, then different ways to draw chords are:{(1-2), (3-4)} and {(1-4), (2-3)}.
 So, we return 2.