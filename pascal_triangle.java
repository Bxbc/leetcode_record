package leetcode;

import java.util.ArrayList;
import java.util.List;

class pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> rows;
        int temp = 0;
        for(int i=0;i<numRows;i++){
            rows = new ArrayList<>();
            rows.add(1);
            for(int j=1;j<i;j++){
                temp = pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j);
                rows.add(temp);
                System.out.println(rows);
            }
            if(rows.size()<i+1){
                rows.add(1);
            }
            pascal.add(rows);
        }
        return pascal;
    }
}
