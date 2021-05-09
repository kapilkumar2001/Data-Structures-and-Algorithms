#include <bits/stdc++.h>
using namespace std;


long power(long n)
{
    long ans=1;
    for(int i=0;i<n;i++)
    {
        ans = ans*2;
        ans = ans%1000000007;
    }
    return ans;
}

int main()
{
    long n;
    cin>>n;
    long ans = (power(n));
    ans = ans%1000000007;
    cout<<ans;
    return 0;
}
