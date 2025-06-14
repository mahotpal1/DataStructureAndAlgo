Q1. Count of divisors
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A, find and return the count of divisors of each element of the array.







NOTE: The order of the resultant array should be the same as the input array.










Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 106



Input Format

The only argument given is the integer array A.



Output Format

Return the count of divisors of each element of the array in the form of an array.



Example Input

Input 1:

 A = [2, 3, 4, 5]
Input 2:

 A = [8, 9, 10]


Example Output

Output 1:

 [2, 2, 3, 2]
Output 1:

 [4, 3, 4]


Example Explanation

Explanation 1:

 The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 So the count will be [2, 2, 3, 2].
Explanation 2:

 The number of divisors of 8 : [1, 2, 4, 8], 9 : [1, 3, 9], 10 : [1, 2, 5, 10]
 So the count will be [4, 3, 4].



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

Q2. Number Of Open Doors
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer A, which denotes the number of doors in a row numbered 1 to A. All the doors are closed initially.





A person moves to and fro, changing the states of the doors as follows: the person opens a door that is already closed and closes a door that is already opened.

In the first go, he/she alters the states of doors numbered 1, 2, 3, … , A.
In the second go, he/she alters the states of doors numbered 2, 4, 6 ….
In the third go, he/she alters the states of doors numbered 3, 6, 9 …
This continues till the A'th go in, which you alter the state of the door numbered A.

Find and return the number of open doors at the end of the procedure.







Problem Constraints

1 <= A <= 109



Input Format

The only argument given is integer A.



Output Format

Return the number of open doors at the end of the procedure.



Example Input

Input 1:

 A = 5
Input 2:

 A = 6


Example Output

Output 1:

 2
Output 2:

 2 


Example Explanation

Input 1:

 In the first go, he/she alters the states of doors numbered 1, 2, 3, 4, 5. Now, all doors are open.
 In the second go, he/she closes the doors numbered 2, 4.
 In the third go, he/she closes the door numbered 3.
 In the fourth go, he/she open the door numbered 4.
 In the fifth go, he/she closes the door numbered 5.
 Doors opened at the end are 1 and 4.
Input 2:

 In the first go, he/she alters the states of doors numbered 1, 2, 3, 4, 5, 6. Now, all doors are open.
 In the second go, he/she closes the doors numbered 2, 4, 6.
 In the third go, he/she closes the door numbered 3 and opens door 6.
 In the fourth go, he/she open the door numbered 4.
 In the fifth go, he/she closes the door numbered 5.
 In the sixth go, he/she closes the door numbered 6.
 Doors opened at the end are 1 and 4.



Q3. Find All Primes
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer A. Find the list of all prime numbers in the range [1, A].


Problem Constraints

1 <= A <= 106



Input Format

Only argument A is an integer.



Output Format

Return a sorted array of prime number in the range [1, A].



Example Input

Input 1:
A = 7
Input 2:
A = 12


Example Output

Output 1:
[2, 3, 5, 7]
Output 2:
[2, 3, 5, 7, 11]


Example Explanation

For Input 1:
The prime numbers from 1 to 7 are 2, 3, 5 and 7.
For Input 2:
The prime numbers from 1 to 12 are 2, 3, 5, 7 and 11.



Q1. Factorial Array
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Groot has an array A of size N. However, seeking excitement, Groot embarked on constructing an equally-sized array B with a unique definition for each of its elements:

B[i] = factorial of A[i] for every i such that 1<= i <= N.

Now Groot is interested in the total number of non-empty subsequences of array B such that every element in the subsequence has the same non-empty set of prime factors.

Since the number can be huge, return it modulo 109 + 7.

NOTE:

Factorial of a number X denotes (1 x 2 x 3 x 4......(X-1) x (X)).
A set is a data structure having only distinct elements. E.g : the set of prime factors of Y=12 will be {2,3} and not {2,2,3}






Problem Constraints

1 <= N <= 105
1 <= A[i] <= 106



Input Format

Only argument is an integer array A of size N.



Output Format

Return an integer deonting the total number of non-empty subsequences of array B such that every element in the subsequence has the same set of prime factors modulo 109+7.



Example Input

Input 1:

 A = [2, 3, 2, 3]
Input 2:

 A = [2, 3, 4]






Example Output

Output 1:

 6
Output 2:

 4
 
 
Q2. Prime Sum
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.







If there is more than one solution possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then 
[a, b] < [c, d], If a < c OR a==c AND b < d. 
NOTE: A solution will always exist. Read Goldbach's conjecture.








Problem Constraints

4 <= A <= 2*107



Input Format

First and only argument of input is an even number A.



Output Format

Return a integer array of size 2 containing primes whose sum will be equal to given number.



Example Input

 4


Example Output

 [2, 2]


Example Explanation

 There is only 1 solution for A = 4.
 
 
Q3. Lucky Numbers
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

A lucky number is a number that has exactly 2 distinct prime divisors.





You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).







Problem Constraints

1 <= A <= 50000



Input Format

The first and only argument is an integer A.



Output Format

Return an integer i.e the count of lucky numbers between 1 and A, both inclusive.



Example Input

Input 1:

 A = 8
Input 2:

 A = 12


Example Output

Output 1:

 1
Output 2:

 3


Example Explanation

Explanation 1:

 Between [1, 8] there is only 1 lucky number i.e 6.
 6 has 2 distinct prime factors i.e 2 and 3.
Explanation 2:

 Between [1, 12] there are 3 lucky number: 6, 10 and 12.