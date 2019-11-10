package leetcode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

class cells_with_odd_values_in_a_matrix {
    public int oddCells(int n,int m,int[][] indices) {
        int len = indices.length;
        int row,col;
        int[][] matrix = new int[n][m];
        int count = 0;
        for(int i=0;i<len;i++){
            row = indices[i][0];
            col = indices[i][1];
            for(int s=0;s<m;s++){
                matrix[row][s]++;
            }
            for(int t=0;t<n;t++){
                matrix[t][col]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}

class reconstruct_a_2_row_binary_matrix {
    public List<List<Integer>> reconstructMatrix(int upper,int lower,int[] colsum) {
        int lencol = colsum.length;
        List<List<Integer>> matrix = new ArrayList<>();
        if(!checkexists(upper,lower,colsum)) return matrix;
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        for(int i=0;i<lencol;i++){
            if(colsum[i]==0){
                row1.add(0);
                row2.add(0);
            }else if(colsum[i]==2){
                row1.add(1);
                row2.add(1);
            }else{
                if(upper>lower){
                    row1.add(1);
                    row2.add(0);
                    upper--;
                }else{
                    row1.add(0);
                    row2.add(1);
                    lower--;
                }
            }
            matrix.add(row1);
            matrix.add(row2);
        }
        return matrix;
    }
    public boolean checkexists(int upper,int lower,int[] colsum) {
        int countcol = 0;
        int maxcol = -1;
        int colnonZero = 0;
        for(Integer t:colsum){
            countcol += t;
            maxcol = Math.max(maxcol,t);
            if(t>0) colnonZero++;
        }
        if(upper+lower!=countcol || Math.max(upper,lower)>colnonZero || maxcol>upper+lower) return false;
        return true;
    }
}

class number_of_close_islands {
    public int closedIsland(int[][] grid) {
        return 0;
    }
}