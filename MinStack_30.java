package JavaLeetCodes;

import java.util.Stack;

//155. Min Stack
public class MinStack_30 {
	 /** initialize your data structure here. */
	Stack<Integer> stack;
	Stack<Integer> min_vals;
	public static void main(String[] args) {
		MinStack_30 obj = new MinStack_30();
		obj.push(8);
		obj.push(4);
		obj.push(2);
		obj.push(6);
		obj.push(4);
		obj.push(6);
		obj.push(1);
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		
	}
    public MinStack_30() {
        stack = new Stack<Integer>();
        min_vals = new Stack<Integer>();
    }
    
    public void push(int x) {
    	if (min_vals.isEmpty() || x <= min_vals.peek()) {
        	min_vals.push(x);
        }
    	stack.push(x);
    }
    
    public void pop() {
    	if (stack.peek().equals(min_vals.peek())) { //peek finds the bottom stack
    		min_vals.pop();
    	}
    	stack.pop();
 
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_vals.peek();
    }
}



