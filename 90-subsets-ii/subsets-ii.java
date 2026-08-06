class Solution {
    public void f(int[] nums, List<List<Integer>> res, List<Integer> curr, int i){
        if(i == nums.length) return;
        int j = i;
        while( j < nums.length && nums[j] == nums[i]) j++;
        f(nums, res, curr, j);
        curr.add(nums[i]);
        res.add(new ArrayList<>(curr));
        f(nums, res, curr, i+1);
        curr.remove(curr.size()-1);
    
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        result.add(curr);
        f(nums, result, curr, 0);
        return result;
        
    }
}