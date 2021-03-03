import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n,x;
            n = sc.nextInt();
            x = sc.nextInt();
            int a[]= new int[n];
            int flag=0,i1=0,i2=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                
                if(flag==0 && a[i]==x)
                {
                    flag=1;
                    i1=i;
                    i2=i;
                }
                if(a[i]==x)
                {
                    i2=i;
                }
            }
            if(flag==0)
            System.out.println("-1");
            else
            System.out.println(i1+" "+i2);
        }
	}
}
