/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head) {
        ListNode prev = null;

        while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
        }

        return prev;
    }
}
