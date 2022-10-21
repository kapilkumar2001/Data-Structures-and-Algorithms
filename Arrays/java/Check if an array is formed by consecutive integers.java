import java.util.HashSet;
import java.util.Set;
 
class Main
{
    // Function to check if consecutive integers form an array
    public static boolean isConsecutive(int[] A)
    {
        // base case
        if (A.length <= 1) {
            return true;
        }
 
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
 
        // compute the minimum and maximum element in an array
        for (int i: A)
        {
            if (i < min) { min = i; }
            if (i > max) { max = i; }
        }
 
        // for an array to contain consecutive integers, the difference between
        // the maximum and minimum element in it should be exactly `n-1`
        if (max - min != A.length - 1) {
            return false;
        }
 
        // create an empty set (we can also use a visited array)
        Set<Integer> visited = new HashSet<>();
 
        // traverse the array and checks if each element appears only once
        for (int i: A)
        {
            // if an element is seen before, return false
            if (visited.contains(i)) {
                return false;
            }
 
            // mark element as seen
            visited.add(i);
        }
 
        // we reach here when all elements in the array are distinct
        return true;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -1, 5, 4, 2, 0, 3, 1 };
 
        if (isConsecutive(A)) {
            System.out.print("The array contains consecutive integers");
        }
        else {
            System.out.print("The array does not contain consecutive integers");
        }
    }
}
