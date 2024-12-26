Q1. Partition List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a linked list A and a value B, partition it such that all nodes less than B come before nodes greater than or equal to B.

You should preserve the original relative order of the nodes in each of the two partitions.



Problem Constraints

1 <= |A| <= 106

1 <= A[i], B <= 109



Input Format

The first argument of input contains a pointer to the head to the given linked list.

The second argument of input contains an integer, B.



Output Format

Return a pointer to the head of the modified linked list.



Example Input

Input 1:

A = [1, 4, 3, 2, 5, 2]
B = 3
Input 2:

A = [1, 2, 3, 1, 3]
B = 2


Example Output

Output 1:

[1, 2, 2, 4, 3, 5]
Output 2:

[1, 1, 2, 3, 3]


Example Explanation

Explanation 1:

 [1, 2, 2] are less than B wheread [4, 3, 5] are greater than or equal to B.
Explanation 2:

 [1, 1] are less than B wheread [2, 3, 3] are greater than or equal to B.
 
 
Q2. Flatten a linked list
Unsolved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a linked list where every node represents a linked list and contains two pointers of its type:

Pointer to next node in the main list (right pointer)
Pointer to a linked list where this node is head (down pointer). All linked lists are sorted.
You are asked to flatten the linked list into a single list. Use down pointer to link nodes of the flattened list. The flattened linked list should also be sorted.



Problem Constraints

1 <= Total nodes in the list <= 100000

1 <= Value of node <= 109



Input Format

The only argument given is head pointer of the doubly linked list.



Output Format

Return the head pointer of the Flattened list.



Example Input

Input 1:

   3 -> 4 -> 20 -> 20 ->30
   |    |    |     |    |
   7    11   22    20   31
   |               |    |
   7               28   39
   |               |
   8               39
Input 2:

   2 -> 4 
   |    |       
   7    11    
   |            
   7


Example Output

Output 1:

 3 -> 4 -> 7 -> 7 -> 8 -> 11 -> 20 -> 20 -> 20 -> 22 -> 28 -> 30 -> 31 -> 39 -> 39 
Output 2:

 2 -> 4 -> 7 -> 7 -> 11
 
 
 Q3. Intersection of Linked Lists
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a program to find the node at which the intersection of two singly linked lists, A and B, begins. For example, the following two linked lists:

A:          a1 → a2
                   ->
                     c1 → c2 → c3
                   ->
B:     b1 → b2 → b3
NOTE:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
The custom input to be given is different than the one explained in the examples. Please be careful.


Problem Constraints

0 <= |A|, |B| <= 106



Input Format

The first argument of input contains a pointer to the head of the linked list A.

The second argument of input contains a pointer to the head of the linked list B.



Output Format

Return a pointer to the node after which the linked list is intersecting.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = [6, 3, 4, 5]
Input 2:

 A = [1, 2, 3]
 B = [4, 5]


Example Output

Output 1:

 [3, 4, 5]
Output 2:

 []


Example Explanation

Explanation 1:

 In the first example, the nodes have the same values after 3rd node in A and 2nd node in B. Thus, the linked lists are intersecting after that point. 
Explanation 2:

 In the second example, the nodes don't have the same values, thus we can return None/Null. 