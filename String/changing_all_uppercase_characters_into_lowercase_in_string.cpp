// C++ program to convert whole string to
// lowercase using c++.

#include <bits/stdc++.h>
using namespace std;

int main()
{
    // s1 is the string which is converted to lowercase
    string s1;
    cin >> s1;
    // using transform() function and ::tolower in STL
    transform(s1.begin(), s1.end(), s1.begin(), ::tolower);
    cout << s1 << endl;

    return 0;
}
