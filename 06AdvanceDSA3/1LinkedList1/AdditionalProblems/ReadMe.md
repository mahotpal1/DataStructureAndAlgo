Q1. Longest Palindromic List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a linked list of integers. Find and return the length of the longest palindrome list that exists in that linked list.

A palindrome list is a list that reads the same backward and forward.

Expected memory complexity : O(1)



Problem Constraints

1 <= length of the linked list <= 2000

1 <= Node value <= 100



Input Format

The only argument given is head pointer of the linked list.



Output Format

Return the length of the longest palindrome list.



Example Input

Input 1:

 2 -> 3 -> 3 -> 3
Input 2:

 2 -> 1 -> 2 -> 1 ->  2 -> 2 -> 1 -> 3 -> 2 -> 2


Example Output

Output 1:

 3
Output 2:

 5


Example Explanation

Explanation 1:

 3 -> 3 -> 3 is largest palindromic sublist
Explanation 2:

 2 -> 1 -> 2 -> 1 -> 2 is largest palindromic sublist.
 
 
Q2. Reverse Link List II
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.



Problem Constraints

1 <= |A| <= 106

1 <= B <= C <= |A|



Input Format

The first argument contains a pointer to the head of the given linked list, A.

The second arugment contains an integer, B.

The third argument contains an integer C.



Output Format

Return a pointer to the head of the modified linked list.



Example Input

Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4

Input 2:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5


Example Output

Output 1:

 1 -> 4 -> 3 -> 2 -> 5
Output 2:

 5 -> 4 -> 3 -> 2 -> 1


Example Explanation

Explanation 1:

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5 
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5 
Explanation 2:

 In the second example, we want to reverse the highlighted part of the given linked list : 1 -> 4 -> 3 -> 2 -> 5  
 Thus, the output is 5 -> 4 -> 3 -> 2 -> 1 



 
Q3. K reverse linked list
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.



Problem Constraints

1 <= |A| <= 103

B always divides A



Input Format

The first argument of input contains a pointer to the head of the linked list.

The second arugment of input contains the integer, B.



Output Format

Return a pointer to the head of the modified linked list.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output

Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]


Example Explanation

Explanation 1:

 For the first example, the list can be reversed in groups of 2.
    [[1, 2], [3, 4], [5, 6]]
 After reversing the K-linked list
    [[2, 1], [4, 3], [6, 5]]
Explanation 2:

 For the second example, the list can be reversed in groups of 3.
    [[1, 2, 3], [4, 5, 6]]
 After reversing the K-linked list
    [[3, 2, 1], [6, 5, 4]] 


Q4. Remove Nth Node from List End
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a linked list A, remove the B-th node from the end of the list and return its head.
For example, given linked list: 1->2->3->4->5, and B = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

NOTE: If B is greater than the size of the list, remove the first node of the list.

Try doing it using constant additional space.



Problem Constraints

1 <= |A| <= 106


Input Format

The first argument of input contains a pointer to the head of the linked list. The second argument of input contains the integer B.


Output Format

Return the head of the linked list after deleting the B-th element from the end.


Example Input

Input 1:
A = 1->2->3->4->5
B = 2
Input 2:
A = 1
B = 1


Example Output

Output 1:
1->2->3->5
Output 2:
Example Explanation

Explanation 1:
In the first example, 4 is the second last element.
Explanation 2:
In the second example, 1 is the first and the last element.


Q5. Remove Duplicates from Sorted List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a sorted linked list, delete all duplicates such that each element appears only once.



Problem Constraints

0 <= length of linked list <= 106



Input Format

First argument is the head pointer of the linked list.



Output Format

Return the head pointer of the linked list after removing all duplicates.



Example Input

Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output

Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation

Explanation 1:

 Each element appear only once in 1->2.
