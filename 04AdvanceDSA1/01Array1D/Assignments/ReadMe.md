Q1. Max Sum Contiguous Subarray
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Find the maximum sum of contiguous non-empty subarray within an array A of length N.



Problem Constraints

1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format

The first and the only argument contains an integer array, A.



Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input

Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output

Output 1:

 10 
Output 2:

 6 


Example Explanation

Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6
 
 
 Q2. Continuous Sum Query
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B


Problem Constraints

1 <= A <= 2 * 105
1 <= L <= R <= A
1 <= P <= 103
0 <= len(B) <= 105


Input Format

The first argument is a single integer A.
The second argument is a 2D integer array B.


Output Format

Return an array(0 based indexing) that stores the total number of coins in each beggars pot.


Example Input

Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]


Example Output

Output 1:-
10 55 45 25 25


Example Explanation

Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]



Q3. Rain Water Trapped
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

Example:

The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.


Rain Water Trapped




Problem Constraints

1 <= |A| <= 105
0 <= A[i] <= 105



Input Format

First and only argument is the Integer Array, A.



Output Format

Return an Integer, denoting the total amount of water that can be trapped in these valleys



Example Input

Input 1:

 A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output

Output 1:

1
Output 2:

0