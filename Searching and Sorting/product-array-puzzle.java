// Given an array A[] of size N, construct a Product Array P (of same size N) such that P[i] is equal to the product of 
// all the elements of A except A[i].


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
	    long prod =1;
	    long flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            flag++;
            else
            prod*=a[i];
        }
        long arr[]= new long[n];
        for(int i=0;i<n;i++)
        {
            if(flag>1)
            {
                arr[i]=0;
            }
            else if(flag==0)
            arr[i]=(prod/a[i]);
            else if(flag==1 && a[i]!=0)
            {
                arr[i]=0;
            }
            else
            arr[i]=prod;
        }
        return arr;
	} 
} 

