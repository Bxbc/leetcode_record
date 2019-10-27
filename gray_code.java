package leetcode;

import java.util.ArrayList;
import java.util.List;

class gray_code {
    public List<Integer> grayCode(int n) {
        List<Integer> s = new ArrayList<>();
        int len = (int)Math.pow(2,n);
        for(int i=0;i<len;i++){
            s.add(i>>1^i);
        }
        return s;
    }
}
