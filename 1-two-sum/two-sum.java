class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i< nums.length; ++i){
            if(mp.containsKey(nums[i])){
                result[0] = mp.get(nums[i]);
                result[1] = i;
                return result;
            }
            mp.put(target-nums[i],i);
        }
        return result;
        
    }
}