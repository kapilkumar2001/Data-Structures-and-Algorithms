import java.util.HashSet;
import java.util.Set;
 
class Main
{
    // Function to find the minimum index of the repeating element
    public static int findMinIndex(int[] A)
    {
        int minIndex = A.length;
 
        // create an empty set to store array elements
        Set<Integer> set = new HashSet<>();
 
        // traverse the array from right to left
        for (int i = A.length - 1; i >= 0; i--)
        {
            // if the element is seen before, update the minimum index
            if (set.contains(A[i])) {
                minIndex = i;
            }
            // if the element is seen for the first time, insert it into the set
            else {
                set.add(A[i]);
            }
        }
 
        // invalid input
        if (minIndex == A.length) {
            return -1;
        }
 
        // return minimum index
        return minIndex;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 5, 6, 3, 4, 3, 6, 4 };
 
        int minIndex = findMinIndex(A);
 
        if (minIndex != A.length) {
            System.out.print("The minimum index of the repeating element is " +
                    minIndex);
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
