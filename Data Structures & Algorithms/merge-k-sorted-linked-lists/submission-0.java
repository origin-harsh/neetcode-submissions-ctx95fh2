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
    static ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1 != null && l2 != null){
            if(l1.val<= l2.val){
                l1.next = mergeTwoList(l1.next,l2);
                return l1;
            }
            else{
                l2.next = mergeTwoList(l1,l2.next);
                return l2;
            }
        }
        return null;
    }
    static ListNode partition(int st, int end,ListNode[] lists){
        if(st>end) return null;
        if(st==end) return lists[st];
        int mid = st + (end - st)/2;
        ListNode l1 = partition(st,mid,lists);
        ListNode l2 = partition(mid+1,end,lists);

        return mergeTwoList(l1,l2);        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int st =0;
        int end = lists.length -1;
        ListNode res = partition(st,end,lists);
        return res;
    }
}
