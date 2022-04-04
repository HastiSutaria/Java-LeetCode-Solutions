/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
::Notes::
1 2 3 4 5 *6 7 8 9 3 4 5 2 1 *3 4 5 5 3 6
1
find the node from kth
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        int cnt = 0;
        
        // Finding the kth element from left
        while(left != null){
            cnt++;
            if(cnt == k){
                break;
            }
            left = left.next;
        }
        
        // Finding kth last element
        // Logic: Difference b/w "head" and "left" node will remain the same.. 
        //Hence using 2 pointers.. Make pointer_1 reach till end and simultaneously pointer_2 reach till kth last element
        ListNode right = head, tempNode = left;
        while(tempNode.next != null){
            right = right.next;
            tempNode = tempNode.next;
        }
        
        
        // Swap values
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        
        return head;
    }

}