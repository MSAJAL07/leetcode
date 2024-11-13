class Solution {
    void f(vector<int>& num, int index, vector<int>& current, vector<vector<int>>& res){
        res.push_back(current);
        for(int i = index; i<num.size(); ++i){
            if(index != i && num[i] == num[i-1]) continue;
            current.push_back(num[i]);
            f(num, i+1,current, res);
            current.pop_back();
        }
    }
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        vector<int> current;
        f(nums, 0, current, res);
        return res;

        
    }
};