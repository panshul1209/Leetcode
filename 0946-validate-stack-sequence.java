class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j =0;
        int i=0;
        while(i<pushed.length)
        {
            if(!stack.isEmpty() && popped[j] == stack.peek())
            {
                stack.pop();
                j++;
            }
            else stack.push(pushed[i++]);
        }
        while(!stack.isEmpty())
        {
            int a = stack.pop();
            if(a != popped[j]) return false;
            j++;
        }
        return true;
    }
}
