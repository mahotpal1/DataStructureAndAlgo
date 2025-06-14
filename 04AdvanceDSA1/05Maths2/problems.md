Q1. Sorted Permutation Rank
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints

1 <= |A| <= 1000



Input Format

First argument is a string A.



Output Format

Return an integer denoting the rank of the given string.



Example Input

Input 1:

A = "acb"
Input 2:

A = "a"


Example Output

Output 1:

2
Output 2:

1


Example Explanation

Explanation 1:

Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
Explanation 2:

Given A = "a".
Rank is clearly 1.


Q2. Excel Column Title
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.







For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 









Problem Constraints

1 <= A <= 109



Input Format

First and only argument of input contains single integer A



Output Format

Return a string denoting the corresponding title.



Example Input

Input 1:

A = 3
Input 2:

 
A = 27


Example Output

Output 1:

"C"
Output 2:

"AA"


Example Explanation

Explanation 1:

 
3 corrseponds to C.
Explanation 2:

    1 -> A,
    2 -> B,
    3 -> C,
    ...
    26 -> Z,
    27 -> AA,
    28 -> AB 
	
	
Q3. Pascal Triangle
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Write a program to print the pascal triangle up to A rows.









Problem Constraints

1 <= A <= 25











Input Format

The first argument is an integer A.









Output Format


Return a 2D array consisting of A rows whose each row contains A integers.








Example Input

Input 1:








A = 3
Input 2:


A = 5








Example Output

Output 1:








1 0 0 
1 1 0 
1 2 1 
Output 2:

1 0 0 0 0
1 1 0 0 0
1 2 1 0 0
1 3 3 1 0
1 4 6 4 1 

Example Explanation

Explanation 1:

Row 1 = 1 0 0 
Row 2 = 1C0 1C1 0 = 1 1 0
Row 3 = 2C0 2C1 2C2 = 1 2 1

Q4. Compute nCr % m
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.




x! means factorial of x i.e. x! = 1 * 2 * 3... * x.






Problem Constraints

1 <= A * B <= 106

1 <= B <= A

1 <= C <= 106



Input Format

The first argument given is integer A ( = n).
The second argument given is integer B ( = r).
The third argument given is integer C ( = m).



Output Format

Return the value of nCr % m.



Example Input

Input 1:

 A = 5
 B = 2
 C = 13
Input 2:

 A = 6
 B = 2
 C = 13


Example Output

Output 1:

 10
Output 2:

 2


Example Explanation

Explanation 1:

 The value of 5C2 % 11 is 10.
Explanation 2:

 The value of 6C2 % 13 is 2.
 
 
Q1. Sorted Permutation Rank with Repeats
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A, find the rank of the string amongst its permutations sorted lexicographically.

Note that the characters might be repeated. If the characters are repeated, we need to look at the rank in unique permutations.

Look at the example for more details.

NOTE:

The answer might not fit in an integer, so return your answer % 1000003 where 1000003 is a prime number.
String A can consist of both lowercase and uppercase letters. Characters with lesser ASCII values are considered smaller, i.e., 'a' > 'Z'.



Problem Constraints

1 <= len(A) <= 1000000



Input Format

First argument is a string A.



Output Format

Return an integer denoting the rank.



Example Input

Input 1:

 A = "aba"
Input 2:

 A = "bca"






Example Output

Output 1:

 2
Output 2:

 4






Example Explanation

Explanation 1:


 The order permutations with letters 'a', 'a', and 'b' :
    aab
    aba 
    baa
 So, the rank is 2.
Explanation 2:

 The order permutations with letters 'a', 'b', and 'c' :
    abc
    acb 
    bac
    bca
    cab
    cba
 So, the rank is 4.
 
 
Q2. Excel Column Number
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints

1 <= length of the column title <= 5



Input Format

The only argument is a string that represents the column title in the excel sheet.



Output Format

Return a single integer that represents the corresponding column number.



Example Input

Input 1:

 AB
Input 2:

 BB


Example Output

Output 1:

 28
Output 2:

 54


Example Explanation

Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
Explanation 2:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 ...
 AZ -> 52
 BA -> 53
 BB -> 54
 

Q3. Consecutive Numbers Sum
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a positive integer A.

Return the number of ways it can be written as a sum of consecutive positive integers.



Problem Constraints

1 <= A <= 109



Input Format

The first and the only argument of input contains an integer, A.



Output Format

Return an integer, representing the answer as described in the problem statement.



Example Input

Input 1:

 A = 5
Input 2:

 A = 15


Example Output

Output 1:

 2
Output 2:

 4


Example Explanation

Explanation 1:

 The 2 ways are:
 => [5]
 => [2, 3]
Explanation 2:

 The 4 ways are:
 => [15]
 => [7, 8]
 => [4, 5, 6] 
 => [1, 2, 3, 4, 5]
 
 
 