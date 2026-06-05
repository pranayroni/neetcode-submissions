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
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node res = new Node(head.val); // head of copied list
        Node x = head.next; // iterator for list to copy
        Node resx = res; // iterator of copied list
        Map<Node, Node> hm = new HashMap<>(); // map copies to original
        int index =0;
        hm.put(head, res);
        // construct basic list first
        while(x!=null)
        {
            resx.next = new Node(x.val);
            hm.put(x, resx.next); // map
            resx = resx.next; // iterate the copied list
            x = x.next; // iterate the list to copy
        }
        // wire the list's randoms
        
        x = head;
        resx = res;
        while(x!=null)
        {
            resx.random = x.random == null ? null : hm.get(x.random);
            x=x.next;
            resx=resx.next;
        }
        
        return res;



    }
}
