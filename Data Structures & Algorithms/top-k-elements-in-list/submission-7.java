class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num :nums)
            map.put(num, map.getOrDefault(num, 1)+1);
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int n : map.keySet()) {
            System.out.println(n);
            heap.add(n);
        }

        // 3. Extract results
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}