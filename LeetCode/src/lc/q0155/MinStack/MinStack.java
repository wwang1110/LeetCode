/* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * 
 */

package lc.q0155.MinStack;

import java.util.*;

public class MinStack {
	List<Integer> stack = new ArrayList<Integer>();
	List<Integer> minStack = new ArrayList<Integer>();
    public MinStack() {
        
    }
    
    public void push(int x) {
        int min = Integer.MAX_VALUE;
        if (!minStack.isEmpty())
        	min = minStack.get(minStack.size()-1);
        min = Math.min(min, x);
        minStack.add(min);
        stack.add(x);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        minStack.remove(minStack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
