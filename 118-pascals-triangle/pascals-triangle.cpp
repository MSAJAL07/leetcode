class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for( int i = 0; i < numRows; ++i){
            vector<int> row;
            row.push_back(1);
            for(int j=1; j <= i; ++j){
                if(j == i){
                    row.push_back(1);
                }else{
                    row.push_back(res[i-1][j-1] + res[i-1][j]);
                }
            }
            res.push_back(row);
        }
        return res; 
    }
};