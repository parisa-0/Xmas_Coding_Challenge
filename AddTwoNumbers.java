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
       ListNode newNode = new ListNode(0);
       ListNode curr = newNode;
       int remainder = 0;

       while(l1 != null || l2 != null || remainder != 0) { 
        int v1 = l1 != null ? l1.val : 0;
        int v2 = l2 != null ? l2.val : 0;

        int sum = v1 + v2 + remainder;

        remainder = sum/10;
        curr.next = new ListNode(sum%10);
        curr = curr.next;

        if(l1 != null) {
            l1 = l1.next;
        }

         if(l2 != null) {
            l2 = l2.next;
        }   
       }

      return newNode.next;
    }
}
