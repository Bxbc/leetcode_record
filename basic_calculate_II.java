package leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * this question is interesting and you can
 * look more in the book named "Compilers Principles,Techniques&Tools.
 * like syntax tree, infix and postfix expressions
 */

class basic_calculate_II {
    public int calculate(String s) {
        int len = s.length();
        Stack<Character> infix = new Stack<>();
        Stack<Integer> number = new Stack<>();
        List<String> postfix = new ArrayList<>();
        String word = "";
        int result = 0;
        int digits = 0;
        int first = 0;
        int second = 0;
        char c;
        char temp;
        for(int i=0;i<s.length();i++){                  // infix to postfix
            c = s.charAt(i);
            if(c==' ') continue;
            if(c=='+'||c=='-'){
                postfix.add(word);
                word = "";
                while(!infix.empty()){
                    temp = infix.pop();
                    postfix.add(Character.toString(temp));
                }
                infix.push(c);
            }else if(c=='*'||c=='/'){
                postfix.add(word);
                word = "";
                while(!infix.empty()){
                    if(infix.peek()=='+'||infix.peek()=='-'){
                        break;
                    }else{
                        temp = infix.pop();
                        postfix.add(Character.toString(temp));
                    }
                }
                infix.push(c);
            }else{
                word+=c;
            }
        }
        if(word.length()>0){
            postfix.add(word);
        }
        while(!infix.empty()){
            temp = infix.pop();
            postfix.add(Character.toString(temp));
        }
        for(int i=0;i<postfix.size();i++){
            if(postfix.get(i).equals("+")){
                digits = number.pop()+number.pop();
                System.out.println(digits);
                number.push(digits);
            }else if(postfix.get(i).equals("-")){
                first = number.pop();
                second = number.pop();
                digits = second - first;
                number.push(digits);
            }else if(postfix.get(i).equals("*")){
                digits = number.pop()*number.pop();
                number.push(digits);
            }else if(postfix.get(i).equals("/")){
                first = number.pop();
                second = number.pop();
                digits = second/first;
                number.push(digits);
            }else{
                number.push(Integer.parseInt(postfix.get(i)));
            }
        }
        return number.pop();
    }
}
