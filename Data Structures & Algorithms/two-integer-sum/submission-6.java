class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(numbs.containsKey(diff))
                return new int[] {numbs.get(diff), i};
            numbs.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}
