/*
Implement a MapSum class with insert, and sum methods.

For the method insert, you'll be given a pair of (string, integer). The string represents the key and the integer represents the value. If the key already existed, then the original key-value pair will be overridden to the new one.

For the method sum, you'll be given a string representing the prefix, and you need to return the sum of all the pairs' value whose key starts with the prefix.

Example 1:
Input: insert("apple", 3), Output: Null
Input: sum("ap"), Output: 3
Input: insert("app", 2), Output: Null
Input: sum("ap"), Output: 5
 */
package lc.q0677.MapSumPairs;

public class MapSum {
	class Trie
	{
		private Trie[] children=new Trie[26];
		private int val=0;
		public void insert(String key, int value)
		{
			if(key.length()==0)
			{
				val=value;
				return;
			}
			int idx=key.charAt(0)-'a';
			if(children[idx]==null)
				children[idx]=new Trie();
			children[idx].insert(key.substring(1), value);
		}
	    public int sum(String prefix) {
	    	if(prefix.length()==0)
	    		return sum();
			int idx=prefix.charAt(0)-'a';
			if(children[idx]!=null)
				return children[idx].sum(prefix.substring(1));
			return 0;
	    }
	    private int sum()
	    {
    		int sum=val;
    		for(Trie t: children)
    			if(t!=null)
    				sum+=t.sum();
    		return sum;
	    }
	}
	private Trie trie=new Trie();
    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        trie.insert(key, val);
    }
    
    public int sum(String prefix) {
        return trie.sum(prefix);
    }
}
