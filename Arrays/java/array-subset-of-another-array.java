// Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. 
// Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
 

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
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}



class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            hs.add((int)a1[i]);
        }
        
        for(int i=0;i<m;i++)
        {
            if(!hs.contains((int)a2[i]))
            {
                return "No";
            }
        }
        
        return "Yes";
    }
}
