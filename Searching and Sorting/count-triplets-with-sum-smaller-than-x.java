import java.io.*;
import java.util.*;

class Solution
{
    long countTriplets(long a[], int n,int sum)
    {
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1,k=n-1;
            while(j<k)
            {
                if(a[i]+a[j]+a[k]>=sum)
                {
                    k--;
                }
                else
                {
                    count+=(k-j);
                    j++;
                }
            }
        } 
        return count;
    }
}

class Array {

   
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            long ans=ob.countTriplets(a,n,k);
            System.out.println(ans);
        }
    }
}



  // } Driver Code Ends
