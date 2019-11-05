package leetcode;

import java.util.*;

// Time complextiy O(n^2)
class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ret = new ArrayList<>();
        if(len<3) return ret;
        for(int i=0;i<len-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue; // skip the duplication
            if(nums[i]+nums[len-1]+nums[len-2]<0) continue; // skip the small one
            if(nums[i]+nums[i+1]+nums[i+2]>0) break;    // break the when the number in array is too big
            int start = i+1;
            int end = len - 1;  // Use the binary search
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ret.add(Arrays.asList(nums[i],nums[start],nums[end])); // check the duplicate
                    for(;start<end && nums[start]==nums[start+1];start++);
                    for(;start<end && nums[end]==nums[end-1];end--);
                    start++;
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return ret;
    }
}
