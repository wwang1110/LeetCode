/* Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue.
 * 
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * 
 */
package lc.q0232.ImplementQueueusingStacks;

import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> stack = new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	Stack<Integer> ts = new Stack<Integer>();
    	while(!stack.isEmpty())
    		ts.push(stack.pop());
    	stack.push(x);
    	while(!ts.isEmpty())
    		stack.push(ts.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
