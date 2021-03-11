// Given an array A of N elements. Find the majority element in the array. A majority element in 
// an array A of size N is an element that appears more than N/2 times in the array.
 


import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Majority().majorityElement(arr, n)); 
        }
    }
}

class Majority
{
    static int majorityElement(int a[], int n)
    {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(a[i]))
            {
                int x = h.get(a[i]);
                h.put(a[i],x+1);
            }
            else
            {
                h.put(a[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : h.entrySet())
        {
            if(entry.getValue()>n/2)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
