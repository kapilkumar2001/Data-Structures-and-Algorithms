// Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into 
// one sorted   array in non-decreasing order without using any extra space.


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}


class Solution {

    public void merge(int a1[], int a2[], int n, int m) {
        int x = (n+m);
        int a[] = new int[x];
        int z=0;
        int i=0,j=0;
        for(i=0,j=0;i<n && j<m;)
        {
            if(a1[i]<a2[j])
            {
                a[z++]=a1[i++];
            }
            else if(a1[i]>a2[j]) 
            {
                a[z++]=a2[j++];
            }
            else
            {
                a[z++]=a1[i++];
                a[z++]=a2[j++];
            }
        }
        for(int k=i;k<n;k++)
        {
            a[z++]=a1[k];
        }
        for(int k=j;k<m;k++)
        {
            a[z++]=a2[k];
        }
        int l=0;
        int y=0;
        for(l=0;l<n;l++)
        {
            a1[l]=a[y++];
        }
        for(l=0;l<m;l++)
        {
            a2[l]=a[y++];
        }
    }
}
