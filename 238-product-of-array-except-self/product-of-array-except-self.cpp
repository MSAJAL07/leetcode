class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;
        int product = 1;
        int zero_count = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zero_count += 1;
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if ( zero_count > 1)
                res.push_back(0);
            else if (zero_count) {
                if (nums[i] == 0)
                    res.push_back(product);
                else
                    res.push_back(0);
            } else {
                res.push_back(product / nums[i]);
            }
        }
        return res;
    }
};