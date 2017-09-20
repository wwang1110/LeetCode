/*
In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Note:
The input will only have lower-case letters.
1 <= dict words number <= 1000
1 <= sentence words number <= 1000
1 <= root length <= 100
1 <= sentence words length <= 1000
 */
package lc.q0648.ReplaceWords;

import java.util.*;

public class Solution {
	class Trie
	{
		public boolean isWord;
		public Trie[] children=new Trie[26];
		public void addWord(String word)
		{
			if(word.length()==0)
			{
				isWord=true;
				return;
			}
			char c=word.charAt(0);
			if(children[c-'a']==null)
				children[c-'a']=new Trie();
			String str=word.substring(1);
			children[c-'a'].addWord(str);
		}
		public String findRoot(String word) {
			if(isWord==true)
				return word;
			if(word.length()==0)
				return "";
			char c=word.charAt(0);
			if(children[c-'a']==null)
				return "";
			return children[c-'a'].findRoot(word.substring(1));
		}
	}
    public String replaceWords(List<String> dict, String sentence) {
    	Trie trie=new Trie();
        for(String word:dict)
        	trie.addWord(word);

        String[] strs=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:strs)
        {
        	String rpstr=trie.findRoot(word);
        	int len=rpstr.length();
        	sb.append(" ");
        	sb.append(word.substring(0, word.length()-len));
        }
        return sb.toString().substring(1);
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.replaceWords(Arrays.asList(new String[] {"cat","bat","rat"}),"the cattle was rattled by the battery");
    }    
}
