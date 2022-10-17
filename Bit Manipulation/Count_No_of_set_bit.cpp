// C++ program to demonstrate __builtin_popcount()
// STL


#include <iostream>
using namespace std;

int main()
{
	cout << __builtin_popcount(4) << endl;
	cout << __builtin_popcount(15);

	return 0;
}


//Program to understand the flow
#include <iostream>
using namespace std;

// Check each bit in a number is set or not
// and return the total count of the set bits.
int countSetBits(int N)
{
	int count = 0;
	// (1 << i) = pow(2, i)
	for (int i = 0; i < sizeof(int) * 8; i++) {
		if (N & (1 << i))
			count++;
	}
	return count;
}

int main()
{

	int N = 15;

	cout << countSetBits(N) << endl;
	return 0;
}
