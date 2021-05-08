// You are given a DNA sequence: a string consisting of characters A, C, G, and T. 
// Your task is to find the longest repetition in the sequence. 
// This is a maximum-length substring containing only one type of character.


#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int max =1;
    int count=1;
    for(int i=1;i<s.length();i++)
    {
        if(s[i]==s[i-1])
        {
            count++;
        }
        if(count>max)
        max=count;
        if(s[i]!=s[i-1])
        {
            count=1;
        }
    }
    cout<<max;

    return 0;
}

