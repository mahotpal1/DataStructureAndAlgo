Problem 1`

Q1. Copy List
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a linked list A
Each node in the linked list contains two pointers: a next pointer and a random pointer
The next pointer points to the next node in the list
The random pointer can point to any node in the list, or it can be NULL
Your task is to create a deep copy of the linked list A
The copied list should be a completely separate linked list from the original list, but with the same node values and random pointer connections as the original list
You should create a new linked list B, where each node in B has the same value as the corresponding node in A
The next and random pointers of each node in B should point to the corresponding nodes in B (rather than A)


Problem Constraints

0 <= |A| <= 106



Input Format

The first argument of input contains a pointer to the head of linked list A.



Output Format

Return a pointer to the head of the required linked list.



Example Input

Given list
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  


Example Output

   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  


Example Explanation

You should return a deep copy of the list. The returned answer should not contain the same node as the original list, but a copy of them. The pointers in the returned list should not link to any node in the original input list.




Expected Output
Enter your input as per the following guideline:
There is 1 line in the input. 

Line 1: The first number N is the number of nodes in the list. Then N numbers follow each corresponding to label of the nodes in order. Then N more numbers follow corresponding to the index of the random node. If index > N, index %= (N+1); if index == N, then random pointer points to NULL.


Problem 2:

Q2. LRU Cache
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least recently used item before inserting the new item.
The LRUCache will be initialized with an integer corresponding to its capacity. Capacity indicates the maximum number of unique keys it can hold at a time.

Definition of "least recently used" : An access to an item is defined as a get or a set operation of the item. "Least recently used" item is the one with the oldest access time.

NOTE: If you are using any global variables, make sure to clear them in the constructor.

Example :

Input : 
         capacity = 2
         set(1, 10)
         set(5, 12)
         get(5)        returns 12
         get(1)        returns 10
         get(10)       returns -1
         set(6, 14)    this pushes out key = 5 as LRU is full. 
         get(5)        returns -1 
Expected Output
Enter your input as per the following guideline:
There are 1 lines in the input

Line 1 ( Corresponds to arg 1 ) : The line starts with a pair of number numOperations, capacity. capacity is the number your constructor is initialized with. 
Then numOperation operations follow. 
Each operation is either : 
 * G  : This corresponds to a function call get()
 * S   : This corresponds to a function call set(num1, num2)
Note that the function calls are made in order.  

LRUCache::LRUCache(int capacity) {

}

int LRUCache::get(int key) {

}

void LRUCache::set(int key, int value) {

}


Problem 3

Q1. Palindrome List
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
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
 
 
Problem 4

Q2. Longest Palindromic List
Solved
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



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

