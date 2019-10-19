package leetcode;

import java.util.Arrays;

class valid_sudoku {
    public boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){                           // line traversal
            int[] record = new int[10];
            for(int j=0;j<9;j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    record[board[i][j] - '0']++;
                }
            }
            for(int temp:record){
                if(temp>1){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){                           // column traversal
            int[] record = new int[10];
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }else{
                    record[board[j][i]-'0']++;
                }
            }
            for(int temp:record){
                if(temp>1){
                    return false;
                }
            }
        }
        int upbound = 3;                                // subsets traversal
        int leftbound = 3;
        int beginline = 0;
        int begincolumn = 0;
        int[] record = new int[10];
        int i = beginline;
        while(i<upbound){
            int j = begincolumn;
            while(j<leftbound){
//                System.out.print(i);
//                System.out.print(j);
//                System.out.println();
                if(board[i][j]=='.'){
                    j++;
                    continue;
                }else{
                    record[board[i][j]-'0']++;
                    j++;
                }
            }
            i++;
//            System.out.println(beginline);
//            System.out.println(upbound);
//            System.out.println(begincolumn);
//            System.out.println(leftbound);
            if(i==upbound){
//                System.out.println("cheak once");
//                System.out.println(Arrays.toString(record));
                for(int n=0;n<10;n++) {
                    if (record[n] > 1) {
                        return false;
                    } else {
                        record[n] = 0;
                    }
                }
                i = beginline;
                begincolumn += 3;
                leftbound += 3;
            }
            if(begincolumn >= 9){
                beginline += 3;
                upbound += 3;
                begincolumn = 0;
                leftbound = 3;
                i = beginline;
            }

            if(beginline>= 9){
                break;
            }
        }
        return true;
    }
}
