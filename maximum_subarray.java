package leetcode;

class maximum_subarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int[] record = new int[nums.length];
        record[0] = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]+record[i-1]>nums[i]){
                record[i] = nums[i]+record[i-1];   // record[i] recording the maxsum including the nums[i];
            }else{
                 record[i]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(record[i]>max){
                max = record[i];
            }
        }
        return max;
    }
}
