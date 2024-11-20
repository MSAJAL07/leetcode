class Solution {
    unordered_map<int, string> set = {{2, "abc"}, {3, "def"}, {4, "ghi"},
                                      {5, "jkl"}, {6, "mno"}, {7, "pqrs"},
                                      {8, "tuv"}, {9, "wxyz"}};
    void f(string digits, int idx, vector<string>& res, string current){
        if(idx == digits.size()) {
            res.push_back(current);
            return;
        }
        string ss = set[digits[idx]-'0'];
        cout << ss << endl;
        for(int i=0; i<ss.size(); ++i){
            string _current = current + ss[i];
            if(_current.size() == digits.size()){
                res.push_back(_current);
            }else{
                f(digits, idx+1, res, _current );
            }
            
        }
    }

public:
    vector<string> letterCombinations(string digits) {
        vector<string> res;
        if (digits == "")
            return res;
        f(digits, 0, res, "");
        return res;
    }
};