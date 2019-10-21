package leetcode;

import java.util.Stack;

public class valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        char[] w = s.toCharArray();
        int lens = s.length();
        boolean valid = true;
        char temp;
        int i=0;
        while(i<lens && valid){
            if(w[i]=='(' || w[i]=='[' || w[i]=='{'){
                st.push(w[i]);
            }else if(st.empty()){
                valid = false;
            }
            else{
                temp = st.pop();
                if(!((temp == '{' && w[i]=='}') || (temp == '[' && w[i]==']') || (temp=='(' && w[i]==')'))){
                    valid = false;
                }
            }
            i++;
        }
        return st.empty() && valid;
    }
}
