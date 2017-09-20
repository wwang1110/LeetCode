/* Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 * 
 * Note:
 * The number of people is less than 1,100.
 * 
 * Example
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * 
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * 
 */

package lc.q0406.QueueReconstructionbyHeight;

import java.util.*;

public class Solution {
	class People{
		public int h;
		public int k;
		public People(int hv, int kv)
		{
			h=hv;
			k=kv;
		}
	}
    public int[][] reconstructQueue(int[][] people) {
        List<People> list = new ArrayList<People>();
        for(int i=0;i<people.length;i++)
        	list.add(new People(people[i][0],people[i][1]));
        Collections.sort(list,(a,b)->b.h-a.h!=0?b.h-a.h:a.k-b.k);
        List<People> ret = new ArrayList<People>();
        for(int i=0;i<list.size();i++)
        {
        	People p = list.get(i);
        	ret.add(p.k, p);
        }
        int[][] res = new int[people.length][2];
        for(int i=0;i<ret.size();i++)
        {
        	People p = ret.get(i);
        	res[i][0] = p.h;
        	res[i][1] = p.k;
        }
        return res;
    }
}
