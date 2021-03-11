// Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the 
// elements of the Array are palindrome otherwise it will return 0.



import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}


class GfG
{
    public static int palinArray(int[] a, int n)
    {
        for(int i=0;i<n;i++)
        {
            String s=String.valueOf(a[i]);  
            int r=0,l=s.length()-1;
            while(r<l)
            {
                if(s.charAt(r)!=s.charAt(l))
                return 0;
                r++;
                l--;
            }
        }
        return 1;
    }
}
