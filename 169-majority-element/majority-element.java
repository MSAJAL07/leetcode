class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; ++i){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else
                map.put(nums[i], 1);
        }
        int maxValue = 0;
        int maxKey=0;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value > maxValue){
                maxValue = value;
                maxKey = key;
            }

        }
        return maxKey;
    }
}