//Follow up for H-Index: What if the citations array is sorted in ascending order? Could you optimize your algorithm?

package lc.q0275.HIndexII;

public class Solution {
    public int hIndex(int[] citations) {
    	int len = citations.length;
    	for (int i = 0; i < len; i++)
    	{
    		int count = len - i;
    		int ref = citations[i];
    		if (ref >= count)
    			return count;
    	}
    	return 0;
    }
}
