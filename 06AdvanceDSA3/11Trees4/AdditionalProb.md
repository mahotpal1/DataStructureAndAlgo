Q1. Common Nodes in Two BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two BST's A and B, return the (sum of all common nodes in both A and B) % (109 +7) .

In case there is no common node, return 0.

NOTE:

Try to do it one pass through the trees.



Problem Constraints

1 <= Number of nodes in the tree A and B <= 105

1 <= Node values <= 106



Input Format

First argument represents the root of BST A.

Second argument represents the root of BST B.



Output Format

Return an integer denoting the (sum of all common nodes in both BST's A and B) % (109 +7) .



Example Input

Input 1:

 Tree A:
    5
   / \
  2   8
   \   \
    3   15
        /
        9

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11
Input 2:

  Tree A:
    7
   / \
  1   10
   \   \
    2   15
        /
       11

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11


Example Output

Output 1:

 17
Output 2:

 46
 
 
Q2. Distance between Nodes of BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary search tree.
Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.

NOTE: Distance between two nodes is number of edges between them.



Problem Constraints

1 <= Number of nodes in binary tree <= 1000000

0 <= node values <= 109



Input Format

First argument is a root node of the binary tree, A.

Second argument is an integer B.

Third argument is an integer C.



Output Format

Return an integer denoting the distance between two nodes with given two keys B and C



Example Input

Input 1:

    
         5
       /   \
      2     8
     / \   / \
    1   4 6   11
 B = 2
 C = 11
Input 2:

    
         6
       /   \
      2     9
     / \   / \
    1   4 7   10
 B = 2
 C = 6


Example Output

Output 1:

 3
Output 2:

 1
 
 