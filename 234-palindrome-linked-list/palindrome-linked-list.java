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


    public boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            count ++;
            curr = curr.next;
        }
        curr = head;
        ListNode next = null;
        for(int i = 0; i < count/2 ; ++i){
            ListNode tmp = curr.next;
            curr.next = next;
            next = curr;
            curr = tmp;
        }
        head.next = curr;
        head = next;
        if(count % 2 != 0) curr = curr.next;
        for(int i = 0; i < count/2 ; ++i){
            if(head.val != curr.val) return false;
            head = head.next;
            curr = curr.next;
        }
        return true;
    }
}