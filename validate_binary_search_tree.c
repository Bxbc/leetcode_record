/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

#include<limits.h>

int maxkey(struct TreeNode* root){
    if(root == NULL){
        return INT_MIN;
    }else{
        int a = maxkey(root->left);
        int b = maxkey(root->right);
        int c = root->val;
        int maxval = (a>=b)*a + (a<b)*b;
        return (maxval>=c)*maxval+(maxval<c)*c;
    }
}

int minkey(struct TreeNode* root){
    if(root == NULL){
        return INT_MAX;
    }else{
        int a = minkey(root->left);
        int b = minkey(root->right);
        int c = root->val;
        int minval = (a>=b)*b+(a<b)*a;
        return (minval>=c)*c+(minval<c)*minval;
    }
}

bool isValidBST(struct TreeNode* root){
    if(root == NULL || (root->left == NULL && root->right == NULL)){
        return true;
    }else if(root->left == NULL && root->right != NULL){
        return (root->val < minkey(root->right)) && isValidBST(root->right);
    }else if(root->left != NULL && root->right == NULL){
        return (root->val > maxkey(root->left)) && isValidBST(root->left);
    }else{
        return isValidBST(root->left) && isValidBST(root->right) && (root->val > maxkey(root->left)) && (root->val < minkey(root->right));
    }    
}

