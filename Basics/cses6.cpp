// A number spiral is an infinite grid whose upper-left square has number 1. 
// Here are the first five layers of the spiral:
// 1  2  9 10 25
// 4  3  8 11 24
// 5  6  7 12 23
//16 15 14 13 22
//17 18 19 20 21
// Your task is to find out the number in row y and column x.



#include<bits/stdc++.h>
using namespace std;

int main()
{
    long t;
    cin>>t;
    while(t--)
    {
        long y,x;
        cin>>y>>x;
        if(y>x)
        {
            if(y%2==0)
            {
                cout<<(y*y)-(x-1);
            }
            else
            {
                cout<<((y-1)*(y-1))+1+(x-1);
            }
        }
        else
        {
            if(x%2!=0)
            {
                cout<<(x*x)-(y-1);
            }
            else
            {
                cout<<((x-1)*(x-1))+1+(y-1);
            }
        }
        cout<<endl;
    }

    return 0;
}

