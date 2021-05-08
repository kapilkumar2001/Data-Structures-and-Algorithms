// You are given an array of n integers. You want to modify the array so that it is increasing, 
// i.e., every element is at least as large as the previous element.
// On each move, you may increase the value of any element by one. 
// What is the minimum number of moves required?

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long n;
    cin>>n;
    long count=0;
    long a[n];
    cin>>a[0];
    for(long i=1;i<n;i++)
    {
        cin>>a[i];
        if(a[i]>=a[i-1])
        continue;
        else
        {
            count+=(a[i-1]-a[i]);
            a[i]=a[i-1];
        }
    }
    cout<<count;

    return 0;
}

