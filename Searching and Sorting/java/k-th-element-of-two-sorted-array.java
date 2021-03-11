// Given two sorted arrays arr1 and arr2 of size M and N respectively and an element K. The task is to find the element 
// that would be at the k’th position of the final sorted array.


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
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}



class Solution {
    public long kthElement( int a1[], int a2[], int n, int m, int k) {
        
        int i=0,j=0;
        int count=1;
        while(i<n && j<m)
        {
            if(a2[j]>=a1[i])
            {
                if(count==k)
                {
                    return a1[i];
                }
                i++;
                count++;
            }
            else
            {
                if(count==k)
                {
                    return a2[j];
                }
                j++;
                count++;
            }
        }
        
        while(i<n)
        {
            if(count==k)
            {
                return a1[i];
            }
            i++;
            count++;
        }
        
        while(j<m)
        {
            if(count==k)
            {
                return a2[j];
            }
            j++;
            count++;
        }
        
        return -1;
    }
}
