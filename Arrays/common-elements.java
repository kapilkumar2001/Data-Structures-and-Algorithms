// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.



import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}



class Solution
{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int i=0,j=0,k=0;
        
        while(i<n1 && j<n2 && k<n3)
        {
            if(a[i]==b[j] && b[j]==c[k] && (!arr.contains(a[i])))
            {
                arr.add(a[i]);
                i++;
                j++;
                k++;
                continue;
            }
            if(a[i]==b[j] && c[k]<b[j])
            {
                k++;
                continue;
            }
            if(a[i]==c[k] && b[j]<a[i])
            {
                j++;
                continue;
            }
            if(b[j]==c[k] && a[i]<b[j])
            {
                i++;
                continue;
            }
            if(a[i]>=b[j] && a[i]>=c[k])
            {
                j++;
                k++;
                continue;
            }
            if(b[j]>=a[i] && b[j]>=c[k])
            {
                i++;
                k++;
                continue;
            }
            if(c[k]>=a[i] && c[k]>=b[j])
            {
                i++;
                j++;
                continue;
            }
        }
        return arr;
    }
}
