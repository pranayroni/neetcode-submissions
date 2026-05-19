class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;
    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(minStack.isEmpty() || val<= minStack.get(minStack.size()-1))
        {
            minStack.add(val);
        }
    }
    
    public void pop() {
        int x = stack.remove(stack.size()-1);
        if(!minStack.isEmpty() && x == minStack.get(minStack.size()-1))
        {
            minStack.remove(minStack.size()-1);
        }
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
