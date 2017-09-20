/* Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 * 
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 * Note:
 * N is a positive integer and won't exceed 10,000.
 * All the scores of athletes are guaranteed to be unique.
 * 
 */

package lc.q0506.RelativeRanks;

import java.util.*;

public class Solution {
	class Score{
		public int score;
		public int idx;
		public Score(int s, int i)
		{
			score=s;
			idx=i;
		}
	}
    public String[] findRelativeRanks(int[] nums) {
    	PriorityQueue<Score> pq=new PriorityQueue<Score>((a,b)->b.score-a.score);
    	for(int i=0;i<nums.length;i++)
    		pq.add(new Score(nums[i], i));
    	
    	String[] ret=new String[nums.length];
    	int rank=1;
    	while(!pq.isEmpty())
    	{
    		Score r= pq.poll();
    		if(rank==1)
    			ret[r.idx]="Gold Medal";
    		else if(rank==2)
    			ret[r.idx]="Silver Medal";
    		else if(rank==3)
    			ret[r.idx]="Bronze Medal";
    		else
    			ret[r.idx]=Integer.toString(rank);
    		rank++;
    	}
    	return ret;
    }
}
