class Solution {
    private void merge(int[] arr, int left, int mid, int right){
        int[] tmp = new int[right-left +1];
        int i = left; int j = mid+1; int k =0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j])
                tmp[k++] = arr[i++];
            else if(arr[i]> arr[j])
                tmp[k++] = arr[j++];
        }
        while(i<=mid)
            tmp[k++] = arr[i++];
        while(j <= right) 
            tmp[k++] = arr[j++];
        for(i =left, k =0; i<=right; ++i, ++k){
            arr[i] = tmp[k];
        }
    }

    private int mergeSort(int[] nums, int left, int right) {
        int result = 0;
        if (left >= right)
            return result;

        int mid = (left + right) / 2;
        result += mergeSort(nums, left, mid);
        result += mergeSort(nums, mid + 1, right);
        int j = mid+1;
        for(int i = left; i<=mid; ++i){
            while( j<=right && nums[i] > 2 * (long)nums[j]){
                j++;
            }
            result += j -(mid + 1);
        }
        merge(nums, left, mid, right);
        return result;

    }

    public int reversePairs(int[] nums) {
        // int result = 0;
        // for (int i = 0; i < nums.length - 1; ++i) {
        //     for (int j = i + 1; j < nums.length; ++j) {
        //         if (nums[i] >  2L * nums[j]) {
        //             result++;
        //         }
        //     }
        // }
        // return result;
        return mergeSort(nums, 0, nums.length - 1);

    }
}