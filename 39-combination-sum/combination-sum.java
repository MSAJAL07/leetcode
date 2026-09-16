class Solution {

    void fun(int[] candidates, int target, List<List<Integer>> res, List<Integer> curr, int currentSum, int i) {
        // break conditions

        if (currentSum == target) {
            res.add(new ArrayList<>(curr));
            return;
        } 

        if (i == candidates.length || currentSum > target )
            return;

        // not include;
        fun(candidates, target, res, curr, currentSum, i + 1);
        
        curr.add(candidates[i]);
        currentSum = currentSum + candidates[i];
        //System.out.println("Current Sum " + currentSum + " Target " + target);
        
        fun(candidates, target, res, curr, currentSum, i);
        curr.remove(curr.size() - 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        fun(candidates, target, res, curr, 0, 0);
        return res;

    }
}