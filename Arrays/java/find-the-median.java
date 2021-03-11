// Given an array arr[] of N integers, calculate the median



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
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_fact(v);
            System.out.println(ans);
        }
    }
}


class Solution
{
    public int find_fact(int[] a)
    {
        Arrays.sort(a);
        if(a.length%2!=0)
        {
            return a[a.length/2];
        }
        else
        {
            return (a[(a.length-1)/2]+a[(a.length/2)])/2;
        }
    }
}
