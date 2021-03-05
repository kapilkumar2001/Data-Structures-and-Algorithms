import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    n=sc.nextInt();
		    
		    m=sc.nextInt();
		    
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    
		    System.out.println(doUnion(a,n,b,m));
		}
		
	}

 
public static int doUnion(int a[], int n, int b[], int m) 
{
    Set<Integer> s = new HashSet<Integer>();
    
    for(int i=0;i<n;i++)
    {
        s.add(a[i]);
    }
    for(int i=0;i<m;i++)
    {
        s.add(b[i]);
    }
    return s.size();
}

    
} 
