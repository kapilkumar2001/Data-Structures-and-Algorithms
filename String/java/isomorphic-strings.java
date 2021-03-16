// Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
// Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to
// every character of str2 while preserving the order.
// Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Isomorphic obj = new Isomorphic();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

 

class Isomorphic{
    
    public static boolean areIsomorphic(String str1,String str2)
    {
        java.util.HashMap<Character,Character> hs1 = new java.util.HashMap<>();
        java.util.HashMap<Character,Character> hs2 = new java.util.HashMap<>();
        
        if(str1.length()!=str2.length())
        return false;
        
        for(int i=0;i<str1.length();i++)
        {
            if(hs1.containsKey(str1.charAt(i)))
            {
                char x = hs1.get(str1.charAt(i));
                if(x!=str2.charAt(i))
                return false;
            }
            else
            {
                hs1.put(str1.charAt(i),str2.charAt(i));
            }
            if(hs2.containsKey(str2.charAt(i)))
            {
                char y = hs2.get(str2.charAt(i));
                if(y!=str1.charAt(i))
                return false;
            }
            else
            {
                hs2.put(str2.charAt(i),str1.charAt(i));
            }
            
        }
        return true;
    }
}
