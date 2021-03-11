// Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.



import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}


class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        int n = a.length;
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int z=0;
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            int sum= k-a[i];
            for(int j=i+1;j<n;j++)
            {
                int sum2= k-a[j];
                for(int l=j+1;l<n;l++)
                {
                    int sum3= k-a[l];
                    if(hs.contains(sum3))
                    {
                        arr.get(z).add(a[i]);
                        arr.get(z).add(a[j]);
                        arr.get(z).add(a[l]);
                        arr.get(z).add(sum3);
                        z++;
                    }
                }
            }
        }
        return arr;
    }
}
