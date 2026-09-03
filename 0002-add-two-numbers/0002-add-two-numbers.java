

class Solution {
    // public ListNode reverse(ListNode head) {
    //     ListNode cur = head;
    //     ListNode prev = null;
    //     while (cur != null) {
    //         ListNode temp = cur.next;
    //         cur.next = prev;
    //         prev = cur;
    //         cur = temp;
    //     }
    //     return prev;
    // }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = (l1);
        ListNode t2 = (l2);
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        
        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;
            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            carry = sum / 10;
            ListNode n = new ListNode(sum % 10);
            cur.next = n;
            cur = cur.next;
        }
        return (dummy.next);
    }
}
