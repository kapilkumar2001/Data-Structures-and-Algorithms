class Solution {
public:

    #include <bits/stdc++.h>
    
    int dp[305];

    unordered_set<string> s;

    bool helper(string& str, int i, int n)
    {
        
        if(i == n)
        {
            return true;
        }
        

        if(dp[i] != -1)
        {
            return dp[i];
        }
        

        for(int j = i; j < n; j++)
        {
            if(s.count(str.substr(i, j - i + 1)))
            {
                if(helper(str, j + 1, n))
                {
                    return dp[i] = true;
                }
            }
        }
        

        return dp[i] = false;
    }
    
    bool wordBreak(string str, vector<string>& wordDict) {

        int n = str.size();
        

        for(auto word : wordDict)
        {
            s.insert(word);
        }
        

        memset(dp, -1, sizeof(dp));

        return helper(str, 0, n);
    }
};