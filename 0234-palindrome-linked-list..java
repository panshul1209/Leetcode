class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;
        ListNode faster = head;
        ListNode slower = head;
        while(faster != null && faster.next!= null)
        {
            slower = slower.next;
            faster = faster.next.next;
        }
        if(head.next == slower && slower.next==null)
        {
            if(head.val==slower.val) return true;
            else return false;
        }
        ListNode prev = slower;
        ListNode last = slower.next;
        ListNode forward = slower.next.next;
        while(last.next != null)
        {
            last.next = prev;
            prev = last;
            last = forward;
            forward=forward.next;
        }
        last.next = prev;
        while(head.next != last && head != last)
        {
            if(last.val != head.val) return false;
            last = last.next;
            head = head.next;
        } 
        if(head.val != last.val) return false;
        return true;
    }
}
}
