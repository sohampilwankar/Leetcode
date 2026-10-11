public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;

            if(hare == turtle) {
                return true;
            }
        }
        return false;
    }
}