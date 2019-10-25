package leetcode;


import java.util.Random;

class shuffle_an_array {
    private int[] origin;
    private int[] shuffl;
    private int range;
    private Random r;
    public shuffle_an_array(int[] nums) {
        this.r = new Random();
        this.range = nums.length;
        this.origin = new int[range];
        for(int i=0;i<range;i++){
            this.origin[i] = nums[i];
        }
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int swap;
        int temp;
        this.shuffl = new int[range];
        for(int i=0;i<range;i++){
            this.shuffl[i] = this.origin[i];
        }
        for(int j=range-1;j>=0;j--){
            swap = r.nextInt(j+1);
            temp = shuffl[swap];
            shuffl[swap] = shuffl[j];
            shuffl[j] = temp;
        }
        return shuffl;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */