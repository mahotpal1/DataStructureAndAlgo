Q1. Replicating Substring
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string B, find if it is possible to re-order the characters of the string B so that it can be represented as a concatenation of A similar strings.

Eg: B = aabb and A = 2, then it is possible to re-arrange the string as "abab" which is a concatenation of 2 similar strings "ab".

If it is possible, return 1, else return -1.



Problem Constraints

1 <= Length of string B <= 1000

1 <= A <= 1000

All the alphabets of S are lower case (a - z)



Input Format

First argument is an integer A.
Second argument is a string B.



Output Format

Your function should return 1 if it is possible to re-arrange the characters of the string B so that it can be represented as a concatenation of A similar strings. If it is not, return -1.



Example Input

Input 1:

 A = 2
 B = "bbaabb"
Input 2:

 A = 2
 B = "bc"


Example Output

Output 1:

 1
Output 2:

 -1


Example Explanation

Explanation 1:

 We can re-order the given string into "abbabb".
Explanation 2:

 There is no 2 similar strings
 
 
 
int Solution::solve(int A, string B) {
    unordered_map <char, int> umap;

for (int i = 0; i < B.size(); i++)
{
if (umap.find(B[i]) != umap.end())
{
int value = umap.at(B[i]);
umap[B[i]] = value + 1;
}
else
{
umap.insert({ B[i], 1 });
}
}

for (const auto &elem : umap)
{
if (elem.second % A != 0)
return -1;
}
return 1;
}


Q2. Reverse the String
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You are given a string A of size N.


Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.



Problem Constraints

1 <= N <= 3 * 105



Input Format

The only argument given is string A.



Output Format

Return the string A after reversing the string word by word.



Example Input

Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output

Output 1:
"blue is sky the"
Output 2:
"ib is this"    


Example Explanation

Explanation 1:
We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
We reverse the string word by word so the string becomes "ib is this".


string Solution::solve(string A) {
    stringstream ss(A); // Link the string A to the stringstream ss
string str, res = "";
vector<string> v;
while (ss >> str) { // This will remove any whitespace between successive words
v.push_back(str);
}
for (int i = v.size() - 1; i >= 0; --i) {
res += v[i] + " ";
}
return res.substr(0, res.size() - 1); // To remove the last space
}
