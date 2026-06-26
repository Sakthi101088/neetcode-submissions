class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // if (lists == null || lists.length == 0) {
        //     return null;
        // }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            // if (node != null) {
                pq.add(node);
            // }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(!pq.isEmpty()){
            ListNode small = pq.poll();
            current.next=small;
            current = current.next;
            if(small.next != null){
                pq.add(small.next);
            }

        }
        
        return dummy.next;
    }
}