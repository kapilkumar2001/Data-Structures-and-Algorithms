// Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value.



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.sb(a, n, m));
        }
	}
}



class Compute {

    public static long sb(long a[], long n, long x) {
        long min=n+1;
        long curr=0;
        int start=0,end=0;
        
        while(end<n)
        {
            while(curr<=x && end<n)
            {
                curr+=a[end++];
            }
            while(curr>x && start<n)
            {
                if(end-start<min)
                {
                    min=end-start;
                }
                curr-=a[start++];
            }
        }
        return min;
    }
}


