// Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. 
// You are given a number N, you have to output the number of integers less than N in the sample space S.




import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countSquares(N));
        }
    }
}

class Solution {
    static int countSquares(int n) {
        int x = (int)Math.sqrt(n);
        if(Math.pow(x,2)==n)
        {
            return x-1;
        }
        else
        return x;
    }
};
