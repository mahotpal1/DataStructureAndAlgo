Q1. ZigZag Level Order Traversal BT
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary tree, return the zigzag level order traversal of its nodes values. (ie, from left to right, then right to left for the next level and alternate between).



Problem Constraints

1 <= number of nodes <= 105



Input Format

First and only argument is root node of the binary tree, A.



Output Format

Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



Example Input

Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output

Output 1:

 [
   [3],
   [20, 9],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [2, 6]
   [3]
 ]


Example Explanation

Explanation 1:

 Return the 2D array. Each row denotes the zigzag traversal of each level.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A Binary Tree, -1 signifies a NULL child, For e.g 6 9 4 -1 -1 8 -1 -1 3 -1 -1
tree-icon





Q2. Serialize Binary Tree
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given the root node of a Binary Tree denoted by A. You have to Serialize the given Binary Tree in the described format.

Serialize means encode it into a integer array denoting the Level Order Traversal of the given Binary Tree.

NOTE:

In the array, the NULL/None child is denoted by -1.
For more clarification check the Example Input.


Problem Constraints

1 <= number of nodes <= 105



Input Format

Only argument is a A denoting the root node of a Binary Tree.



Output Format

Return an integer array denoting the Level Order Traversal of the given Binary Tree.



Example Input

Input 1:

           1
         /   \
        2     3
       / \
      4   5
Input 2:

            1
          /   \
         2     3
        / \     \
       4   5     6


Example Output

Output 1:

 [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
Output 2:

 [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Explanation

Explanation 1:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5 , -1, -1, -1, -1, -1, -1].
 Since 3, 4 and 5 each has both NULL child we had represented that using -1.
Explanation 2:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1].
 Since 3 has left child as NULL while 4 and 5 each has both NULL child.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases



Q3. Deserialize Binary Tree
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given an integer array A denoting the Level Order Traversal of the Binary Tree.





You have to Deserialize the given Traversal in the Binary Tree and return the root of the Binary Tree.

NOTE:





In the array, the NULL/None child is denoted by -1.
For more clarification check the Example Input.


Problem Constraints

1 <= number of nodes <= 105

-1 <= A[i] <= 105



Input Format

Only argument is an integer array A denoting the Level Order Traversal of the Binary Tree.



Output Format

Return the root node of the Binary Tree.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
Input 2:

 A = [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Output

Output 1:

           1
         /   \
        2     3
       / \
      4   5
Output 2:

            1
          /   \
         2     3
        / \ .   \
       4   5 .   6


Example Explanation

Explanation 1:

 Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 Since 3, 4 and 5 each has both NULL child we had represented that using -1.
Explanation 2:

 Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 Since 3 has left child as NULL while 4 and 5 each has both NULL child.
 
 
 
 
 Q4. Top View of Binary tree
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a binary tree of integers denoted by root A. Return an array of integers representing the top view of the Binary tree.





The top view of a Binary Tree is a set of nodes visible when the tree is visited from the top.

Return the nodes in any order.




Problem Constraints

1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format

First and only argument is head of the binary tree A.



Output Format

Return an array, representing the top view of the binary tree.



Example Input

Input 1:

 
            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8 
Input 2:

 
            1
           /  \
          2    3
           \
            4
             \
              5


Example Output

Output 1:

 [1, 2, 4, 8, 3, 7]
Output 2:

 [1, 2, 3]


Example Explanation

Explanation 1:

Top view is described.
Explanation 2:

Top view is described.




 
 




