class Solution {
    // let asume that all the candidates are unique;

    public void fun(int[] candidates, int target, List<List<Integer>> res, List<Integer> curr, int currentSum, int i){
        if(currentSum == target){
            res.add(new ArrayList(curr));
            return;
        }
        if(i == candidates.length || currentSum > target) return;
        // not include
        int j = i;
        while(j < candidates.length && candidates[j] == candidates[i]) j++;
        fun(candidates, target , res, curr, currentSum, j);

        // include
        curr.add(candidates[i]);
        currentSum = currentSum + candidates[i];

        fun(candidates, target, res, curr, currentSum, i+1);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        fun(candidates, target, res, curr, 0, 0);
        return res;
    }
}