class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = 0; i< m + n &&  j<n; ++i){
            if(i>=m){
                nums1[i]= nums2[j++];
            }else{
                if(nums1[i] > nums2[j]){
                    int tmp = nums2[j];
                    nums2[j] = nums1[i];
                    nums1[i] = tmp;
                    Arrays.sort(nums2);
                }
            }
        }
        
    }
}