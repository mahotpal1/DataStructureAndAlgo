Q1. Boring substring
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.


A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.




Problem Constraints

1 <= |A| <= 105



Input Format

The only argument given is a string A.



Output Format

Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Example Input

Input 1:


 A = "abcd"
Input 2:

 A = "aab"





Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 String A can be rearranged into "cadb" or "bdac" 
Explanation 2:

 No arrangement of string A can make it free of boring substrings.
 
 int Solution::solve(string A) {
    set<char> my_set;

    for(auto s: A){
        my_set.insert(s);
    }

    if(my_set.size() > 3){
        return 1;
    }
    return 0;
}



Q2. Rabin Karp
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given two string A and B of length N and M respectively consisting of lowercase letters. Find the number of occurrences of B in A.


Problem Constraints

1 <= M <= N <= 105



Input Format

Two argument A and B are strings


Output Format

Return an integer denoting the number of occurrences of B in A


Example Input

Input 1:
A = "acbac"
B = "ac"
Input 2:
A = "aaaa"
B = "aa"


Example Output

Output 1:
2
Output 2:
3


Example Explanation

For Input 1:
The string "ac" occurs twice in "acbac".
For Input 2:
The string "aa" occurs thrice in "aaaa".



int Solution::solve(string A, string B) {
    int N=A.size(), M=B.size(), count=0;
    long long hashA=0, hashB=0, d=1, k=1, mod = 1e9+7;
    
    for(int i=0; i<M-1; i++){
        hashB = ((hashB)*26 + (B[i]-'a'))%mod;
        hashA = ((hashA)*26 + (A[i]-'a'))%mod;
        d = (d*26)%mod;
    }
    
    hashB = ((hashB)*26 + (B[M-1]-'a'))%mod;
    hashA = ((hashA)*26 + (A[M-1]-'a'))%mod;

    if(hashA == hashB) count++;

    for(int i=M; i<N; i++){
        hashA = ((hashA - d*(A[i-M]-'a'))*26 + (A[i]-'a') + mod) % mod;
        if(hashA == hashB){
            count++;
        }
    }
    return count;
}
