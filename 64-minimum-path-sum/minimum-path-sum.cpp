class Solution {
public:

    int minSum(vector<vector<int>>& grid, int i, int j,  vector<vector<int>>& dp){
        int m = grid.size();
        int n = grid[0].size();
        if(i < 0 || i >= m  || j < 0 || j >= n) return INT_MAX;
        if(i == m-1 && j == n-1 ) return grid[m-1][n-1];
        if(dp[i][j] == -1) {
            dp[i][j] =  grid[i][j] + min(minSum(grid, i+1, j, dp),minSum(grid, i, j+1, dp));
        }
        return  dp[i][j];
    }
    int minPathSum(vector<vector<int>>& grid) {
        vector<vector<int>> dp(grid.size(), vector<int>(grid[0].size(), -1));
        return minSum(grid, 0, 0, dp);
        
    }
};