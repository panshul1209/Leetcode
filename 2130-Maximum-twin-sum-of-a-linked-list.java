class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next==null) return head.val + slow.val;
        ListNode current = slow.next;
        ListNode prev = slow;
        ListNode forward = current.next;
        while(current.next != null){
            current.next = prev;
            prev = current;
            current = forward;
            forward = forward.next;
        }
        current.next = prev;
        ListNode start = head;
        int max = start.val + current.val;
        while(start.next != current){
            if(start.val + current.val > max) max = start.val + current.val;
            start = start.next;
            current = current.next;
        }
        if(start.val + current.val > max) max = start.val + current.val;
        return max;
    }
}
