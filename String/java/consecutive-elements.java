// Given a string S delete the characters which are appearing more than once consecutively.

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}


class Solution{
    public String removeConsecutiveCharacter(String s){
        String str="";
        str+=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                str+=(s.charAt(i));
            }
        }
        return str;
    }
}
