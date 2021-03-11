// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet.
// Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets 
// among k students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc .nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int k = sc.nextInt();
		    int min=a[k-1]-a[0];
		    for(int i=k;i<n;i++)
		    {
		        int x = a[i]-a[i-k+1];
		        if(min>x)
		        {
		            min=x;
		        }
		    }
		    System.out.println(min);
		}
	}
}
