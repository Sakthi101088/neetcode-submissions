class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int temp=1;
        Set<Integer> setnums = new TreeSet<Integer>();
        for(int num: nums){
            setnums.add(num);
        }
        for(int setnum:setnums){
            if(setnums.contains(setnum+1))
                temp++;
            else{
                max = Math.max(temp,max);
                temp=1;
            }
        }
        return max;
    }
}
