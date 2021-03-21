// Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
// For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.


import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}




class Solution
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='{' || x.charAt(i)=='[' || x.charAt(i)=='(')
            {
                st.push(x.charAt(i));
            }
            else if(st.isEmpty())
            return false;
            if(x.charAt(i)=='}')
            {
                if(st.peek()=='{')
                st.pop();
                else
                return false;
            }
            if(x.charAt(i)==']')
            {
                if(st.peek()=='[')
                st.pop();
                else
                return false;
            }
            if(x.charAt(i)==')')
            {
                if(st.peek()=='(')
                st.pop();
                else
                return false;
            }
        }
        
        if(!st.isEmpty())
        return false;
        else
        return true;
    }
}

