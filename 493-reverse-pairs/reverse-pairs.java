class Solution {
    private int[] tmp; // single shared temp array

    private void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }
        while (i <= mid) tmp[k++] = arr[i++];
        while (j <= right) tmp[k++] = arr[j++];
        System.arraycopy(tmp, left, arr, left, right - left + 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2; // avoids overflow vs (left+right)/2
        int result = mergeSort(nums, left, mid)
                   + mergeSort(nums, mid + 1, right);

        int j = mid + 1;
        for (int i = left; i <= mid; ++i) {
            while (j <= right && nums[i] > 2L * nums[j]) j++;
            result += j - (mid + 1);
        }
        merge(nums, left, mid, right);
        return result;
    }

    public int reversePairs(int[] nums) {
        tmp = new int[nums.length]; // allocate once
        return mergeSort(nums, 0, nums.length - 1);
    }
}