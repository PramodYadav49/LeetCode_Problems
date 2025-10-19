class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        
        // Traverse the list
        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        
        // Return the new head (may not be original head)
        return dummy.next;
    }
}
