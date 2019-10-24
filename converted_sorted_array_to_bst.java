package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class converted_sorted_array_to_bst {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(0);
        root = recur(root,nums,0,nums.length-1);
        return root;

    }
    public TreeNode recur(TreeNode t,int[] nums,int begin,int end){
        if(begin>end) return null;
        int mid = begin + (end-begin)/2;
        t.val = nums[mid];
        t.left = recur(new TreeNode(0),nums,begin,mid-1);
        t.right = recur(new TreeNode(0),nums,mid+1,end);
        return t;
    }
}
