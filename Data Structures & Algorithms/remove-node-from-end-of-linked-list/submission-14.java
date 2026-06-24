/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        ListNode output = dummy;
        ListNode input=head;
        int count=0;
        while(input!=null){
            count++;
            input=input.next;
        }
        int m=count-n;
        for(int i =0;i<m;i++){
            output=output.next;
        }
        output.next=output.next.next;
        
        return dummy.next;
    }
}