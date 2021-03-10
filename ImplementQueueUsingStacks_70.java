package JavaLeetCodes;

import java.util.Stack;

public class ImplementQueueUsingStacks_70 {
	private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();
    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks_70(){
        
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (output.isEmpty()){
            shiftStacks();
        }
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (output.isEmpty()){
            shiftStacks();
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty(); 
    }
    
    public void shiftStacks(){
        while(!input.isEmpty()){
            int temp = input.pop();
            output.push(temp);
        }
    }
}
