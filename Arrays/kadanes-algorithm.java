// Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); 
		while(t-->0){
		   
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		   
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}



class Solution{
    
    int maxSubarraySum(int a[], int n){
        
        int maxtillnow=0,maxcurr=0;
        for(int i=0;i<n;i++)
        {
            maxcurr+=a[i];
            if(maxcurr>maxtillnow)
            {
                maxtillnow=maxcurr;
            }
            if(maxcurr<0)
            {
                maxcurr=0;
            }
        }
        
        return maxtillnow;
        
    }
    
}


