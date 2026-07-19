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
    public ListNode reversL(ListNode head){
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
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode fH = head;
        ListNode sH = slow.next;
        slow.next = null;
        sH = reversL(sH);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(fH != null || sH != null){
            if(fH != null){
                curr.next = fH;
                curr = curr.next;
                fH = fH.next;
            }
            if(sH != null){
                curr.next = sH;
                curr = curr.next;
                sH = sH.next;
            }
        }
        
    }
}
