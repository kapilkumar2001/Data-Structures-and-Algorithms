// You have two coin piles containing a and b coins. On each move, you can either remove one coin 
// from the left pile and two coins from the right pile, or two coins from the left pile and 
// one coin from the right pile.
// Your task is to efficiently find out if you can empty both the piles.


#include <bits/stdc++.h>
using namespace std;

int main()
{
    long t;
    cin>>t;
    while(t--)
    {
        long a,b;
        cin>>a>>b;
        int ans = 0;
        if(((a+b)%3)==0)
        ans=1;
        if(a>b)
        {
            if(b*2<a)
            ans =0;
        }
        if(b>a)
        {
            if(a*2<b)
            ans =0;
        }
        if(ans==1)
        cout<<"YES"<<endl;
        else
        cout<<"NO"<<endl;
        
    }
}

