/* Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes difference between any two time points in the list.
 * 
 * Example 1:
 * Input: ["23:59","00:00"]
 * Output: 1
 * Note:
 * The number of time points in the given list is at least 2 and won't exceed 20000.
 * The input time is legal and ranges from 00:00 to 23:59.
 * 
 */

package lc.q0539.MinimumTimeDifference;

import java.util.*;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
    	int[] mins=new int[timePoints.size()];
    	for(int i=0;i<timePoints.size();i++)
    	{
    		String[] strs=timePoints.get(i).split(":");
    		mins[i]=Integer.parseInt(strs[0])*60+Integer.parseInt(strs[1]);
    	}
    	Arrays.sort(mins);
    	int mindiff=1440;
    	for(int i=0;i<mins.length;i++)
    	{
    		
    		int diff=mins[(i+1)%mins.length]-mins[i];
    		mindiff=Math.min(mindiff, Math.min(Math.abs(diff), 1440-Math.abs(diff)));
    	}
    	return mindiff;
    }
}
