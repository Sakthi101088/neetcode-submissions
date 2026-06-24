class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[256];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            counts[rightChar]++;
            
            // Update the maximum frequency seen in the current window
            maxFreq = Math.max(maxFreq, counts[rightChar]);
            
            // Current window size is (right - left + 1)
            // If the characters to replace exceed k, shrink the window from the left
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                counts[leftChar]--;
                left++;
            }
            
            // The window is now valid; calculate its size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
        // char large = ' ';
        // int output = 1;
        // int temp=0;
        // Map<Character, Integer> map = new HashMap<>();
        // for(char str : s.toCharArray()){
        //     map.put(str, map.getOrDefault(str,0)+1);
        // }

        // for(Map.Entry<Character, Integer> te : map.entrySet()){
        //     int val = te.getValue();
        //     output=Math.max(output,val);
        //     if(val==output)
        //         large = te.getKey();
        // }
        // for(Map.Entry<Character, Integer> te : map.entrySet()){
        //     if(te.getKey() != large)
        //         temp=temp+te.getValue();
        // }
        // if(temp>=k)
        //     return output+k;
        // else
        //     return output+temp;
    }
}
