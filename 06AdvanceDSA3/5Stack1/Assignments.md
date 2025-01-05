Q1. Passing game
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.


Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.

There are two kinds of passes:

1) ID

2) 0

For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.

For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.

In the second kind of pass "0" just means Back Pass.

Return the ID of the player who currently possesses the ball.




Problem Constraints

1 <= A <= 100000


1 <= B <= 100000

|C| = A



Input Format

The first argument of the input contains the number A.


The second argument of the input contains the number B ( id of the player possessing the ball in the very beginning).

The third argument is an array C of size A having (ID/0).



Output Format

Return the "ID" of the player who possesses the ball after A passes.



Example Input

Input 1:

 A = 10
 B = 23
 C = [86, 63, 60, 0, 47, 0, 99, 9, 0, 0]
Input 2:

 A = 1
 B = 1
 C = [2]


Example Output

Output 1:

 63
Output 2:

 2
 
 
Q2. Balanced Paranthesis
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints

1 <= |A| <= 100



Input Format

The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format

Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input

Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[] 


Example Output

Output 1:

 1 
Output 2:

 0 
Output 3:

 1 

Q3. Double Character Trouble
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You have a string, denoted as A.

To transform the string, you should perform the following operation repeatedly:
Identify the first occurrence of consecutive identical pairs of characters within the string.
Remove this pair of identical characters from the string.
Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
The final result will be the transformed string.


Problem Constraints

1 <= |A| <= 100000



Input Format

First and only argument is string A.



Output Format

Return the final string.



Example Input

Input 1:


 A = "abccbc"

Input 2:


 A = "ab"



Example Output

Output 1:

 "ac"
Output 2:

 "ab"
 
Q4. Evaluate Expression
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.


Valid operators are +, -, *, /. Each string may be an integer or an operator.

Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.



Problem Constraints

1 <= N <= 105



Input Format

The only argument given is string array A.



Output Format

Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input

Input 1:
A =   ["2", "1", "+", "3", "*"]
Input 2:
A = ["4", "13", "5", "/", "+"]


Example Output

Output 1:
9
Output 2:
6


