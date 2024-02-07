class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int sum = 0;
       int carry = 0;
       ListNode NewList = new ListNode(0);
       ListNode temp = NewList;
       
       while (l1 != null || l2 != null) {
           if (l1 != null) {
               sum += l1.val;
               l1 = l1.next;
           }// check !=null
           if (l2 != null) {
               sum += l2.val;
               l2 = l2.next;
           }
           sum += carry;
           int res = sum % 10;
           ListNode node = new ListNode(res);
           temp.next = node;
           temp = temp.next;
           carry = sum / 10;
           sum = 0; 
       }
       
       if (carry > 0) {
           temp.next = new ListNode(carry);
       }
       
       return NewList.next;
    }
}
