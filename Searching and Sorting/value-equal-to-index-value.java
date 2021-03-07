// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value.



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().valueEqualToIndex(arr, n);
            if (ans.size() == 0) {
                System.out.println("Not Found");
            } else {
                for (Integer x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}



class Solution {
    ArrayList<Integer> valueEqualToIndex(int a[], int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(a[i]==i+1)
            {
                arr.add(a[i]);
            }
        }
        return arr;
    }
}
