class Solution {
public:

    void nextPermutation(vector<int>& nums) {
        int len = nums.size();
        int brk = -1;
        for (int i = len - 1; i > 0; --i) {
            if (nums[i] > nums[i - 1]) {
                brk = i-1;
                break;
            }
        }
        cout<<brk;
        if (brk == -1) {
            reverse(nums.begin(), nums.end());
        } else {
            int replecemnt = -1;
            for (int i = len - 1; i > brk; --i) {
                if (nums[i] > nums[brk]){
                    int tmp = nums[i];
                    nums[i] = nums[brk];
                    nums[brk] = tmp;
                    break;
                }
            }
            reverse(nums.begin()+brk +1,nums.end());
        }
    }
};