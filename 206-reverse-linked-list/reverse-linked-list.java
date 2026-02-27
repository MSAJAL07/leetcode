/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode updatedNext = null;
        ListNode current = null;
        while(head != null){
            current = head;
            head = head.next;
            current.next = updatedNext;
            updatedNext = current;
        }
        return current;
        
    }
}