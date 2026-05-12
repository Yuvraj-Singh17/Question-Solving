/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        
        ListNode h = headB;
        
        while (h != null) {
            if (set.contains(h)) {
                return h;
            }
            h = h.next;
        }
        
        return null;
    }
}
