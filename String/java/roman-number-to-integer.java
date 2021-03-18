/*Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000*/


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            RomanToNumber rn = new RomanToNumber();
            System.out.println(rn.romanToDecimal(roman));
        }
    }
}

class RomanToNumber {
    int roman(Character c)
    {
        if(c=='I')
        return 1;
        if(c=='V')
        return 5;
        if(c=='X')
        return 10;
        if(c=='L')
        return 50;
        if(c=='C')
        return 100;
        if(c=='D')
        return 500;
        if(c=='M')
        return 1000;
        return 0;
    }
    public int romanToDecimal(String str) {
        int ans =0;
        
        for(int i=0;i<str.length();i++)
        {
            int a = roman(str.charAt(i));
            
            if(i+1<str.length())
            {
                int b = roman(str.charAt(i+1));
                if(a>=b)
                {
                    ans += a;
                }
                else
                {
                    ans+=(b-a);
                    i++;
                }
            }
            else
            {
                ans+=a;
            }
        }
        return ans;
    }
}
