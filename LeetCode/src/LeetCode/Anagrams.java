package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagrams {
	//Given an array of strings, return all groups of strings that are anagrams.

	//Note: All inputs will be in lower-case.
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList<String> anagrams(String[] strs) {
    	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    	ArrayList<String> ret = new ArrayList<String>();
    	
    	for (int i = 0; i < strs.length; i++)
    	{
    		char[] chars = strs[i].toCharArray();
    		Arrays.sort(chars);
    		String sorted = new String(chars);
    		if (map.containsKey(sorted) == false)
    			map.put(sorted, new ArrayList<String>());
    		map.get(sorted).add(strs[i]);
    	}
    	
    	Iterator it = map.entrySet().iterator();
    	while(it.hasNext())
    	{
    		Map.Entry pairs = (Map.Entry)it.next();
    		ArrayList<String> l = (ArrayList<String>)pairs.getValue();
    		if (l.size() > 1)
    			for (String s : l)
    				ret.add(s);
    	}
    	return ret;
    }
}
