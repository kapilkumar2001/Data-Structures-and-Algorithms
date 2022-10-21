import java.util.*;

/*
PROBLEM:-
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format:-
The first and only line of input contains the String S

Output Format:-
Print the resultant String on a single line.
*/

class ToggleString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char ch : s.toCharArray())
        {
            int n = (int)ch;
            if(n >= 'a' && n <= 'z')
                System.out.print((char)(n-32));
            else
                System.out.print((char)(n+32));
        }
        sc.close();
    }
}
