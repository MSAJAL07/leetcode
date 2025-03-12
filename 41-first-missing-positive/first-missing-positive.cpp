class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int res = 1;
        sort(nums.begin(), nums.end());
        for(int i=0; i < nums.size(); ++i){
            if(nums[i] <= 0) continue;
            if(nums[i]== res){
                res++;
            }
        }

       return res;
        
    }
};