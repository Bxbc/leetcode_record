package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CustomFunction {
    public int f(int x,int y) {
        return x+y;
    }
}

class contest_1 {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> e;
        for(int i=1;i<1001;i++){

            for(int j=i;j<1001;j++){
                e = new ArrayList<>();
                if(customfunction.f(i,j)==z){
                    e.add(i);
                    e.add(j);
                    if(customfunction.f(j,i)==z && i!=j){
                        r.add(e);
                        e = new ArrayList<>();
                        e.add(j);
                        e.add(i);
                    }
                }else if(customfunction.f(j,i)==z){
                    if(e.size()!=0){
                        r.add(e);
                        e = new ArrayList<>();
                    }
                    e.add(j);
                    e.add(i);
                }
                if(e.size()!=0){
                    r.add(e);
                }
            }
        }
        return r;
    }
}

class contest_5238 {
    public List<Integer> circularPremutation(int n,int start) {
        int count = (int)Math.pow(2,n);
        List<Integer> s = new ArrayList<>();
        List<Integer> w = new ArrayList<>();
        for(int i=0;i<count;i++){
            s.add(i>>1^i);
        }
        int index = s.indexOf(start);
        for(int i=0;i<count;i++){
            if(i==index){
                for(int j=0;j<count;j++){
                    w.set(j%i,s.get(i));
                }
                return w;
            }
        }
        return null;
    }
}