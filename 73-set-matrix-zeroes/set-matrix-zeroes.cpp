class Solution {
    void setRowColumnZero(vector<vector<int>>& matrix, int row, int column){
        // set column to zero
        for(int i=0; i<matrix.size(); ++i){
            if( matrix[i][column] != 0)
            matrix[i][column] = -133333;
        }
        for(int i=0; i<matrix[0].size(); ++i){
            if( matrix[row][i] != 0)
            matrix[row][i] = -133333;
        }

    }
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int row = matrix.size();
        int column  = matrix[0].size();
        bool flag1 = false;
        bool flag2 = false;
        for(int i=0; i<row; ++i){
            if(matrix[i][0]==0) flag1 = true;
        }
        for(int i=0; i<column; ++i){
           if(matrix[0][i]== 0) flag2 = true;
        }
        for(int i=1; i<row; ++i){
            for(int j=1; j<column; ++j){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<row; ++i){
            if(matrix[i][0] == 0){
                for(int j=1; j<column; ++j) matrix[i][j] = 0;
            }
        }
        for(int j=1; j<column; ++j){
            if(matrix[0][j]==0) {
                for(int i=1; i<row; ++i) matrix[i][j] = 0;
            }
        }
         for(int i=0; i<row; ++i){
            if(flag1) matrix[i][0]=0;
        }
        for(int i=0; i<column; ++i){
           if(flag2) matrix[0][i]= 0;
        }
        
    }
};