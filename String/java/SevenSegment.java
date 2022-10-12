import java.util.*;

/*

PROBLEM:-
Alice got a number written in seven segment format where each segment was creatted used a matchstick.

Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.

Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.
Help Alice out by telling her that number.

Input Format:-
First line contains T (test cases).
Next T lines contain a Number N.

Output Format:-
Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.

*/

public class SevenSegment {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            t--;
            String s = sc.next();
            int mcnt = 0;
            for(char ch : s.toCharArray())
            {
                int n = Integer.parseInt(String.valueOf(ch));
                mcnt += getMCnt(n);
            }
            getRes(mcnt);
        }
    }
    static int getMCnt(int nm)
    {
        if(nm==0 || nm==6 || nm==9)
            return 6;
        if(nm==1)
            return 2;
        if(nm==2 || nm==3 || nm==5)
            return 5;
        if(nm==4)
            return 4;
        if(nm==7)
            return 3;
        if(nm==8)
            return 7;
        return -1;
    }
    static void getRes(int mc)
    {
        if(mc == 0)
        {
            System.out.println(111);
            return;
        }
        String res = "";
        int d = mc/2;
        int r = mc%2;
        while(d > 0)
        {
            d--;
            res += "1";
        }
        if(r == 1)
        {
            res = res.substring(0,res.length()-1);
            res = "7" + res;
        }
        System.out.println(res);
    }
}
