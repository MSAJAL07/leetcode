class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int result =1;
        HashMap<Character, Boolean> map = new HashMap<>();
        int left = 0;
        int right =1;
        map.put(s.charAt(0), true);
        while(right < s.length() ){
            if(!map.getOrDefault(s.charAt(right), false)){
                map.put(s.charAt(right), true);
                result = Math.max(result, right-left+1);
                right++;
            }else{
                while(left <right){
                    if(s.charAt(left) != s.charAt(right)){
                        map.remove(s.charAt(left));
                        left++;
                    }else{
                        left++;
                        right++;
                        break;
                    }

                }
            }
        }
        return result;
        
    }
}