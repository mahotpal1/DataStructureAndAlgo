Q1. Check for BST with One Child
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given preorder traversal of a binary tree, check if it is possible that it is also a preorder traversal of a Binary Search Tree (BST), where each internal node (non-leaf nodes) have exactly one child.



Problem Constraints

1 <= number of nodes <= 100000



Input Format

First and only argument is an integer array denoting the preorder traversal of binary tree.



Output Format

Return a string "YES" if true else "NO".



Example Input

Input 1:

 A : [4, 10, 5, 8]
Input 2:

 A : [1, 5, 6, 4]


Example Output

Output 1:

 "YES"
Output 2:

 "NO"


Q2. BST nodes in a range
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary search tree of integers. You are given a range B and C.

Return the count of the number of nodes that lie in the given range.



Problem Constraints

1 <= Number of nodes in binary tree <= 100000

0 <= B < = C <= 109



Input Format

First argument is a root node of the binary tree, A.

Second argument is an integer B.

Third argument is an integer C.



Output Format

Return the count of the number of nodes that lies in the given range.



Example Input

Input 1:

            15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 12
     C = 20
Input 2:

            8
           / \
          6  21
         / \
        1   7

     B = 2
     C = 20


Example Output

Output 1:

 5
Output 2:

 3
 
 

Q3. Two Sum BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.

Return 1 to denote that two such nodes exist. Return 0, otherwise.



Problem Constraints

1 <= size of tree <= 100000

1 <= B <= 109



Input Format

First argument is the head of the tree A.

Second argument is the integer B.



Output Format

Return 1 if such a pair can be found, 0 otherwise.



Example Input

Input 1:

         10
         / \
        9   20

B = 19
Input 2:

 
          10
         / \
        9   20

B = 40


Example Output

Output 1:

 1
Output 2:

 0
 
 
 

