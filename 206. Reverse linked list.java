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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p0 = null;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        while(p1!=null){
            p1.next = p0;
            if(p2 == null){
                return p1;
            }
            p0 = p1;
            p1 = p2;
            p2 = p2.next;
        }
        return p1;
    }
}
