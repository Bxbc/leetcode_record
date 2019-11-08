package leetcode;

import java.util.*;

class binary_tree_zigzag_level_order_traversal {
    private Map<Integer,List<Integer>> m = new HashMap<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> t = new ArrayList<>();
        dfs(0,root);
        int len = m.keySet().size();
        int zig = 0;
        List<Integer> temp;
        for(int i=0;i<len;i++){
            if(zig==0){
                t.add(m.get(i));
                zig = 1;
            }else{
                temp = m.get(i);
                Collections.reverse(temp);
                t.add(temp);
                zig = 0;
            }
        }
        return t;
    }
    public void dfs(int depth,TreeNode root) {
        if(root==null) return;
        List<Integer> temp;
        if(m.containsKey(depth)){
            temp = m.get(depth);
            temp.add(root.val);
            m.put(depth,temp);
        }else{
            temp = new ArrayList<>();
            temp.add(root.val);
            m.put(depth,temp);
        }
        dfs(depth+1,root.left);
        dfs(depth+1,root.right);
        return;
    }
}
