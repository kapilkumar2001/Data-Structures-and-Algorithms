import java.util.*;

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
