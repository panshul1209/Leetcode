class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode prev = head;
        ListNode current = head;
        ListNode forward = current.next;
        head = forward;
        current.next = current.next.next;
        forward.next = current;
        current = current.next;
        if(current == null) return head;
        forward = current.next;
        while(current.next != null)
        {
            current.next = current.next.next;
            forward.next = current;
            prev.next = forward;
            prev = current;
            current = current.next;
            if(current == null) return head;
            forward = current.next;
        }
        return head;
    }
}
