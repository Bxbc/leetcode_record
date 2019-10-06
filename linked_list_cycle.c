/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool hasCycle(struct ListNode *head) {
    struct ListNode *pt1;
    struct ListNode *pt2;
    if(head == NULL){
        return false;
    }else{
        pt1 = head->next;
        if(pt1 == NULL){
            return false;
        }else{
            pt2 = head->next->next;
        }
    }
    while(true){
        if(pt2 == NULL){
            return false;
        }else if(pt2->next == NULL){
            return false;
        }else if(pt2->next->next == NULL){
            return false;
        }else{
            if(pt1 == pt2){
                return true;
            }else{
                pt1 = pt1->next;
                pt2 = pt2->next->next;
            }
        }
    }
}