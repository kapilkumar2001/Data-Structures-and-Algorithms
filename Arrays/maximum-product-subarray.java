// Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.



import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}



class Solution {
    long maxProduct(int[] a, int n) {
        int prod=1;
        int maxprod =1;
        
        for(int i=0;i<n;i++)
        {
            prod*=a[i];
            if(prod>maxprod)
            {
                maxprod=prod;
            }
            
            if(prod==0)
            {
                prod=1;
            }
        }
        return maxprod;
    }
}
