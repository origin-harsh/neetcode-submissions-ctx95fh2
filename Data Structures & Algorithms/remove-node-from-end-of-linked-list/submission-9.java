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
    public ListNode reverseLL(ListNode rev){
        ListNode curr = rev;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null) return head.next;
            ListNode data = head;
            ListNode rev = reverseLL(data);
            ListNode curr = rev;

            if(n == 1){
    rev = rev.next;   // head hata do
    return reverseLL(rev);
}
            int i = 1;
            ListNode prev = rev;
            while(curr.next != null && i < n){
                prev = curr;
                curr = curr.next;
                i++;
            }

        prev.next = curr.next;
        head = reverseLL(rev);
        return head;

    }
}
