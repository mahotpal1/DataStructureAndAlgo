Q1. Reversing Elements Of Queue
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array, 
leaving the other elements in the same relative order. 

NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.


Problem Constraints

1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000


Input Format

The argument given is the integer array A and an integer B.


Output Format

Return an array of integer after reversing the first B elements of A using queue.


Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
Input 2:

 A = [5, 17, 100, 11]
 B = 2
 
Q2. N integers containing only 1, 2 & 3
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.


NOTE: All the A integers will fit in 32-bit integers.




Problem Constraints

1 <= A <= 29500



Input Format

The only argument given is integer A.



Output Format

Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.



Example Input

Input 1:

 A = 3
Input 2:

 A = 7


Example Output

Output 1:

 [1, 2, 3]
Output 2:

 [1, 2, 3, 11, 12, 13, 21]
 
 
Q3. Sum of min and max
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of both positive and negative integers.



Your task is to compute the sum of minimum and maximum elements of all sub-array of size B.

NOTE: Since the answer can be very large, you are required to return the sum modulo 109 + 7.





Problem Constraints

1 <= size of array A <= 105

-109 <= A[i] <= 109

1 <= B <= size of array



Input Format

The first argument denotes the integer array A.
The second argument denotes the value B



Output Format

Return an integer that denotes the required value.



Example Input

Input 1:

 A = [2, 5, -1, 7, -3, -1, -2]
 B = 4
Input 2:

 A = [2, -1, 3]
 B = 2


Example Output

Output 1:

 18
Output 2:

 3
 

Q4. Unique Letter
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Imagine you're a teacher. You ask students to call out a letter one by one. After each letter, you jot down the very first letter that's only been called out once. If all letters have been repeated, you write "#".

Here's a scenario:

A student says "a". It's the first letter. You write "a".
Next, a student says "b", "a" is still unique, so you add "a". Now it's "aa".
A student says "a" again. Now, "b" is the unique one. You add "b", making it "aab".
A student says "b". All letters so far are repeated. You add "#". It becomes "aab#".
A student says "c". "c" is unique. You add "c". The final is "aab#c".
Your task? Given the sequence the students call out A, determine the string on the board.





Problem Constraints

1 <= |A| <= 100000



Input Format

The only argument given is string A.



Output Format

Return a string after processing the stream of lowercase alphabets A.



Example Input

Input 1:

 A = "abadbc"
Input 2:

 A = "abcabc"


Example Output

Output 1:

"aabbdd"
Output 2:

"aaabc#"

