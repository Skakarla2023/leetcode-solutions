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
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        prev.next = null;
        ListNode future;

        while (curr != null) {
            future = curr.next;
            curr.next = prev;
            prev = curr;
            curr = future;
        }

        return prev;
    }
}
