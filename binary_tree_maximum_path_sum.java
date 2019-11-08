package leetcode;

class binary_tree_maximum_path_sum {
    private int result = 1<<31;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return result;
    }
    public int dfs(TreeNode root) {
        if(root==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int cur = root.val;
        int maxbranch = Math.max(left,right);
        int twobranch = Math.max(maxbranch,left+right);
        result = Math.max(result,cur+Math.max(twobranch,0));
        return cur+Math.max(maxbranch,0);
    }
}
