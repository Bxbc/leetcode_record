package leetcode;

class maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        int depth = maxdp(root,0);
        return depth;
    }
    public int maxdp(TreeNode t,int depth) {
        if(t==null) return depth;
        int a = maxdp(t.left,depth+1);
        int b = maxdp(t.right,depth+1);
        if(a>=b) return a;
        return b;
    }
}
