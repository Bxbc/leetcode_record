package leetcode;

/**
 *  pre:  3  9 20 15 7  | root->3
 *  in: 9 3 15 20 7     | left->9       right->20,15,7
 *  comparing two array, when we get the same number, we get the
 *  root, and according to the root, we can divide the array into
 *  leftchild parts and right child parts
 */

class construct_binary_tree_from_preorder_and_inorder_traversal {
    private int pre = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.pre = 0;
        return construct(preorder,inorder,0,preorder.length);
    }
    public TreeNode construct(int[] preorder,int[] inorder,int begin,int end) {
        if(begin>=end) return null;
        if(begin+1==end) return new TreeNode(preorder[pre++]);
        TreeNode cur = new TreeNode(preorder[pre++]);
        for(int i=begin;i<end;i++){  // to find the root
            if(inorder[i]==cur.val){
                cur.left = construct(preorder,inorder,begin,i);
                cur.right = construct(preorder,inorder,i+1,end);
                break;
            }
        }
        return cur;
    }
}
