class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[256];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            System.out.println("RightChar : "+right+" : "+rightChar);
            counts[rightChar]++;
            maxFreq = Math.max(maxFreq, counts[rightChar]);

            System.out.println("MaxFreq : "+maxFreq+" : "+counts[rightChar]);
            
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                counts[leftChar]--;
                left++;
                System.out.println("LeftChar : "+left+" : "+leftChar);
                System.out.println("Left : "+left);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            System.out.println("maxLength : "+maxLength);
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
