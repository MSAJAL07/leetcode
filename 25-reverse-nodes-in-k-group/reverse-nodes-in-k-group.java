class Solution {

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = end;
        ListNode curr = start;

        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // new head of this reversed block
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {

            // find kth node
            ListNode kth = groupPrev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) break;

            ListNode groupNext = kth.next;
            ListNode groupStart = groupPrev.next;

            // reverse this group
            ListNode newHead = reverse(groupStart, groupNext);

            // reconnect
            groupPrev.next = newHead;
            groupPrev = groupStart;
        }

        return dummy.next;
    }
}