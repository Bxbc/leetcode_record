package leetcode;

/**
 * using recursion would out of time
 * should use dp to save more time
 */
class climbing_stairs_recu {
    public int climbStairsRecur(int n) {
        if(n==0 || n==1) return 1;
        return climbStairsRecur(n-1) + climbStairsRecur(n-2);
    }
}

class climbing_stairs {
    public int climbStairs(int n) {
        int[] climb = new int[n+1];
        climb[0] = 1;
        climb[1] = 1;
        for(int i=2;i<n+1;i++){
            climb[i] = climb[i-1] + climb[i-2];
        }
        return climb[n];
    }
}