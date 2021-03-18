// Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}

class Solution
{
    String secFrequent(String arr[], int n)
    {
        HashMap<String,Integer> hs = new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                int count = hs.get(arr[i]);
                hs.put(arr[i],count+1);
                
                if(count+1>max)
                max= count+1;
            }
            else
            {
                hs.put(arr[i],1);
                if(1>max)
                {
                    max =1;
                }
            }
        }
        
        int maxx=0;
        String ans="";
        for(Map.Entry<String,Integer> entry : hs.entrySet())
        {
            if(entry.getValue()>maxx && entry.getValue()!=max)
            {
                maxx=entry.getValue();
                ans = entry.getKey();
            }
        }
        
        return ans;
    }
}
