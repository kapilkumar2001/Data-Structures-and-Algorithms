//Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than
// or equal to k together.



import java.io.*;
import java.util.*;


class Array {
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.minSwap(arr, sizeOfArray, K);
		    System.out.println(ans);
		}
	}
}




class Complete{
    public static int minSwap (int a[], int n, int k) {
        int count=0;
        int bad=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
            count++;
        }
        for(int i=0;i<count;i++)
        {
            if(a[i]>k)
            bad++;
        }
        int ans = bad;
        
        for(int i=0,j=count;j<n;i++,j++)
        {
            if(a[i]>k)
            bad--;
            if(a[j]>k)
            bad++;
            
            ans = Math.min(bad,ans);
        }
        return ans;
    }
}

