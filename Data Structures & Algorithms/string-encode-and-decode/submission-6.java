class Solution {

    public String encode(List<String> strs) {
        String output="";
        for(String str : strs){
            output=output+str.length()+"#"+str;
        }
        return output;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int len = 0;
        String temp= "";
        String[] inputs = str.split("#");
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i) == '#')){
                temp=temp+str.charAt(i);
                continue;
            }
            len = Integer.valueOf(temp);
            list.add(str.substring(i+1,i+1+len));
            i=i+len;
            temp="";
        }
        return list;
    }
}
