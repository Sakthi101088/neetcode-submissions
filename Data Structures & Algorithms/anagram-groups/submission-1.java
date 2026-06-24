class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> list = output.getOrDefault(String.valueOf(chars), new ArrayList<>());
            list.add(str);
            output.put(String.valueOf(chars), list);
        }
        return new ArrayList<>(output.values());
    }
}
