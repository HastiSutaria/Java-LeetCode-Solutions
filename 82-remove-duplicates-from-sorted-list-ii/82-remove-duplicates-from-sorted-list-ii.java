class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //Base condition no need to sort
        if(head == null || head.next == null) {
            return head;
        }
        
        // Make a dummy node and connect its next to head
        ListNode d = new ListNode(-1,head);
        // Make dummy pointer that is currently pointing to d node
        ListNode t = d;
        
        // Make curr node for travel through the LL
        ListNode curr = head.next;
        
        // Loop till end of LL
        while(curr != null) {
            boolean flag = false; // boolean variable for checking conditions
            // Loop till we are finding duplicate nodes
            while(curr != null && curr.val == t.next.val) {
                flag = true;
                curr = curr.next;
            }
            
            // if we have gone inside the loop that means we have loop and we have to point t's next to curr(because after the loop curr will be pointing to next distinct node)
            if(flag) {
                t.next = curr;
            } else {
                // if we have not gone inside the loop that means we have distinct node that means we have to increase the t node
                t = t.next;
            }
            
            // increase curr node in every step
            if(curr != null) {
                curr = curr.next;
            }
        }
        
        // return the head
        return d.next;
    }
}