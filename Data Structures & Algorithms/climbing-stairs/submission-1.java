class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> stair = new HashMap<Integer, Integer>();
        stair.put(1,1);
        stair.put(2,2);
        for(int i=3;i<=n;i++){
            stair.put(i, stair.get(i-1)+stair.get(i-2));
        }
        return stair.get(n);
    }
}
