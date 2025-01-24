Q1. Search in BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a Binary Search Tree A. Check whether there exists a node with value B in the BST.


Problem Constraints

1 <= Number of nodes in binary tree <= 105

0 <= B <= 106



Input Format

First argument is a root node of the binary tree, A.

Second argument is an integer B.



Output Format

Return 1 if such a node exist and 0 otherwise



Example Input

Input 1:

            15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 16
Input 2:

            8
           / \
          6  21
         / \
        1   7

     B = 9


Example Output

Output 1:

 1
Output 2:

 0
 
 
 
Q2. Delete a node in BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a Binary Search Tree(BST) A. If there is a node with value B present in the tree delete it and return the tree.

Note - If there are multiple options, always replace a node by its in-order predecessor


Problem Constraints

2 <= No. of nodes in BST <= 105
1 <= value of nodes <= 109
Each node has a unique value


Input Format

The first argument is the root node of a Binary Search Tree A.
The second argument is the value B.


Output Format

Delete the given node if found and return the root of the BST.


Example Input

Input 1:

            15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 10

Input 2:

            8
           / \
          6  21
         / \
        1   7

     B = 6



Example Output

Output 1:

            15
          /    \
        12      20
        / \    /  \
       8  14  16  27

Output 2:

            8
           / \
          1  21
           \
            7



dQ3. Sorted Array To Balanced BST
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).

Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



Problem Constraints

1 <= length of array <= 100000



Input Format

First argument is an integer array A.



Output Format

Return a root node of the Binary Search Tree.



Example Input

Input 1:

 A : [1, 2, 3]
Input 2:

 A : [1, 2, 3, 5, 10]


Example Output

Output 1:

      2
    /   \
   1     3
Output 2:

      3
    /   \
   2     5
  /       \
 1         10



Q4. Valid Binary Search Tree
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a binary tree represented by root A. You need to check if it is a Binary Search Tree or not.


Assume a BST is defined as follows:

1) The left subtree of a node contains only nodes with keys less than the node's key.

2) The right subtree of a node contains only nodes with keys greater than the node's key.

3) Both the left and right subtrees must also be binary search trees.





Problem Constraints

1 <= Number of nodes in binary tree <= 105





0 <= node values <= 232-1





Input Format

First and only argument is head of the binary tree A.



Output Format

Return 0 if false and 1 if true.



Example Input

Input 1:

 
   1
  /  \
 2    3
Input 2:

 
  2
 / \
1   3


Example Output

Output 1:

 0
Output 2:

 1


 