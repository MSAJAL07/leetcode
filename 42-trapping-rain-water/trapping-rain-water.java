class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for(int i = 0; i < height.length; ++i){
            if(height[i] >= maxLeft){
                maxLeft = height[i];
                continue;
            }else{
                maxRight = 0;
                for(int j=i+1; j< height.length; ++j){
                    maxRight = Math.max( maxRight, height[j]);
                }
                if(maxRight <= height[i] ) continue;
            }
            int tmp =  Math.min(maxLeft , maxRight) - height[i];
            sum = sum + tmp;
           
        }


        return sum;
        
    }
}