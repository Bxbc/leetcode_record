package leetcode;

import java.util.ArrayList;
import java.util.List;

class binary_tree_inorder_traversal_rec {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        return travl(root,nodes);
    }
    private List<Integer> travl(TreeNode root,List<Integer> nodes){
        if(root==null) return null;
        travl(root.left,nodes);
        nodes.add(root.val);
        travl(root.right,nodes);
        return nodes;
    }
}
