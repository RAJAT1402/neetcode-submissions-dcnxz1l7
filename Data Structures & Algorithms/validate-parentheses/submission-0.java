class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(st.size() == 0){
                st.push(ch);
                continue;
            }
            
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                continue;
            }

            char ch1 = st.pop();

            if((ch1 == '(' && ch == ')') || (ch1 == '{' && ch == '}') ||
                (ch1 == '[' && ch == ']')){
                    // correct do nothing
            }else{
                return false;
            }
        }

        return st.size() == 0;
    }
}
