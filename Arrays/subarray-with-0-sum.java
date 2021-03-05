// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    
		    int arr[] = new int[n];
		    
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     System.out.println(findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	



static boolean findsum(int a[],int n)
{
    int sum =0;
    
    Set<Integer> set = new HashSet<Integer>();
    
    for(int i=0;i<n;i++)
    {
        sum+=a[i];
        
        if(a[i]==0 || sum==0 || set.contains(sum))
        {
            return true;
        }
        set.add(sum);
    }
    return false;
}


	
	
}  
