/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode = head;
        
        if (head == null) {
            return false;
        }
        
        while (nextNode != null && nextNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next.next;
            if (currNode == nextNode) {
                return true;
            }
        }
        return false;
    }
}