// Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for 
// the railway station so that no train is kept waiting.
// Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be
// the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, 
// same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms,




import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0;
        int result=1;
        int plt=1;
        
        while(i<n && j<n)
        {
            if(arr[i]>dep[j])
            {
                plt--;
                j++;
            }
            else
            {
                plt++;
                i++;
            }
            if(result<plt)
            {
                result=plt;
            }
        }
        return result;
    }
    
}


