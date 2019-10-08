### Validate Binary Search Tree
#### The Basics

Given a bianry tree, determine if it is a valid binary search Tree(BST)

Assume a BST is defined as follows:

* The left subtree of a node contains only nodes with keys less than the node's key.
* The right subtree of a node contains only nodes with keys greater than the node's key.
* Both the left and right subtrees must also be binary search trees.

**Example 1:**  
	
		    2  
		   / \
		  1   3  
		 Input: [2,1,3]
		 Output: true

**Exmaple 2:**

		    5
		   / \
		  1   4
		     / \
		    3   6
		 Input: [5,1,4,null,null,3,6]
		 Output: false


