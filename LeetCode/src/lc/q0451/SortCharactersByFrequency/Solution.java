/* Given a string, sort it in decreasing order based on the frequency of characters.
 * 
 * Example 1:
 * 
 * Input:
 * "tree"
 * 
 * Output:
 * "eert"
 * 
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * 
 * Example 2:
 * Input:
 * "cccaaa"
 * 
 * Output:
 * "cccaaa"
 * 
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * 
 * Example 3:
 * Input:
 * "Aabb"
 * 
 * Output:
 * "bbAa"
 * 
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 * 
 */

package lc.q0451.SortCharactersByFrequency;

import java.util.*;

public class Solution {
	class CharWithFrequency
	{
		public char ch;
		public int frequency;
		public CharWithFrequency(char c, int freq)
		{
			ch=c;
			frequency=freq;
		}
	}
    public String frequencySort(String s) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for(char c:s.toCharArray())
    		if(!map.containsKey(c))
    			map.put(c, 1);
    		else
    			map.put(c, map.get(c)+1);
    	List<CharWithFrequency> list=new ArrayList<CharWithFrequency>();
    	for(char c: map.keySet())
    		list.add(new CharWithFrequency(c, map.get(c)));
    	
    	Collections.sort(list, (a,b)->b.frequency-a.frequency);
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<list.size();i++)
    	{
    		CharWithFrequency item=list.get(i); 
    		for(int k=0;k<item.frequency;k++)
    			sb.append(item.ch);
    	}
    	
    	return sb.toString();
    }
}
