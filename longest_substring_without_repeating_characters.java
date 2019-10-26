package leetcode;

import java.util.HashSet;
import java.util.Set;

class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int length = 0;
        int sequenc = 0;
        int maxseq = 1;
        Set<Character> w = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j>=0;j--){
                length = w.size();
                w.add(s.charAt(j));
                if(length!=w.size()){
                    sequenc++;
                }else{
                    break;
                }
            }
            w.clear();
            if(sequenc>maxseq){
                maxseq = sequenc;
            }
            sequenc = 0;
        }
        return maxseq;
    }
}
