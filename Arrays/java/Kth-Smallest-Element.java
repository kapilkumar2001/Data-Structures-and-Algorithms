import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
         }
	
public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    Arrays.sort(arr);
    return arr[k-1];
} 

}
