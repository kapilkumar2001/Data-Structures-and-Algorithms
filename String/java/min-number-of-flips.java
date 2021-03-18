// Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by 
// flipping some of the bits, our goal is to minimize the number of bits to be flipped.

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}



class Solution {
    public int minFlips(String s) {
        return Math.min(minf(s,'0'),minf(s,'1'));
    }
    
    int minf(String s, Character exp)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=exp)
            count++;
            
            if(exp=='0')
            exp = '1';
            else
            exp = '0';
        }
        return count;
    }
}
