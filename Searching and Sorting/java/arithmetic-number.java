// Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting 
// the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not.


import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.inSequence(A, B, C));
        }
    }
}

class Solution{
    static int inSequence(int a, int b, int c){
        if(c>0 && a>b)
        {
            return 0;
        }
        if(c<0 && a<b)
        {
            return 0;
        }
        if(c==0 && a!=b)
        {
            return 0;
        }
        if(a==b)
        {
            return 1;
        }
        
        if(((b-a)%c)==0)
        return 1;
        else
        return 0;
    }
}
