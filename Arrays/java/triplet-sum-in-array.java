// Triplet Sum in Array 
// Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.




// Approach -1 ( Time Complexity - O(n3) )

class TripletSum
{
    public static int find3Numbers(int a[], int n, int x) {        
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k]==x)
                    return 1;
                }
            }
        }
        return 0;
    }
}



// Approach - 2 ( Time Complexity - O(n2) ) 

class TripletSum
{
    public static int find3Numbers(int a[], int n, int x) {        
        for(int i=0;i<n-2;i++)
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            int m = x-a[i];
            for(int j=i+1;j<n;j++)
            {
                if(hs.contains(m-a[j]))
                {
                    return 1;
                }
                hs.add(a[j]);
            }
        }
        return 0;
    }
}


