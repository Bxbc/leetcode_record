package leetcode;

import java.util.*;

class binary_tree_inorder_traversal_itr {
    public List<Integer> inorderTraversal_itr(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if(root==null) return nodes;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(null!=cur || !s.empty()){
            if(null!=cur){
                s.push(cur);
                cur = cur.left;
            }else{
                cur = s.pop();
                nodes.add(cur.val);
                cur = cur.right;
            }
        }
        return nodes;
    }
}
