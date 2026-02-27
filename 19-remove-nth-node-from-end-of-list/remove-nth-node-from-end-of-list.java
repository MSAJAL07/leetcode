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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode node = head;
        ListNode tmp = null;
        int count = 0;
        while(node != null){
            count++;
            if(count > n)
                tmp = tmp != null ? tmp.next : head;
            node = node.next;
            
        }
        if(tmp != null)
            tmp.next = tmp.next.next;
        else head = head.next;
        return head;

    }
}