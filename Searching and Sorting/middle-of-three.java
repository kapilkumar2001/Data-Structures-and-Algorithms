// Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).



import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}

class Solution{
    int middle(int a, int b, int c){
        if((a>b && a<c) || (a<b && a>c))
        return a;
        if((b>a && b<c) || (b<a && b>c))
        return b;
        if((c>a && c<b) || (c<a && c>b))
        return c;
        return 0;
    }
}
