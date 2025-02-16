class Solution {
    int maxMoney(int index, vector<int> &nums, unordered_map<int, int> &ump) {
        if (index >= nums.size())
            return 0;
        if (ump.find(index) == ump.end())
            ump[index] = nums[index] + max(maxMoney(index + 2, nums, ump),
                                           maxMoney(index + 3, nums, ump));
        return ump[index];
    }

public:
    int rob(vector<int>& nums) {
        unordered_map<int, int> ump;
        return max(maxMoney(0, nums, ump), maxMoney(1, nums, ump));
    }
};