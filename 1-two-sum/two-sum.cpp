class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int, int> umap;
        umap[target - nums[0]] = 0;

        for (int i = 1; i < nums.size(); ++i) {

            if (umap.find(nums[i]) != umap.end()) {
                res.push_back(umap[nums[i]]);
                res.push_back(i);
                break;
            }
            umap[target - nums[i]] = i;
        }
        return res;
    }
};