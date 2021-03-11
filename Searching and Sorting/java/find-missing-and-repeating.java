// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and 
// one number 'B' occurs twice in array. Find these two numbers.



import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

class Solve {
    int[] findTwoElement(int a[], int n) {
        Arrays.sort(a);
        int miss=0,repeat=0;
        int count[] = new int[n];
        for(int i=0;i<n;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[a[i]-1]++;
        }
        for(int i=0;i<n;i++)
        {
            if(count[i]==0)
            {
                miss = i+1;
            }
            if(count[i]==2)
            {
                repeat = i+1;
            }
        }
        int b[]= new int[2];
        b[0] = repeat;
        b[1] = miss;
        return b;
    }
}
