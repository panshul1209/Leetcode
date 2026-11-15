class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0,null);
        ListNode right = new ListNode(0,null);
        ListNode lefttemp = left;
        ListNode righttemp = right;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x) {
                lefttemp.next = temp;
                lefttemp = lefttemp.next;
            }
            else {
                righttemp.next = temp;
                righttemp = righttemp.next;
            }
            temp = temp.next;
        }
        lefttemp.next = right.next;
        righttemp.next = null;
        return left.next;
    }
}
