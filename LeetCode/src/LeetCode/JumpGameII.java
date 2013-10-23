package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameII {
	//Given an array of non-negative integers, you are initially positioned at the first index of the array.

	//Each element in the array represents your maximum jump length at that position.

	//Your goal is to reach the last index in the minimum number of jumps.

	//For example:
	//Given array A = [2,3,1,1,4]

	//The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, 
	//then 3 steps to the last index.)
    public int jump(int[] A) {
    	if (A.length < 2)
    		return 0;
    	Queue<Integer> que = new LinkedList<Integer>();
    	int marks[] = new int[A.length];
    	que.offer(0);
    	while (que.isEmpty() == false)
    	{
    		int idx = que.poll();
    		for (int i = idx + A[idx]; i >= idx + 1; i--)
    			if (i >= A.length - 1)
    				return marks[idx] + 1;
    			else if (i < A.length - 1 && marks[i] == 0)
    			{
  					que.offer(i);
  					marks[i] = marks[idx] + 1;
    			}
    	}
    	return -1;
    }	
}
