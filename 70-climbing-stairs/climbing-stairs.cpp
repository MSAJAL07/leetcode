class Solution {
    int count(int n, unordered_map<int, int>& dp) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (dp.find(n) == dp.end())
            dp[n] = count(n - 1, dp) + count(n - 2, dp);
        return dp[n];
    }

public:
    int climbStairs(int n) {
        unordered_map<int, int> dp;
        return count(n, dp);
    }
};