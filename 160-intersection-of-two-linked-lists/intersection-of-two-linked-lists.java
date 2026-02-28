/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        int l1=0; int l2=0;
        while(currentA != null){
            l1++;
            currentA = currentA.next;
        }
         while(currentB != null){
            l2++;
            currentB = currentB.next;
        }
        currentA = headA;
        currentB = headB;
        if(l1 > l2){
            for(int i =0; i< l1-l2; ++i){
                currentA = currentA.next;
            }
        }else {
            for(int i =0; i< l2-l1; ++i){
                currentB = currentB.next;
            }
        }
        System.out.println("A = " + currentA.val + " B = " + currentB.val);
        ListNode result = null; 
        while(currentA != null && currentB != null){
            if(currentA == currentB && result == null){
                result = currentA;
            }

            if(currentA != currentB) result =  null;

            currentA = currentA.next;
            currentB = currentB.next;
        }
        return result;
        
    }
}