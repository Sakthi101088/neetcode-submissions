class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        
        Map<Character, Integer> search = new HashMap<>();
        for(int i=0;i<t.length();i++)
            search.put(t.charAt(i), search.getOrDefault(t.charAt(i),0)+1);

        int total = t.length();
        int left=0;
        int bestLength = Integer.MAX_VALUE;
        int bestStartIndex=0;


        for(int i=0; i<s.length();i++){
            if(search.containsKey(s.charAt(i))){
                if(search.get(s.charAt(i)) > 0){
                    total--;
                search.put(s.charAt(i), search.get(s.charAt(i))-1);
                }
            }

            while(total==0){
                if(bestLength>(i-left+1)){
                    bestLength = i-left+1;
                    bestStartIndex = left;
                }
                
                if(search.containsKey(s.charAt(left))){
                    search.put(s.charAt(left), search.get(s.charAt(left))+1);
                    if(search.get(s.charAt(left))>0)
                        total++;
                }
                   left++;
            }
        }
        return bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStartIndex,bestStartIndex+bestLength);
    }
}