class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> uset;
        for (int i = 0; i < nums.size(); ++i) {
            uset.insert(nums[i]);
        }
        if (nums.size() != uset.size()) {
            return true;
        }
        return false;
    }
};