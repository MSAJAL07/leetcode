class Solution {
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
} // Dutch National Flag (DNF) algorithm is a sorting algorithm
    public void sortColors(int[] nums) {
        int low = 0; // 0, 0
        int mid = 0; // 1 , 2
        int high = nums.length-1; // 2, 1
        while(mid <= high){
            if(nums[mid] == 2){
                Solution.swap(nums, mid, high);
               // mid++;
                high--;
            } else if(nums[mid] == 0){
                Solution.swap(nums, low, mid);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
}