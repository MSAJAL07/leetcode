class Solution {
    private int paths(int m, int n, int[][] dp){
        int res = 0;
        if(m == 0 && n == 0) return 1;
        if(dp[m][n] == -1){
            if(m -1 >= 0) res +=  paths(m-1, n,dp);
            if(n-1 >= 0) res +=  paths(m, n-1,dp); 
            dp[m][n] = res;
        }
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
}
        return paths(m-1,n-1, dp);
    }
}