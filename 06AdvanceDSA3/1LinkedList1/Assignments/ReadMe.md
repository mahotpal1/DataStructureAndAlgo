Q1. Palindrome List
Problem Description
Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.

Problem Constraints
1 <= |A| <= 105

Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.

Output Format
Return 0, if the linked list is not a palindrome.
Return 1, if the linked list is a palindrome.

Example Input
Input 1:
A = [1, 2, 2, 1]
Input 2:
A = [1, 3, 2]

Example Output
Output 1:
 1 
Output 2:
 0 

Example Explanation
Explanation 1:
 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:
 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
 
 
Problem Description 2
You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.
NOTE: You have to do it in-place and in one-pass.

Problem Constraints
1 <= Length of linked list <= 105
Value of each node is within the range of a 32-bit integer.

Input Format
First and only argument is a linked-list node A.

Output Format
Return a linked-list node denoting the head of the reversed linked list.

Example Input
Input 1:
 A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
Input 2:
 A = 3 -> NULL 

Example Output
Output 1:
 5 -> 4 -> 3 -> 2 -> 1 -> NULL 
Output 2:
 3 -> NULL 
 
 
Problem 3

Q3. Linked-List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Design and implement a Linked List data structure.
A node in a linked list should have the following attributes - an integer value and a pointer to the next node.

It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space (no trailing spaces).
Note:

If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in a new line.


Problem Constraints

1 <= value <= 105
1 <= position <= n where, n is the size of the linked-list.



Input Format

First line contains an integer denoting number of cases, let's say t. Next t line denotes the cases.


Output Format

When there is a case of print_ll(), Print the entire linked list, such that each element is followed by a single space.

There should not be any trailing space.

NOTE: You don't need to return anything.


Example Input

Input 1:
5
i 1 23
i 2 24
p
d 1
p
Input 2:
3
i 1 54
d 10
p


Example Output

Output 1:
23 24
24
Output 2:
54


Example Explanation

Explanation 1:
After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.
Explanation 2:
After the first case,  linked list contains: 54

At second case delete value at 10th position,  
Since the position is higher than the length of the linkedlist. 
It does not satisfy the constraint, So no action is required.

At third case print: 54.