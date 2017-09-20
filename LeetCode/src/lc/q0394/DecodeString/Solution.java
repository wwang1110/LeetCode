/* Given an encoded string, return it's decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * 
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * 
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * 
 * Examples:
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * 
 */
package lc.q0394.DecodeString;

public class Solution {
    public String decodeString(String s) {
        if(!s.contains("["))
        	return s;
        StringBuilder sb = new StringBuilder();
        int i=0;
        int count=0;
        while(i<s.length())
        {
        	char c=s.charAt(i);
        	if(c>='a'&&c<='z')
        		sb.append(c);
        	else if(c>='0'&&c<='9')
        		count = count * 10 + c-'0';
        	else if(c=='[')
        	{
        		int lv = 0;
        		int j = i;
        		do
        		{
        			if(s.charAt(j)=='[')lv++;
        			else if(s.charAt(j)==']')lv--;
        			j++;
        		}
        		while(lv > 0);
        		j--;
        		String str = decodeString(s.substring(i+1, j));
        		for(int k=0;k<count;k++)
        			sb.append(str);
        		count = 0;
        		i=j;
        	}
        	i++;
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.decodeString("3[a]2[bc]");
    }    
}
