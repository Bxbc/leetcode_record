package leetcode;


import java.util.ArrayList;
import java.util.List;

class longest_common_prefix {
    public String longestCommonPrefix(String[] strs){
        int lens = strs.length;
        int cur = 0;
        if(lens==0){
            return "";
        }
        List<Character> s = new ArrayList<>();
        StringBuilder ret = new StringBuilder("");
        for(int i=0;i<strs[0].length();i++){
            s.add(strs[0].toCharArray()[i]);
        }
        for(int i=1;i<lens;i++){
            for(int j=0;j<s.size();j++){
                if(j>=strs[i].length() || s.get(j) != strs[i].toCharArray()[j]){
                    cur = s.size();
                    for(int n=0;n<cur-j;n++) {
                        s.remove(s.size() - 1);
                    }
                }else{
                    continue;
                    }
                }
            }
        for(int i=0;i<s.size();i++){
            ret.append(s.get(i));
        }
        String words = ret.toString();
        return words;
    }
}
