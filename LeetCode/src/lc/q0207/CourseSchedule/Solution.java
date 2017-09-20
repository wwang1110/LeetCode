/* There are a total of n courses you have to take, labeled from 0 to n - 1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * 
 * For example:
 * 
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
 * 
 * 2, [[1,0],[0,1]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * 
 * Note:
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
 * You may assume that there are no duplicate edges in the input prerequisites.
 * 
 */

package lc.q0207.CourseSchedule;
import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0)
        	return false;
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] inDegree = new int[numCourses];
        
        for (int i = 0; i < prerequisites.length; i++)
        	inDegree[prerequisites[i][0]]++;
        
    	for (int i = 0; i < inDegree.length; i++) {
    		if (inDegree[i] == 0)
    			queue.add(i);
    	}
    	while (!queue.isEmpty()) {
    		int x = queue.poll();
    		for (int i = 0; i < prerequisites.length; i++) {
    			if (x == prerequisites[i][1]) {
    				inDegree[prerequisites[i][0]]--;
    				if (inDegree[prerequisites[i][0]] == 0)
    					queue.add(prerequisites[i][0]);
    			}
    		}
    	}
    	for (int i = 0; i < inDegree.length; i++) {
    		if (inDegree[i] != 0)
    			return false;
    	}
    	return true;    	
    }
}
