package LeetCode;

import java.util.ArrayList;

public class TextJustification {
	//Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.

	//You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.

	//Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

	//For the last line of text, it should be left justified and no extra space is inserted between words.

	//For example,
	//words: ["This", "is", "an", "example", "of", "text", "justification."]
	//L: 16.

	//Return the formatted lines as:
	//[
	//   "This    is    an",
	//   "example  of text",
	//   "justification.  "
	//]
	//Note: Each word is guaranteed not to exceed L in length.

	//click to show corner cases.

	//Corner Cases:
	//A line other than the last line might contain only one word. What should you do in this case?
	//In this case, that line should be left-justified.
    public ArrayList<String> fullJustify(String[] words, int L) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	ArrayList<String> ret = new ArrayList<String>();
    	
    	int start = 0;
    	int i = 0;
    	int len = 0;
    	while (i <= words.length)
    	{
    		if (i < words.length && len + words[i].length() + (i - start) <= L)
    			len += words[i].length();
    		else if (i == words.length)
    		{
    			String line = words[start];
    			for (int k = start + 1; k < i; k++)
    					line += " " + words[k];
    			while (line.length() < L)
    				line += " ";
    			ret.add(line);
    		}
    		else
    		{
    			String line = words[start];
    			if (i == start + 1)
    			{
    				for (int k = 0; k < L - words[start].length(); k++)
    					line += " ";
    			}
    			else
    			{
	    			int pad = (L - len) / (i - start - 1);
	    			String spad = "";
	    			for (int k = 0; k < pad; k++ )
	    				spad +=" ";
	    			int extra = (L - len) % (i - start - 1);
	    			for (int k = start + 1; k < i; k++)
	    			{
	    				line += spad;
	    				if (extra-- > 0)
	    					line += " ";
	    				line += words[k];
	    			}
    			}
    			ret.add(line);
    			start = i;
    			if (i < words.length)
    				len = words[i].length();
    		}
    		i++;
    	}
    	
    	
    	return ret;
    }
}
