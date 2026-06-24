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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> a.val-b.val);
        pq.put(list1);
        pq.add(list2);

        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        while(!pq.isEmpty()){
            output.next = pq.poll();
        }
        return dummy.next;
    }
}