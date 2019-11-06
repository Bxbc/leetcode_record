package leetcode;

import java.util.*;

class foursum_II {
    public int fourSumCount(int[] A,int[] B,int[] C,int[] D) {
        int len = A.length;
        if(len==1) return (A[0]+B[0]+C[0]+D[0]==0)?1:0;
        Map<Integer,Integer> mAB = new HashMap();
        Map<Integer,Integer> mCD = new HashMap<>();
        int count = 0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                mAB.put(A[i]+B[j],mAB.getOrDefault(A[i]+B[j],0)+1);
                mCD.put(C[i]+D[j],mCD.getOrDefault(C[i]+D[j],0)+1);
            }
        }
        for(Integer m:mAB.keySet()){
            count += mAB.get(m)*mCD.getOrDefault(0-m,0);
        }
        return count;
    }
}
