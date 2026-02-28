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
    private ListNode reverse(ListNode start){
        ListNode next = null;
        while(start != null){
            ListNode tmp = start.next;
            start.next = next;
            next = start;
            start = tmp;
        }
        return next;
    }


    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
       
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);   

        while(second != null){
            if(head.val != second.val) return false;
            head = head.next;
            second = second.next;
        }
        return true;
    }
}