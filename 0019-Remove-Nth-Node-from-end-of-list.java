class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode temp = head;
        int size =0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        size = size-n;
        if(size==0)
        {
            head = head.next;
            return head;
        }
        temp = head;
        for(int i=1;i<size;i++) temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}
