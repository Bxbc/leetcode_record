package leetcode;

class house_robber {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int temp;
        int next = nums[0];
        int pre = Math.max(next,nums[1]);
        for(int i=2;i<nums.length;i++){
            temp = pre;
            pre = Math.max(nums[i]+next,pre);
            next = temp;
        }
        return pre;
    }
}
