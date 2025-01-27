Q2. Identical Binary Trees
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two binary trees, check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.




Problem Constraints

1 <= number of nodes <= 105



Input Format

The first argument is a root node of the first tree, A.

The second argument is a root node of the second tree, B.




Output Format

Return 0 / 1 ( 0 for false, 1 for true ) for this problem.



Example Input

Input 1:

   1       1
  / \     / \
 2   3   2   3
Input 2:

   1       1
  / \     / \
 2   3   3   3


Example Output

Output 1:

 1
Output 2:

 0
 
 
 
 Q3. Sum binary tree or not
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary tree. Check whether the given tree is a Sum-binary Tree or not.

Sum-binary Tree is a Binary Tree where the value of a every node is equal to sum of the nodes present in its left subtree and right subtree.

An empty tree is Sum-binary Tree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Return 1 if it sum-binary tree else return 0.



Problem Constraints

1 <= length of the array <= 100000

0 <= node values <= 50



Input Format

The only argument given is the root node of tree A.



Output Format

Return 1 if it is sum-binary tree else return 0.



Example Input

Input 1:

       26
     /    \
    10     3
   /  \     \
  4   6      3
Input 2:

       26
     /    \
    10     3
   /  \     \
  4   6      4


Example Output

Output 1:

 1
Output 2:

 0