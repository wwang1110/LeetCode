/* Design a data structure that supports the following two operations:
 * 
 * void addWord(word)
 * 
 * bool search(word)
 * 
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * 
 * For example:
 * 
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 * 
 */

package lc.q0211.AddandSearchWord;

public class WordDictionary {
	private class TrieNode
	{
		private TrieNode[] children = new TrieNode[26];
		private boolean isWord = false;
		public TrieNode() {}
		public void addWord(String word)
		{
			if (word.length() == 0)
			{
				isWord = true;
				return;
			}
			char c = word.charAt(0);
			if (c == '.')
			{
				for (int i = 0; i < 26;i++)
				{
					if (children[i] == null)
						children[i] = new TrieNode();
					children[i].addWord(word.substring(1));
				}
			}
			else
			{
				int idx = c-'a';
				if (children[idx] == null)
					children[idx] = new TrieNode();
				children[idx].addWord(word.substring(1));
			}
		}
		public boolean search(String word)
		{
			if (word.length() == 0)
			{
				if (isWord == true)
					return true;
				else
					return false;
			}
			char c = word.charAt(0);
			if (c=='.')
			{
				for (int i = 0; i < 26;i++)
					if (children[i] != null && children[i].search(word.substring(1)))
						return true;
				return false;
			}
			else
			{
				int idx = c-'a';
				if (children[idx] != null && children[idx].search(word.substring(1)))
					return true;
				return false;
			}
		}
	}
    
	private TrieNode root = new TrieNode();
	/** Initialize your data structure here. */
    public WordDictionary() {
        
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        root.addWord(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return root.search(word);
    }
}
