package leetcode;


import java.util.LinkedList;
import java.util.Queue;

class symmetric_tree {
    public boolean isSmmetric(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        TreeNode l,r;
        left.offer(root.left);
        right.offer(root.right);
        while(!left.isEmpty() && !right.isEmpty()){
            l = left.poll();
            r = right.poll();
            if(l==null && r==null){
                continue;
            }
            if((l==null && r!=null) || (l!=null && r==null)){
                return false;
            }
            if(l.val != r.val){
                return false;
            }
            left.offer(l.left);
            left.offer(l.right);
            right.offer(r.right);
            right.offer(r.left);
        }
        return true;
    }
}

class symmetric_tree_recur {
    public boolean isSymmetricRecur(TreeNode root) {
        if(root==null) return true;
        return recur(root.left,root.right);
    }
    public boolean recur(TreeNode left,TreeNode right) {
        if(left==null && right==null) return true;
        if((left==null && right!=null) || (left!=null && right==null)) return false;
        return (left.val==right.val && recur(left.left,right.right) && recur(left.right,right.left));
    }
}