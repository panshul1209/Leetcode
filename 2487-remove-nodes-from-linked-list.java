class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        while(temp != null)
        {
            if(!stack.empty() && (stack.peek()).val < temp.val) stack.pop();
            else 
            {
                stack.push(temp);
                temp = temp.next;
            }
        } 
        while(!stack.empty())
        {
            temp = stack.pop();
            temp.next = dummy.next;
            dummy.next = temp;
        }
        return dummy.next;
    }
}
