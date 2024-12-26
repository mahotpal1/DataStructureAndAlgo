Q1. Middle element of linked list
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a linked list of integers, find and return the middle element of the linked list.



NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.





Problem Constraints

1 <= length of the linked list <= 100000

1 <= Node value <= 109



Input Format

The only argument given head pointer of linked list.



Output Format

Return the middle element of the linked list.



Example Input

Input 1:

 1 -> 2 -> 3 -> 4 -> 5
Input 2:

 1 -> 5 -> 6 -> 2 -> 3 -> 4


Example Output

Output 1:

 3
Output 2:

 2


Example Explanation

Explanation 1:

 The middle element is 3.
Explanation 2:

 The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.
 
 
 Q2. Merge Two Sorted Lists
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Merge two sorted linked lists, A and B, and return it as a new list.




The new list should be made by splicing together the nodes of the first two lists and should also be sorted.






Problem Constraints

0 <= |A|, |B| <= 105



Input Format

The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format

Return a pointer to the head of the merged linked list.



Example Input

Input 1:

 A = 5 -> 8 -> 20
 B = 4 -> 11 -> 15
Input 2:

 A = 1 -> 2 -> 3
 B = Null


Example Output

Output 1:

 4 -> 5 -> 8 -> 11 -> 15 -> 20
Output 2:

 1 -> 2 -> 3


Example Explanation

Explanation 1:

 Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20 
Explanation 2:

 We don't need to merge as B is empty. 
 
 
 
 Q3. Sort List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Sort a linked list, A in O(n log n) time.



Problem Constraints

0 <= |A| = 105



Input Format

The first and the only arugment of input contains a pointer to the head of the linked list, A.



Output Format

Return a pointer to the head of the sorted linked list.



Example Input

Input 1:

A = [3, 4, 2, 8]
Input 2:

A = [1]


Example Output

Output 1:

[2, 3, 4, 8]
Output 2:

[1]


Example Explanation

Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
Explanation 2:

 The sorted form of [1] is [1].
 
 
 Q4. Remove Loop from Linked List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are using Google Maps to help you find your way around a new place. But, you get lost and end up walking in a circle. Google Maps has a way to keep track of where you've been with the help of special sensors.These sensors notice that you're walking in a loop, and now, Google wants to create a new feature to help you figure out exactly where you started going in circles.

Here's how we can describe the challenge in simpler terms: You have a Linked List A that shows each step of your journey, like a chain of events. Some of these steps have accidentally led you back to a place you've already been, making you walk in a loop. The goal is to find out the exact point where you first started walking in this loop, and then you want to break the loop by not going in the circle just before this point.




Problem Constraints

1 <= number of nodes <= 1000



Input Format

The first of the input contains a LinkedList, where the first number is the number of nodes N, and the next N nodes are the node value of the linked list.
The second line of the input contains an integer which denotes the position of node where cycle starts.



Output Format

return the head of the updated linked list.



Example Input

Input 1:

 
1 -> 2
^    |
| - - 
Input 2:

3 -> 2 -> 4 -> 5 -> 6
          ^         |
          |         |    
          - - - - - -


Example Output

Output 1:

 1 -> 2 -> NULL
Output 2:

 3 -> 2 -> 4 -> 5 -> 6 -> NULL


Example Explanation

Explanation 1:

 Chain of 1->2 is broken.
Explanation 2:

 Chain of 4->6 is broken.