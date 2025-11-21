class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (interval1, interval2) -> interval1[0] - interval2[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        int[][] res = new int[intervals.length][2];
        int index = 0;
        for(int i = 1; i < intervals.length; ++i){
            int[] interval = intervals[i];
            if(end < interval[0]){
                res[index++] = new int[]{start, end};
                start = interval[0];
                end = interval[1];
            }else{
                end = Math.max(end, interval[1]);
            }
        }
        res[index++] = new int[]{start, end};
        return Arrays.copyOf(res, index);
    }
}

// create a timeline and return the intervals on the timeline
// how to create a timeline if the interval is given
// arr[10^4+1] -
// sort a the interval base on the starting index of the intervals 
// dropin this timeline idea. 
