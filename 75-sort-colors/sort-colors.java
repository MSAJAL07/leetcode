class Solution {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        for( int num :  nums){
            if(num == 0) redCount++;
            if(num == 1) whiteCount++;
            else blueCount++; 
        }
        for(int i = 0; i < nums.length; ++i){
            if(redCount > 0) {
                nums[i] =0;
                redCount--;
            }else if(whiteCount > 0){
                nums[i] = 1;
                whiteCount--;
            }else if(blueCount > 0){
                nums[i] = 2;
                blueCount--;
            } 
        }
    }
}