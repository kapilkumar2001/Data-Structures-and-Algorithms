// Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by 
// increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
// Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}



class Solution {
    int getMinDiff(int[] a, int n, int k) {
        
        if(n==1)
        return 0;
        
        Arrays.sort(a);
        
        int ans = a[n-1]-a[0];
        
        int min = a[0]+k;
        int max = a[n-1]-k;
        
        if(min>max)
        {
            int temp = min;
            min = max;
            max = temp;
        }
        
        for(int i=1;i<n-1;i++)
        {
            int add = a[i]+k;
            int sub = a[i]-k;
            
            if(add<=max || sub>=min)
            continue;
            
            if(add-min>=max-sub && sub>=0)
            {
                min =sub;
            }
            else
            max = add;
        }
        
        return Math.min(ans,max-min);

    }
}

