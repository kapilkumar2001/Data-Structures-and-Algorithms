// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
// Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets 
// among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.




import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}


class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
       
        long min = 1000000000; 
        for(long i=0;i<=(n-m);i++)
        {
            if((a.get((int)(i+m-1))-a.get((int)i))<min)
            {
                min= a.get((int)(i+m-1))-a.get((int)i);
            }
        }
        
        return min;
    }
}
