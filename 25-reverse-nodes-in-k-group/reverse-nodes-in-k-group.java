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
    private ListNode reverse(ListNode start, ListNode end){
        ListNode next = end;
        ListNode curr = start;
        while(curr != end){
            ListNode tmp = curr.next;
            curr.next = next;
            next = curr;
            curr = tmp;
        }
        return next;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        while(true){

            ListNode kth = pre;
            for(int i = 0; i<k && kth != null ; ++i){
                kth = kth.next;
            }
            if(kth == null) break;

            ListNode start = pre.next;
            ListNode next = kth.next;

            ListNode newHead = reverse(start, next);

            pre.next = newHead;
            pre = start;  // start is now swith it new item just befor the new reverse
        }
        return dummyNode.next;
        
    }
}