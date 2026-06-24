class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result=false;
        HashMap<Character,Integer> s1 = new LinkedHashMap<Character,Integer>();
        HashMap<Character,Integer> t1 = new LinkedHashMap<Character,Integer>();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                if(s1.containsKey(s.charAt(i))){
                    int temp = s1.get(s.charAt(i));
                    s1.put(s.charAt(i),temp+1);
                }
                else
                    s1.put(s.charAt(i),1);
            }
            for(int i=0;i<t.length();i++){
                if(t1.containsKey(t.charAt(i))){
                    int temp = t1.get(t.charAt(i));
                    t1.put(t.charAt(i),temp+1);
                }
                else
                    t1.put(t.charAt(i),1);
            }
                System.out.println(s1);
                System.out.println(t1);
            if(s1.equals(t1)){
                result=true;
            }
        }
        return result;
    }
}
