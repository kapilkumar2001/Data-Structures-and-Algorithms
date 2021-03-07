// Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.


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
            int R = Integer.parseInt(input_line[0]);
            int C = Integer.parseInt(input_line[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}


class Solution {
    int median(int matrix[][], int r, int c) {
        int n = r*c;
        int a[]= new int[n];
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[count++]=matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[n/2];
    }
}
