/* 
Given the running logs of n functions that are executed in a nonpreemptive single threaded CPU, find the exclusive time of these functions.

Each function has a unique id, start from 0 to n-1. A function may be called recursively or by another function.

A log is a string has this format : function_id:start_or_end:timestamp. For example, "0:start:0" means function 0 starts from the very beginning of time 0. "0:end:0" means function 0 ends to the very end of time 0.

Exclusive time of a function is defined as the time spent within this function, the time spent by calling other functions should not be considered as this function's exclusive time. You should return the exclusive time of each function sorted by their function id.

Example 1:
Input:
n = 2
logs = 
["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
Output:[3, 4]
Explanation:
Function 0 starts at time 0, then it executes 2 units of time and reaches the end of time 1. 
Now function 0 calls function 1, function 1 starts at time 2, executes 4 units of time and end at time 5.
Function 0 is running again at time 6, and also end at the time 6, thus executes 1 unit of time. 
So function 0 totally execute 2 + 1 = 3 units of time, and function 1 totally execute 4 units of time.
Note:
Input logs will be sorted by timestamp, NOT log id.
Your output should be sorted by function id, which means the 0th element of your output corresponds to the exclusive time of function 0.
Two functions won't start or end at the same time.
Functions could be called recursively, and will always end.
1 <= n <= 100
 */
package lc.q0636.ExclusiveTimeofFunctions;

import java.util.*;

public class Solution {
	class Change{
		public int id;
		public int status;
		public int time;
		public Change(String change)
		{
			String[] str=change.split("\\:");
			id=Integer.parseInt(str[0]);
			status=str[1].equals("start")?0:1;
			time=Integer.parseInt(str[2]);
		}
	}
	class Function
	{
		public int id;
		public int runtime;
		public Function(int Id, int rtime)
		{
			id=Id;
			runtime=rtime;
		}
	}
    public int[] exclusiveTime(int n, List<String> logs) {
        List<Change> changes=new ArrayList<Change>();
        for(int i=0;i<logs.size();i++)
        	changes.add(new Change(logs.get(i)));
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<changes.size();i++)
        {
        	Change change=changes.get(i);
    		if(!map.containsKey(change.id))
    			map.put(change.id, 1);
    		else
    			map.put(change.id, map.get(change.id)+1);
        	
        	if(!stack.isEmpty())
        	{
        		int id=stack.peek();
        		Change prevChange=changes.get(i-1);
        		int time=change.time-prevChange.time-1;
       			map.put(id, map.get(id)+time);
        	}
        	if(change.status==0)
        		stack.push(change.id);
        	else
        		stack.pop(); 
        }
        List<Function> functions = new ArrayList<Function>();
        for(int id:map.keySet())
        	functions.add(new Function(id, map.get(id)));
        Collections.sort(functions,(a,b)->a.id-b.id);
        int[] ret=new int[functions.size()];
        for(int i=0;i<functions.size();i++)
        	ret[i]=functions.get(i).runtime;
        return ret;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.exclusiveTime(2,Arrays.asList(new String[] {"0:start:0","1:start:2","1:end:5","0:end:6"}));
    }    
}
