// Given an array arr of size N and an integer X. Find if there's a triplet in the array which sums up to the given integer X.



import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); 
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    int arr[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(new TripletSum().find3Numbers(arr, n, x));
		}
	}
}

class TripletSum
{
    
    
    public static int find3Numbers(int a[], int n, int x) { 
    
        
        for(int i=0;i<n-2;i++)
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            int m = x-a[i];
            for(int j=i+1;j<n;j++)
            {
                if(hs.contains(m-a[j]))
                {
                    return 1;
                }
                hs.add(a[j]);
            }
        }
        return 0;
    
    }
}

