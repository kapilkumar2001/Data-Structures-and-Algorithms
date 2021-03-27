// In a candy store, there are N different types of candies available and the prices of all the N different types of candies are provided to you.
// You are now provided with an attractive offer.
// You can buy a single candy from the store and get at most K other candies ( all are different types ) for free.
// Now you have to answer two questions. Firstly, you have to find what is the minimum amount of money you have to spend to buy all the 
// N different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the N different candies.
// In both the cases you must utilize the offer i.e. you buy one candy and get K other candies for free.


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}


class Solution{
    static ArrayList<Integer> candyStore(int arr[],int n,int k){
        int m = n/(k+1);
        if((n%(k+1))!=0)
        m++;
        
        Arrays.sort(arr);
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int min=0,max=0;
        for(int i=0;i<m;i++)
        {
            min+=(arr[i]);
        }
        
        for(int i=n-1;i>=n-m;i--)
        {
            max+=(arr[i]);
        }
        
        a.add(min);
        a.add(max);
        
        return a;
    }
}
