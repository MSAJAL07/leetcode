class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int len = nums.size();
        int max = nums[0];
        int sum = max;
        for (int b = 1; b < len; ++b) {
            if (nums[b] >= sum + nums[b]) {
                sum = nums[b];
             
            } else {
                sum += nums[b];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
};