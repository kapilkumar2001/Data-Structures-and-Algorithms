// Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and 
//follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses.
// At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money 
//but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money 
//he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.



import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	 
	  Scanner sc = new Scanner(System.in);
	  
	  
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      System.out.println(new solve().FindMaxSum(arr, n));
	 }
   }
}


class solve{
    // Function to return maximum of sum without adjacent elements
    public int FindMaxSum(int a[], int n){
        if(n==0)
        return 0;
        if(n==1)
        return a[0];
        if(n==2)
        return Math.max(a[0],a[1]);
        
        int d[] = new int[n];
        d[0] = a[0];
        d[1] = Math.max(a[0],a[1]);
        
        for(int i=2;i<n;i++)
        {
            d[i] = Math.max(d[i-1],d[i-2]+a[i]);
        }
        return d[n-1];
    }
}
