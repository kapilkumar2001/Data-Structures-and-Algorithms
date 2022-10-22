// Java program to count number of distinct
// subsequences of a given string.
import java.util.ArrayList;
import java.util.Arrays;
public class Count_Subsequences {

	static final int MAX_CHAR = 256;

	// Returns count of distinct subsequences of str.
	static int countSub(String str)
	{
		// Create an array to store index
		// of last
		int[] last = new int[MAX_CHAR];
		Arrays.fill(last, -1);

		// Length of input string
		int n = str.length();

		// dp[i] is going to store count of distinct
		// subsequences of length i.
		int[] dp = new int[n + 1];

		// Empty substring has only one subsequence
		dp[0] = 1;

		// Traverse through all lengths from 1 to n.
		for (int i = 1; i <= n; i++) {
			// Number of subsequences with substring
			// str[0..i-1]
			dp[i] = 2 * dp[i - 1];

			// If current character has appeared
			// before, then remove all subsequences
			// ending with previous occurrence.
			if (last[(int)str.charAt(i - 1)] != -1)
				dp[i] = dp[i] - dp[last[(int)str.charAt(i - 1)]];

			// Mark occurrence of current character
			last[(int)str.charAt(i - 1)] = (i - 1);
		}

		return dp[n];
	}

	// Driver code
	public static void main(String args[])
	{
		System.out.println(countSub("gfg"));
	}
}
