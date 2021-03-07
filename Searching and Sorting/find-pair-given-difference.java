// Given an unsorted array Arr[] and a number N. You need to write a program to find if there exists a pair of elements in the
// array whose difference is N.


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc= new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t-->0)
	     {
	         int n,d;
	         n = sc.nextInt();
	         d = sc.nextInt();
	         int a[]= new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]= sc.nextInt();
	         }
	         int flag=0;
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<n;j++)
	             {
	                 if(Math.abs(a[i]-a[j])==d)
	                 {
	                     flag=1;
	                     break;
	                 }
	             }
	         }
	         if(flag==0)
	         System.out.println("-1");
	         else
	         System.out.println("1");
	     }
	 }
}
