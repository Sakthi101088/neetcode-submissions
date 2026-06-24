class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> input = new HashMap<>();
        int left = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            if(input.containsKey(ch)){
                left = Math.max(left, input.get(ch)+1);
            }
            input.put(ch, right);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
