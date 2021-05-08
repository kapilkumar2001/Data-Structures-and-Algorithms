// A permutation of integers 1,2,…,n is called beautiful if there are no adjacent elements 
// whose difference is 1.
// Given n, construct a beautiful permutation if such a permutation exists.




#include<bits/stdc++.h>
using namespace std;

int main()
{
    long n;
    cin>>n;

    if(n==1)
    cout<<"1"<<endl;
    else if(n==2 || n==3)
    cout<<"NO SOLUTION";
    else if(n==4)
    cout<<"2 4 1 3";
    else
    {
        for(long i=1;i<=n;i++)
        {
            if(i%2!=0)
            cout<<i<<" ";
        }
        for(long i=1;i<=n;i++)
        {
            if(i%2==0)
            cout<<i<<" ";
        }
    }

    return 0;
}

