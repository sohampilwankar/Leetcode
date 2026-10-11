//Code
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            //If both the slow and fast pointers are pointing on the same Node
            if(slow == fast) {

                //Move slow to the head node
                slow = head;

                //Then move both slow and fast pointers one node ahed to get the Node where LL Cycle starting
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; //you can return fast here too bc both of them are pointing on same node where LL Cycle starts
            }
        }
        return null;
    }
}