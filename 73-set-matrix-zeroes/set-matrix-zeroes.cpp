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
        for(int i=0; i<row; ++i){
            for(int j=0; j<column; ++j){
                if(matrix[i][j] == 0) setRowColumnZero(matrix, i, j);
            }
        }
        for(int i=0; i<row; ++i){
            for(int j=0; j<column; ++j){
                if(matrix[i][j] == -133333) matrix[i][j]=0;
            }
        }
        
    }
};