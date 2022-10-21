import java.util.*;

/*
PROBLEM:-
You are given a table with n rows and m columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

Input Format:-
The first line contains  denoting the number of test cases.
The first line of each test case contains integers n,m denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell. 
Each of the next n lines contains m integers.

Output Format:-
Print the maximum border of the shapes.
*/

class MaxBorder {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            t--;
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] arr = new char[n][m];
            int maxHshape = 0;
            for(int i = 0; i < n; i++)
            {
                int hshape = 0;
                String line = sc.next();
                for(int j = 0; j < m; j++)
                {
                    char ch = line.charAt(j);
                    arr[i][j] = ch;
                    if(ch == '#')
                        hshape++;
                    else
                    {
                        if(hshape > maxHshape)
                            maxHshape = hshape;
                        hshape = 0;
                    }
                }
            }
            int maxVshape = 0;
            for(int i = 0; i < m; i++)
            {
                int vshape = 0;
                for(int j = 0; j < n; j++)
                {
                    char ch = arr[j][i];
                    if(ch == '#')
                        vshape++;
                    else
                    {
                        if(vshape > maxVshape)
                            maxVshape = vshape;
                        vshape = 0;
                    }
                }
            }
            if(maxHshape > maxVshape)
                System.out.println(maxHshape);
            else
                System.out.println(maxVshape);
        }
        sc.close();
    }
}
