/* A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 * 
 * Each LED represents a zero or one, with the least significant bit on the right.
 * 
 * For example, the above binary watch reads "3:25".
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 * 
 * Example:
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 * 
 */

package lc.q0401.BinaryWatch;

import java.util.*;

public class Solution {
    public List<String> readBinaryWatch(int num) {
    	List<String> res = new ArrayList<String>();
        for(int i=0;i<=num;i++)
        {
        	List<Integer> hrs = generateHours(i);
        	List<Integer> mins = generateMinutes(num-i);
        	for(Integer hr:hrs)
        		for(Integer min:mins)
        		{
        			if(min<10)
            			res.add(hr+":0"+min);
        			else
        				res.add(hr+":"+min);
        		}
        }
        return res;
    }

	private List<Integer> generateMinutes(int n) {
		List<Integer> mins = new ArrayList<Integer>();
		for(int i=0;i<60;i++)
		{
			int x = i;
			int count=0;
			while(x>0)
			{
				count+=x&1;
				x=x>>1;
			}
			if(count==n)
				    mins.add(i);
		}
		Collections.sort(mins);
		return mins;
	}

	private List<Integer> generateHours(int n) {
		List<Integer> hrs = new ArrayList<Integer>();
		for(int i=0;i<12;i++)
		{
			int x = i;
			int count=0;
			while(x>0)
			{
				count+=x&1;
				x=x>>1;
			}
			if(count==n)
			    hrs.add(i);
		}
		Collections.sort(hrs);
		return hrs;
	}
}
