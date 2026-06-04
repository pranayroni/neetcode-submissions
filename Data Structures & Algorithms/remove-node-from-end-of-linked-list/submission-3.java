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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // find size
        int sz = 0;
        ListNode x = head;
        while(x!=null)
        {
            x = x.next;
            sz++;
        }

        // remove front
        if(n==sz) return head.next;

        // remove middle
        x = head;
        int count = 1;
        while(count != sz-n && x!=null)
        {
            x = x.next; // get n-2 node
            count++;
        }

        x.next = x.next.next;
        return head;
    }
}
