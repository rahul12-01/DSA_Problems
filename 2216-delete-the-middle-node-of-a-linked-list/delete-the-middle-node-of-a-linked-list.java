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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        if (head == null || head.next == null)
            return null;
        int len = 0;
        int i=0;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        temp = head;
        int mid =len/2;
        while (temp!=null){
            if(i==mid-1)
            temp.next=temp.next.next;
            else
            temp=temp.next;
            i++;
        }
        return head;
    }
}