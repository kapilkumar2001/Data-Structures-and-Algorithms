// Given an array of integers of size N and a number K., Your must modify array arr[] exactly K number of times. Here modify array means in 
// each operation you can replace any array element either arr[i] by -arr[i] or -arr[i] by arr[i]. You need to perform this operation 
// in such a way that after K operations, the sum of the array must be maximum.


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); 
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.maximizeSum(a, n, k));
            
        }
	}
}



class Compute {

    public static long maximizeSum(long a[], int n, int k)
    {
        
           Arrays.sort(a);
           for(int i=0;i<n;i++)
           {
               if(k<=0)
               {
                   break;
               }
               if(a[i]<0)
               {
                   a[i]= 0-a[i];
                   k--;
               }
               if(k<=0)
               {
                   break;
               }
           }
           
           
               long sum=0;
               long min = 1000000000;
               for(int i=0;i<n;i++)
               {
                   sum+=a[i];
                   if(min>a[i])
                   {
                       min =a[i];
                   }
               }
               
               if(k%2==0)
               return sum;
              
               return (sum-(2*min));
          
    }
}
