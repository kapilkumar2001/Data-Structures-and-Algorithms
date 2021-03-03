import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}

class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
      
        int rs=0,cs=0;
        while(rs<r && cs<c)
        {
            
                for(int i=cs;i<c;i++)
                {
                    arr.add(matrix[rs][i]);
                }
                rs++;
           
            
                for(int i=rs;i<r;i++)
                {
                    arr.add(matrix[i][c-1]);
                }
                c--;
            
            if(rs<r)
            {
                for(int i=c-1;i>=cs;i--)
                {
                    arr.add(matrix[r-1][i]);
                }
                r--;
            }
           
            if(cs<c)
            {
                for(int i=r-1;i>=rs;i--)
                {
                    arr.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return arr;
    }
}

