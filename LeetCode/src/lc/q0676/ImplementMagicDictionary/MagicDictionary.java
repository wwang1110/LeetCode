/*
Implement a magic directory with buildDict, and search methods.

For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

Example 1:
Input: buildDict(["hello", "leetcode"]), Output: Null
Input: search("hello"), Output: False
Input: search("hhllo"), Output: True
Input: search("hell"), Output: False
Input: search("leetcoded"), Output: False
Note:
You may assume that all the inputs are consist of lowercase letters a-z.
For contest purpose, the test data is rather small by now. You could think about highly efficient algorithm after the contest.
Please remember to RESET your class variables declared in class MagicDictionary, as static/class variables are persisted across multiple test cases. Please see here for more details.
 */
package lc.q0676.ImplementMagicDictionary;

public class MagicDictionary {
	class Trie
	{
		private boolean isWord=false;
		private Trie[] children=new Trie[26];
		public void addWord(String word)
		{
			if(word.length()==0)
			{
				isWord=true;
				return;
			}
			int idx= word.charAt(0)-'a';
			if(children[idx]==null)
				children[idx]=new Trie();
			children[idx].addWord(word.substring(1));
		}
		
		public boolean search(String word, int misMatch)
		{
			if(misMatch>1)
				return false;
			if(word.length()==0)
				return misMatch==1&&isWord;
			int idx= word.charAt(0)-'a';
			
			boolean ret=false;
			for(int i=0;i<26;i++)
				if(children[i]!=null)
				{
					if(idx!=i)
						ret=ret||children[i].search(word.substring(1), misMatch+1);
					else
						ret=ret||children[i].search(word.substring(1), misMatch);
				}
			return ret;
		}
	}
	
	Trie trie=new Trie();
    /** Initialize your data structure here. */
    public MagicDictionary() {
        
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
    	for(String word:dict)
    		trie.addWord(word);
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        return trie.search(word, 0);
    }
}
