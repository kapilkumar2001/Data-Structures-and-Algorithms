// Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}


class Solution
{
    public int minSwaps(int a[])
    {
        int temp[] = Arrays.copyOfRange(a,0,a.length);
        Arrays.sort(temp);
        int ans =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=temp[i])
            {
                ans++;
                int z=indexOf(a,temp[i]);
                int t = a[z];
                a[z] = a[i];
                a[i]=t;
            }
        }
        return ans;
    }
    
    static int indexOf(int a[],int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            return i;
        }
        return -1;
    }
}
