public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode faster = head;
        ListNode slower = head;
        while(faster != null && faster.next!=null)
        {
            faster=faster.next.next;
            slower=slower.next;
            if(faster == slower) return true;
        }
        return false;
    }
}
