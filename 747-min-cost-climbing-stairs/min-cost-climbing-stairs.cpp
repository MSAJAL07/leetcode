class Solution {
    int minCost(int index, int n, vector<int> &cost, unordered_map<int,int> &ump){
        if(n == index) return cost[index];
        if(index > n) return 0;
        if(ump.find(index) == ump.end())
            ump[index] = cost[index] +  min(minCost(index+1, n, cost, ump), minCost(index + 2, n,cost, ump));
        return ump[index];

    }
public:
    int minCostClimbingStairs(vector<int> &cost) {
        unordered_map<int,int> ump;
        return min(minCost(0, cost.size()-1, cost, ump), minCost(1, cost.size()-1, cost, ump));
    }
};