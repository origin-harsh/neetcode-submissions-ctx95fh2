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
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
          ListNode second = slow.next;
          slow.next = null;
        ListNode rev = reverseLL(second);
        ListNode curr = head;
        while(rev != null){
            ListNode tempcurr = curr.next;
            curr.next = rev;

            ListNode temprev = rev.next;
            rev.next = tempcurr;
            curr = tempcurr;
            rev = temprev;
        }
    }
}
