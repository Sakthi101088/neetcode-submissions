class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] tex1 = text1.toCharArray();
        char[] tex2 = text2.toCharArray();
        

        return longest(tex1,tex2);
        
    }
    public int longest(char[] tex1, char[] tex2){
        int t = 0;
        int count = 0;
        int temp = 0;
        for(int j =0;j<tex2.length;j++){
            for(int i =0;i<tex1.length;i++){
                if(tex1[i] == tex2[j]){
                    count++;
                    break;
                }
            }
                count = Math.max(count, temp);            
                if(count==tex2.length)
                    break;
                temp=0;
            }
        return count;
    }
}
