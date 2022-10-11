// There are given N ropes of different lengths, we need to connect these ropes into one rope. 
// The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        
        //Taking input using class Scanner
        Scanner in = new Scanner(System.in);
        
        //Taking count of testcases
        int t = in.nextInt();
        while (t-- > 0) {
            
            //takling count of elements
            int n = in.nextInt();
            
            //Creating an array of size n
            long arr[] = new long[n];

            //inserting elements to the array
            for (int i = 0; i < n; ++i) arr[i] = in.nextLong();

            //calling minCost method of class solve
            System.out.println(new Solution().minCost(arr, n));
        }
    }
}



class Solution{
    long minCost(long arr[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        
        long sum=0;
        
        while(pq.size()>1)
        {
            long a = pq.poll();
            long b = pq.poll();
            
            sum+=(a+b);
            
            pq.add(a+b);
        }
        
        return sum;
    }
}
