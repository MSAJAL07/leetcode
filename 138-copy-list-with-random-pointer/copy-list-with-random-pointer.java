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
    // private Node createList(Node head, HashMap<Node, Node> mp){
    //     if(head == null) return null;
    //     Node next = createList(head.next, mp);
    //     Node node = new Node(head.val);
    //     node.next = next;
    //     node.random = head.random; // need to repace with new val after new list is created.
    //     mp.put(head, node);
    //     return node;
    // }
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while (curr != null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        curr = head;
        while (curr != null){
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while (curr != null){
            Node copy = curr.next;
            curr.next = copy.next;
            if(copy.next != null)
                copy.next = copy.next.next;
            curr = curr.next;
        }
        return newHead;
    }
}