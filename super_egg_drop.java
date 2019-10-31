package leetcode;

/**
 * min(max(opt(K-1,F-1),opt(K,N-F)+1)), where the F is the current floor.
 *
 * Space complexity is O(KN)
 * Time complexity is O(KNN)
 *
 */


class super_egg_drop_DP {
    public int superEggDrop(int K,int N) {
        int[][] dp = new int[K+1][N+1];
        for(int i=0;i<K+1;i++){
            for(int j=0;j<N+1;j++){
                dp[i][j] = j;
            }
        }
        for(int i=2;i<K+1;i++){
            for(int j=2;j<N+1;j++){
                for(int k=1;k<j+1;k++){
                    dp[i][j] = Math.min(Math.max(dp[i-1][k-1],dp[i][j-k])+1,dp[i][j]);
                }
            }
        }
        return dp[K][N];
    }
}

/**
 * Optimization
 * Get idea from other leetcoder https://leetcode.com/problems/super-egg-drop/discuss/158974/C%2B%2BJavaPython-2D-and-1D-DP-O(KlogN)
 * transfer the question to find out the maximum floors that can be test
 * for given eggs.
 */
class super_egg_drop_OP {
    public int superEggDrops(int K,int N) {
        int[][] dp = new int[K+1][N+1];
        int moves = 0;
        while(dp[K][moves]<N){
            moves++;
            for(int i=1;i<K+1;i++){
                dp[i][moves] = dp[i-1][moves-1] + dp[i][moves-1]+1;
            }
        }
        return moves;
    }
}