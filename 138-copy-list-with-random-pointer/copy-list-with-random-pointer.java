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
        HashMap<Node, Node> mp = new HashMap<>();
        Node curr = head;
        while(curr != null){
            mp.put(curr, new Node(curr.val));
            curr= curr.next;
        }

        curr = head;
        Node dummyNode = new Node(0);
        Node newCurr = dummyNode;
        while(curr != null){
            newCurr.next = mp.get(curr);
            newCurr = newCurr.next;
            newCurr.next = mp.get(curr.next);
            newCurr.random = mp.getOrDefault(curr.random, null);
            curr = curr.next;
        }
       return dummyNode.next;
        
    }
}