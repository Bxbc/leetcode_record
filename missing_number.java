package leetcode;

class missing_number {
    public int missingNumber(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;i++){
            ret +=nums[i];
        }
        return (nums.length+1)*(0+nums.length)/2 - ret;
    }
}
