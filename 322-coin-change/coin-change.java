class Solution {
    private int getFewestCoins(int[] coins, int target, int i, int[][] dp){
        if(target == 0) return 0;
        if (target < 0 || i == coins.length) return -1;

        if(dp[target][i] != 0) return dp[target][i];

        int select = getFewestCoins(coins, target - coins[i], i, dp);
        if(select != -1) select += 1;
        int noSelect =  getFewestCoins(coins, target, i+1, dp);
        if(select == -1) dp[target][i] = noSelect;
        else if(noSelect == -1) dp[target][i] = select;
        else dp[target][i] = Math.min(select, noSelect);
        return dp[target][i];
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount+1][coins.length+1];
        return getFewestCoins(coins, amount, 0, dp);
    }
}