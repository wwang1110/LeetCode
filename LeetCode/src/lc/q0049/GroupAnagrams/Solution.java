/* Given an array of strings, group anagrams together.
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 *   ["ate", "eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 * 
 */

package lc.q0049.GroupAnagrams;
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(int i = 0; i < strs.length; i++)
    	{
    		char[] chrs = strs[i].toCharArray();
    		Arrays.sort(chrs);
    		String key = new String(chrs);
    		List<String> l;
    		if (!map.containsKey(key))
    			l = new ArrayList<String>();
    		else
    			l = map.get(key);
    		l.add(strs[i]);
    		map.put(key, l);
    	}
    	
    	List<List<String>> res = new ArrayList<List<String>>();
    	for (List<String> l: map.values())
    		res.add(l);
    	
    	return res;
    }
}
