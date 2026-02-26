class Solution {
    // public boolean containsAnagram(List<List<Integer>> result, List<Integer> list) {
    //     List<Integer> sortedTarget = new ArrayList<>(list);
    //     Collections.sort(sortedTarget);

    //     for (List<Integer> current : result) {

    //         if (current.size() != list.size())
    //             continue;

    //         List<Integer> sortedCurrent = new ArrayList<>(current);
    //         Collections.sort(sortedCurrent);

    //         if (sortedCurrent.equals(sortedTarget)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(target - nums[i + 1], i + 1);
            for (int j = i + 2; j < nums.length; ++j) {
                if (map.containsKey(nums[j])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[map.get(nums[j])]);
                    list.add(nums[j]);

                    List<Integer> key = list.stream().sorted().toList();
                    if (seen.add(key)) {
                        result.add(list);
                    }
                }
                map.put(target - nums[j], j);
            }
        }
        return result;

    }
}