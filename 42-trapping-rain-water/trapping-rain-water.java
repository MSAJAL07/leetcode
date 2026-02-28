class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                  
                }else{
                    sum = sum + maxLeft - height[left];
                }
                left ++;
                
            }else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                  
                }else{
                    sum = sum + maxRight - height[right];
                }
                right --;
            }
        }

        return sum;
        
    }
}