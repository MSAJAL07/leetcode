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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int i = 1;
        while(head != null){
             if(i % 2 == 0){
                middle = middle.next;
            }
            head = head.next;
            i++;
        }
        return middle;
        
    }
}