/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    private Node createList(Node head, HashMap<Node, Node> mp){
        if(head == null) return null;
        Node next = createList(head.next, mp);
        Node node = new Node(head.val);
        node.next = next;
        node.random = head.random; // need to repace with new val after new list is created.
        mp.put(head, node);
        return node;
    }
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node newHead = createList(head, mp);

        Node curr = newHead;
        while(curr != null){
            if(curr.random != null){
                curr.random = mp.get(curr.random); // repaced new randome vlaue with old ones
            }
            curr = curr.next;
        }
       return newHead;
        
    }
}