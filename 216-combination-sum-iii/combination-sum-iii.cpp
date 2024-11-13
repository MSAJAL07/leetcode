class Solution {
    void f(int k, int n, vector<int>& nums, int index, vector<int> current,
           vector<vector<int>>& res, int sum) {
        if (index == nums.size())
            return;

        f(k, n, nums, index + 1, current, res, sum);
        sum += nums[index];
        current.push_back(nums[index]);
        if (current.size() == k && sum == n) {
            res.push_back(current);
        }
        f(k, n, nums, index + 1, current, res, sum);
        // current.pop_back();
    }

public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<int> nums(9);
        iota(nums.begin(), nums.end(), 1);
        vector<int> current;
        vector<vector<int>> res;
        f(k, n, nums, 0, current, res, 0);
        return res;
    }
};