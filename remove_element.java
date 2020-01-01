package leetcode;

class remove_element {
    public int removeElement(int[] nums, int val) {
        int i = 0,j = 0;
        int len = nums.length;
        while(j<len){
            if(nums[j]==val){
                j++;
            }else{
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}
