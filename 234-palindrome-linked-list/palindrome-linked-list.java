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
    // private isP(ListNode head, ListNode current){

    // }
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> st = new ArrayDeque<>();
        ListNode curr = head;
        while(curr != null){
            st.push(curr);
            curr = curr.next;
        }
        curr = head;
        while(!st.isEmpty() && curr != null){
            if(st.peek().val != curr.val) return false;
            st.pop();
            curr = curr.next;
        }
        return true;

        
    }
}