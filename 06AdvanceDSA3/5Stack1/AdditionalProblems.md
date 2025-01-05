Q1. Min Stack
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Design a stack that supports push, pop, top, and retrieve the minimum element in constant time.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
NOTE:
All the operations have to be constant time operations.
getMin() should return -1 if the stack is empty.
pop() should return nothing if the stack is empty.
top() should return -1 if the stack is empty.
Problem Constraints

1 <= Number of Function calls <= 107
Input Format

Functions will be called by the checker code automatically.
Output Format

Each function should return the values as defined by the problem statement.
Example Input

Input 1:
push(1)
push(2)
push(-2)
getMin()
pop()
getMin()
top()
Input 2:
getMin()
pop()
top()
Example Output

Output 1:
 -2 1 2
Output 2:
 -1 -1
 
 
 
Q2. Infix to Postfix
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given string A denoting an infix expression. Convert the infix expression into a postfix expression.


String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are operands and ^, /, *, +, - are operators.

Find and return the postfix expression of A.

NOTE:

^ has the highest precedence.
/ and * have equal precedence but greater than + and -.
+ and - have equal precedence and lowest precedence among given operators.



Problem Constraints

1 <= length of the string <= 500000



Input Format

The only argument given is string A.



Output Format

Return a string denoting the postfix conversion of A.



Example Input

Input 1:

 A = "x^y/(a*z)+b"
Input 2:

 A = "a+b*(c^d-e)^(f+g*h)-i"


Example Output

Output 1:

 "xy^az*/b+"
Output 2:

 "abcd^e-fgh*+^*+i-"
 
 
Q3. Redundant Braces
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.


Check whether A has redundant braces or not.

NOTE: A will be always a valid expression and will not contain any white spaces.



Problem Constraints

1 <= |A| <= 105



Input Format

The only argument given is string A.



Output Format

Return 1 if A has redundant braces else, return 0.



Example Input

Input 1:


 A = "((a+b))"
Input 2:

 A = "(a+(a+b))"






Example Output

Output 1:


 1
Output 2:

 0



Example Explanation

Explanation 1:


 ((a+b)) has redundant braces so answer will be 1.
Explanation 2:

 (a+(a+b)) doesn't have have any redundant braces so answer will be 0.
 
 
Q4. Check two bracket expressions
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two strings A and B. Each string represents an expression consisting of lowercase English alphabets, '+', '-', '(' and ')'.


The task is to compare them and check if they are similar. If they are identical, return 1 else, return 0.

NOTE: It may be assumed that there are at most 26 operands from ‘a’ to ‘z’, and every operand appears only once.




Problem Constraints

1 <= length of the each String <= 100



Input Format

The given arguments are string A and string B.



Output Format

Return 1 if they represent the same expression else return 0.



Example Input

Input 1:

 A = "-(a+b+c)"
 B = "-a-b-c"
Input 2:

 A = "a-b-(c-d)"
 B = "a-b-c-d"


Example Output

Output 1:

 1
Output 2:

 0
 