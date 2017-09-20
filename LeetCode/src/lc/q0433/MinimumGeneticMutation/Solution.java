/* A gene string can be represented by an 8-character long string, with choices from "A", "C", "G", "T".
 * 
 * Suppose we need to investigate about a mutation (mutation from "start" to "end"), where ONE mutation is defined as ONE single character changed in the gene string.
 * 
 * For example, "AACCGGTT" -> "AACCGGTA" is 1 mutation.
 * 
 * Also, there is a given gene "bank", which records all the valid gene mutations. A gene must be in the bank to make it a valid gene string.
 * 
 * Now, given 3 things - start, end, bank, your task is to determine what is the minimum number of mutations needed to mutate from "start" to "end". If there is no such a mutation, return -1.
 * 
 * Note:
 * Starting point is assumed to be valid, so it might not be included in the bank.
 * If multiple mutations are needed, all mutations during in the sequence must be valid.
 * You may assume start and end string is not the same.
 * Example 1:
 * start: "AACCGGTT"
 * end:   "AACCGGTA"
 * bank: ["AACCGGTA"]
 * 
 * return: 1
 * Example 2:
 * start: "AACCGGTT"
 * end:   "AAACGGTA"
 * bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
 * 
 * return: 2
 * Example 3:
 * 
 * start: "AAAAACCC"
 * end:   "AACCCCCC"
 * bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]
 * return: 3
 * 
 */

package lc.q0433.MinimumGeneticMutation;

import java.util.*;

public class Solution {
	class Step{
		public String gene;
		public int distance;
		public Step(String g, int d)
		{
			gene=g;
			distance=d;
		}
	}
    public int minMutation(String start, String end, String[] bank) {
    	Queue<Step> queue = new LinkedList<Step>();
    	boolean[] marks=new boolean[bank.length];
    	queue.add(new Step(start, 0));
    	while(!queue.isEmpty())
    	{
    		Step stp=queue.poll();
    		if(stp.gene.equals(end))
    			return stp.distance;
    		for(int i=0;i<bank.length;i++)
    			if(marks[i]==false)
    			{
    				int diff=0;
    				for(int j=0;j<stp.gene.length();j++)
    				{
    					if(stp.gene.charAt(j)!=bank[i].charAt(j))
    						diff++;
    				}
    				if(diff==1)
    				{
    					queue.add(new Step(bank[i], stp.distance+1));
    					marks[i]=true;
    				}
    			}
    	}
    	return -1;
    }
}
