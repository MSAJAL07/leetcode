class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minPriceToBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.size(); ++i) {
            if (prices[i] - minPriceToBuy > maxProfit) {
                maxProfit = prices[i] - minPriceToBuy;
            }
            if (minPriceToBuy > prices[i]) {
                minPriceToBuy = prices[i];
            }
        }
        return maxProfit;
    }
};