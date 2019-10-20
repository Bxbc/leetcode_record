package leetcode;

import java.util.Collections;

class rotate_image {
    public void rotate(int[][] matrix){
        int lens = matrix.length;
        if(matrix == null && lens == 0){
            return;
        }
        int temp;
        for(int i=0;i<lens;i++){
            for(int j=0;j<lens;j++){
                if(i > j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<lens;i++){
            for(int j=0;j<lens/2;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][lens-1-j];
                matrix[i][lens-1-j] = temp;
            }
        }
    }
}


