class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length; // 3
        int column = matrix[0].length; // 4
        int end = row * column - 1; // 11
        int start = 0;
        while(end>=start){
            int mid = (end+start)/2 ; // 5.5
            int i = mid/column; // 1
            int j = mid - i * column ; // 1
            int num = matrix[i][j];
            if(num == target) return true;
            if(target > num)
                start = mid + 1;
            else end = mid - 1;        
        }
        return false;        
    }
}