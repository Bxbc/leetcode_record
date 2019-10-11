
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

from collections import defaultdict

class Solution:
    def __init__(self):
        self.dict = defaultdict(list)
        
    def levels(self,root,depth = 0):
        if(root == None):
            return
        else:
            self.dict[depth].append(root.val)
            if(root.left):
                self.levels(root.left,depth+1)
            if(root.right):
                self.levels(root.right,depth+1)
        
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        ret = []
        self.levels(root,0)
        for i in self.dict:
            ret.append(self.dict[i])
        self.dict = defaultdict(list)
        return ret