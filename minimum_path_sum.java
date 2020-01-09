package leetcode;

class minimum_path_sum {
    public int minPathSum(int[][] grid) {
        int leng = grid.length;
        int width = grid[0].length;
        int[][] sum = new int[leng][width];
        for(int i=0;i<leng;i++){
            for(int j=0;j<width;j++){
                if(i==0 && j==0){
                    sum[i][j] = grid[i][j];
                }else if(i==0){
                    sum[i][j] = grid[i][j] + sum[i][j-1];
                }else if(j==0){
                    sum[i][j] = grid[i][j] + sum[i-1][j];
                }else{
                    sum[i][j] = Math.min(sum[i][j-1],sum[i-1][j]) + grid[i][j];
                }
            }
        }
        return sum[leng-1][width-1];
    }
}
