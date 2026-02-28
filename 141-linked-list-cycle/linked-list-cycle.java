/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;

        }
        return false;
        // HashSet<ListNode> hs = new HashSet<>();

        // while(head != null){
        //    if( !hs.add(head)) return true;
        //    head = head.next;
        // }
        // return false;

        
    }
}