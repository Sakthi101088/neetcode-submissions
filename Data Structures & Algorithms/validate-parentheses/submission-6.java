class Solution {
    public boolean isValid(String s) {
        boolean output = true;
        Stack<Character> in = new Stack<>();
        if(s.toCharArray().length %2 !=0)
            return false;
        for(char c : s.toCharArray()){
            if(c == '{')
                in.push('}');
            else if(c == '[')
                in.push(']');
            else if(c == '(')
                in.push(')');
            else if(in.empty() || in.pop() != c)
                return false;
        }
        if(in.empty())
            return output;
        else
            return false;
    }
}
