package leetcode;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val=x; }
}

class countTree {
    public int countNodes(TreeNode t) {
        if(t==null) return 0;
        return countNodes(t.left)+countNodes(t.right)+1;
    }
    public int countLeaves(TreeNode t) {
        if(t==null) return 0;
        if(t.left==null && t.right==null) return 1;
        return countLeaves(t.left)+countLeaves(t.right);
    }
    public int countInternal(TreeNode t) {
        if(t==null) return 0;
        if(t.left!=null && t.right!=null) return countInternal(t.left)+countInternal(t.right)+1;
        return countInternal(t.left)+countInternal(t.right);
    }
}

class printTree {
    public static void printTrees(TreeNode t,int depth) {
        if(t!=null){
            depth++;
            printTrees(t.right,depth);
            for(int i=1;i<depth;i++){
                System.out.print('\t');
            }
            System.out.println(t.val);
            printTrees(t.left,depth);
        }
    }
}
