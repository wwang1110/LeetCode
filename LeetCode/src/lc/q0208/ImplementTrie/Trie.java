/* Implement a trie with insert, search, and startsWith methods.
 * 
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 * 
 */

package lc.q0208.ImplementTrie;
import java.util.*;
class Trie {
	private Map<Character, Trie> children = new HashMap<Character,Trie>();
	boolean isEndofWord = false;
	
    /** Initialize your data structure here. */
    public Trie() {
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	if (word.length() == 0)
    	{
    		isEndofWord = true;
    		return;
    	}
    	char c = word.charAt(0);
    	if (!children.containsKey(c))
    		children.put(c, new Trie());
    	Trie child = children.get(c);
    	child.insert(word.substring(1));
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	if (word.length() == 0)
    		return isEndofWord;
    	char c = word.charAt(0);
    	if (!children.containsKey(c))
    		return false;
    	Trie child = children.get(c);
    	return child.search(word.substring(1));
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	if (prefix.length() == 0)
    		return true;
    	char c = prefix.charAt(0);
    	if (!children.containsKey(c))
    		return false;
    	Trie child = children.get(c);
    	return child.startsWith(prefix.substring(1));
        
    }
}