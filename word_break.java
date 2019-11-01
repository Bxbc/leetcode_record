package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


class word_break_recur {
    public boolean wordBreak_recur(String s,List<String> wordDict) {
        Set<String> dic = new HashSet<>();
        for(String e:wordDict){dic.add(e);}
        return dfs(s,dic);
    }

    public boolean dfs(String s,Set<String> dic) {
        if(s.length()==0) return true;
        for(int i=1;i<=s.length();i++){
            if(dic.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()),dic)){
                return true;
            }
        }
        return false;
    }
}

class word_break_DP {
    public boolean wordBreak_DP(String s,List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<s.length()+1;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
