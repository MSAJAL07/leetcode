class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums)
            hashSet.add(num);
        int count = 1;
        int max = 1;
        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int x = num+1;
                count = 1;
                while (hashSet.contains(x)) {
                    count++;
                    x++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}