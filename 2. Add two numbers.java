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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p= null; // used to connect nodes of ans list
        int carry = 0;
        int flag = 0; 
        ListNode head = null; // pointer to return ans list

        while(p2!=null && p1!=null){
            ListNode temp= new ListNode();
            if(flag == 0){
                head = temp;
                flag =1;
            }
            if( p1.val + p2.val + carry > 9){
                temp.val = (p1.val + p2.val + carry) % 10;
                carry = (p1.val + p2.val + carry) / 10;
                p1 = p1.next;
                p2 = p2.next;
                if(p!=null) p.next = temp;
                p = temp;
            }
            else{
                 temp.val = p1.val + p2.val + carry;
                 p1 = p1.next;
                 p2 = p2.next;
                 if(p!=null) p.next = temp;
                 p = temp;
                 carry = 0;
            }
        }
        while(p1 != null){  // addind rest of the l1 values + carry to ans list
            ListNode temp= new ListNode();
            if( p1.val + carry > 9){
                temp.val = (p1.val + carry) % 10;
                carry = (p1.val + carry) / 10;
            }
            else{
               temp.val = p1.val + carry; 
               carry = 0;
            }
            p1 = p1.next;
            if(p!=null) p.next = temp;
            p = temp;
        }
        while(p2 != null){ //addind rest of the l2 values + carry to ans list
            ListNode temp= new ListNode();
             if( p2.val + carry > 9){
                temp.val = (p2.val + carry) % 10;
                carry = (p2.val + carry) / 10;
            }
             else{
               temp.val = p2.val + carry; 
               carry = 0;
            }
            p2 = p2.next;
            if(p!=null) p.next = temp;
            p = temp;
        }
        if(carry != 0){  // handling endcase
             ListNode temp= new ListNode();
             temp.val = carry;
             p.next = temp;
        }
        return head; 
    }

}
