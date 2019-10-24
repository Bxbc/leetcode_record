package leetcode;

import java.util.HashMap;

class roman_to_integer {
    public int romanToInt(String s) {
        int ret = 0;
        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i==s.length()-1 || (s.charAt(i+1)!='V' && s.charAt(i+1)!='X')){
                    ret += 1;
                }else{
                    ret += m.get(s.charAt(i+1)) - 1;
                    i++;
                }
            }else if(s.charAt(i)=='X'){
                if(i==s.length()-1 || (s.charAt(i+1)!='L' && s.charAt(i+1)!='C')){
                    ret += 10;
                }else{
                    ret += m.get(s.charAt(i+1)) - 10;
                    i++;
                }
            }else if(s.charAt(i)=='C'){
                if(i==s.length()-1 || (s.charAt(i+1)!='D' && s.charAt(i+1)!='M')){
                    ret += 100;
                }else{
                    ret += m.get(s.charAt(i+1)) - 100;
                    i++;
                }
            }else{
                ret += m.get(s.charAt(i));
            }
        }
        return ret;
    }
}
