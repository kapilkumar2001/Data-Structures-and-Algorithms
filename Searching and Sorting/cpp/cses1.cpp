#include <bits/stdc++.h>
using namespace std;

int main()
{
    long n;
    cin>>n;
    
    long a[n];
    for(long i=0;i<n;i++)
    cin>>a[i];
    
    sort(a,a+n);
    
    long count=1;
    for(long i=1;i<n;i++)
    {
        if(a[i]!=a[i-1])
        count++;
    }
    
    cout<<count;

    return 0;
}
