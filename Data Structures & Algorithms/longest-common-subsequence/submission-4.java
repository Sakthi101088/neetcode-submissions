class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] tex1 = text1.toCharArray();
        char[] tex2 = text2.toCharArray();
        int count =0;
        
        for(int i=0;i<tex1.length;i++){
            int temp = longest(tex1, tex2, i);
            count=Math.max(count, temp);
            if(count==0)
                break;
        }
        
          return count;
        
    }
    public int longest(char[] tex1, char[] tex2, int ind){
        int count = 0;
        int index = 0;
        for(int j =ind;j<tex2.length;j++){
            for(int i =index;i<tex1.length;i++){
                if(tex1[i] == tex2[j]){
                    count++;
                    index = i+1;
                    break;
                }
            }
            if(count==tex2.length)
                break;
        }
        return count;
    }
}
