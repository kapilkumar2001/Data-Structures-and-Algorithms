// Given a string, your task is to reorder its letters in such a way that it becomes a palindrome 
// (i.e., it reads the same forwards and backwards).

#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int n = s.length();
    int count[26]={0};
    for(int i=0;i<n;i++)
    {
        count[s[i]-'A']++;
    }
    int flag=0;
    for(int i=0;i<26;i++)
    {
        if(count[i]%2!=0)
        {
            flag++;
            if(flag>=2)
            break;
        }
    }
    if(flag>1)
    {
        cout<<"NO SOLUTION";
    }
    else if(flag==1 && ((n%2)==0))
    {
        cout<<"NO SOLIUTION";
    }
    else
    {
        string sss = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int l=0;
        string s1=s;
        int sssss;
        for(int i=0;i<26;i++)
        {
            if(count[i]<=0)
            {
                continue;
            }
            else if(count[i]>=2)
            {
                s1[l]=sss[i];
                s1[n-l-1]=sss[i];
                l++;
                count[i]-=2;
                i--;
            }
            else
            {
                sssss = i;
            }
        }
        if((n%2)!=0)
        {
            s1[l]=sss[sssss];
        }
        cout<<s1;
    }
}

