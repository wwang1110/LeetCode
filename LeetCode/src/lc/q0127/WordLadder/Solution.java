/* Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
 * 
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * For example,
 * 
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * 
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 * 
 * UPDATE (2017/1/20):
 * The wordList parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.
 * 
 */

package lc.q0127.WordLadder;
import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	if (beginWord.equals(endWord))
    		return 0;
    	
    	Queue<String> que = new LinkedList<String>();
    	Queue<Integer> sque = new LinkedList<Integer>();
    	que.add(beginWord);
    	sque.add(1);
    	
    	boolean[] flg = new boolean[wordList.size()];
    	
    	while(!que.isEmpty())
    	{
    		String cur = que.poll();
    		int step = sque.poll();
        	int i = 0;
        	while (i < wordList.size())
        	{
        		if (isOneStep(cur, wordList.get(i)) && flg[i] == false)
        		{
        			if (endWord.equals(wordList.get(i)))
        				return step + 1;
        			que.add(wordList.get(i));
        			sque.add(step + 1);
        			flg[i] = true;
        		}
        		else
        			i++;
        	}
    	}
    	
    	return 0;
    }

	private boolean isOneStep(String w1, String w2) {
		if (w1.length() != w2.length())
			return false;
		int step = 0;
		for (int i = 0; i < w1.length(); i++)
			if (w1.charAt(i) != w2.charAt(i))
			{
				step ++;
				if (step > 1) return false;
			}
		return step == 1;
	}
    
    public static void main(String[] args)
    {
    	
    	String[] dic = new String[] {"hot","dot","dog","lot","log"};    	
    	Solution s = new Solution();
    	s.ladderLength("hit", "cog", Arrays.asList(dic));
    }
}
