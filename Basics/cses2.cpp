//You are given all numbers between 1,2,…,n except one. Your task is to find the missing number.

#include<bits/stdc++.h>
using namespace std;

int main()
{
    long n;
    cin>>n;
    long a[n-1];
    for(int i=0;i<n-1;i++)
    {
        cin>>a[i];
    }
    sort(a,a+n);
    int flag=0;
    for(long i=1;i<n;i++)
    {
        if(a[i-1]!=i)
        {
            cout<<i;
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        cout<<n;
    }
    return 0;
}

