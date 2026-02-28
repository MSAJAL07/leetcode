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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        int eftK = k % len;
        if(eftK == 0) return head;
        ListNode end = curr;
        
        curr = head;
        for(int i =0; i < len - eftK-1; ++i){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        end.next = head;
        return newHead;
    }

}