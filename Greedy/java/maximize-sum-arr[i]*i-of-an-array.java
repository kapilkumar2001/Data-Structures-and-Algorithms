// Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,…., n – 1.
// You are allowed to rearrange the elements of the array.
// Note: Since output could be large, hence module 109+7 and then print answer.


import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            MaxSum obj = new MaxSum();
            
            System.out.println(obj.Maximize(a,n));
        }
        
	}
}



class MaxSum{
    
    long Maximize(int arr[], int n)
    {
        long sum=0;
        
        Arrays.sort(arr);
        
        for(long i=0;i<n;i++)
        {
            long x = (i*arr[(int)i]);
            x = x%1000000007;
            sum = (sum+x)%1000000007;
            sum= sum%1000000007;
        }
        
        return sum%1000000007;
    }   
}


