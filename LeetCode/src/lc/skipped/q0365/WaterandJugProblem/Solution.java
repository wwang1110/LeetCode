/* You are given two jugs with capacities x and y litres. There is an infinite amount of water supply available. You need to determine whether it is possible to measure exactly z litres using these two jugs.
 * 
 * If z liters of water is measurable, you must have z liters of water contained within one or both buckets by the end.
 * 
 * Operations allowed:
 * 
 * Fill any of the jugs completely with water.
 * Empty any of the jugs.
 * Pour water from one jug into another till the other jug is completely full or the first jug itself is empty.
 * Example 1: (From the famous "Die Hard" example)
 * 
 * Input: x = 3, y = 5, z = 4
 * Output: True
 * Example 2:
 * 
 * Input: x = 2, y = 6, z = 5
 * Output: False
 * 
 */

package lc.skipped.q0365.WaterandJugProblem;

import java.util.*;

public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
    	if (x + y < z)
    		return false;
        boolean[][] tb = new boolean[x+y+1][x+y+1];
        Queue<Integer> quex = new LinkedList<Integer>();
        Queue<Integer> quey = new LinkedList<Integer>();
        
        quex.add(0);
        quey.add(0);
        tb[0][0] = true;
        while(!quex.isEmpty())
        {
        	int xx = quex.poll();
        	int yy = quey.poll();
        	if (xx==z || yy==z || xx+yy==z)
        		return true;
        	//fill x
        	if (tb[yy][x]==false)
        	{
        		tb[yy][x] = true;
        		quex.add(x);
        		quey.add(yy);
        	}
        	//empty x
        	if (tb[yy][0]==false)
        	{
        		tb[yy][0] = true;
        		quex.add(0);
        		quey.add(yy);
        	}
        	//fill y
        	if (tb[y][xx]==false)
        	{
        		tb[y][xx]=true;
        		quex.add(xx);
        		quey.add(y);
        	}
        	//empty y
        	if (tb[0][xx]==false)
        	{
        		tb[0][xx]=true;
        		quex.add(xx);
        		quey.add(0);
        	}
        	//pour x->y
        	if (xx+yy>=y&&tb[y][xx+yy-y]==false)
        	{
        		tb[y][xx+yy-y]=true;
        		quex.add(xx+yy-y);
        		quey.add(y);
        	}
        	else if (xx+yy<y&&tb[xx+yy][0]==false)
        	{
        		tb[xx+yy][0]=true;
        		quex.add(0);
        		quey.add(xx+yy);
        	}
        	//pour y->x
        	if (xx+yy>=x&&tb[xx+yy-x][x]==false)
        	{
        		tb[xx+yy-x][x]=true;
        		quex.add(x);
        		quey.add(xx+yy-x);
        	}
        	else if (xx+yy<x&&tb[0][xx+yy]==false)
        	{
        		tb[0][xx+yy]=true;
        		quex.add(xx+yy);
        		quey.add(0);
        	}
        }
        return false;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.canMeasureWater(3,5,4);
    }    
}
