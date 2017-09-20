/* Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.
 * Note:
 * Input contains only lowercase English letters.
 * Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
 * Input length is less than 50,000.
 * 
 * Example 1:
 * Input: "owoztneoer"
 * Output: "012"
 * 
 * Example 2:
 * Input: "fviefuro"
 * Output: "45"
 * 
 */

package lc.q0423.ReconstructOriginalDigitsfromEnglish;

import java.util.*;

public class Solution {
    public String originalDigits(String s) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	if(!map.containsKey(c))
        		map.put(c, 1);
        	else
        		map.put(c, map.get(c)+1);
        }
        
        int[] cnts = new int[10];

        //zero
        if(map.containsKey('z')&&map.get('z')>0)
        {
            cnts[0]=map.get('z');
            remove("zero", cnts[0], map);
        }
        //two
        if(map.containsKey('w')&&map.get('w')>0)
        {
            cnts[2]=map.get('w');
            remove("two", cnts[2], map);
        }
        //four
        if(map.containsKey('u')&&map.get('u')>0)
        {
	        cnts[4]=map.get('u');
	        remove("four", cnts[4], map);
        }
        //six
        if(map.containsKey('x')&&map.get('x')>0)
        {
	        cnts[6]=map.get('x');
	        remove("six", cnts[6], map);
        }
        //eight
        if(map.containsKey('g')&&map.get('g')>0)
        {
	        cnts[8]=map.get('g');
	        remove("eight", cnts[8], map);
        }
        //one
        if(map.containsKey('o')&&map.get('o')>0)
        {
	        cnts[1]=map.get('o');
	        remove("one", cnts[1], map);
        }
        //three
        if(map.containsKey('h')&&map.get('h')>0)
        {
	        cnts[3]=map.get('h');
	        remove("three", cnts[3], map);
        }
        //five
        if(map.containsKey('f')&&map.get('f')>0)
        {
	        cnts[5]=map.get('f');
	        remove("five", cnts[5], map);
        }
        //seven
        if(map.containsKey('v')&&map.get('v')>0)
        {
	        cnts[7]=map.get('v');
	        remove("seven", cnts[7], map);
        }
        //nine
        if(map.containsKey('i')&&map.get('i')>0)
        {
	        cnts[9]=map.get('i');
	        remove("nine", cnts[9], map);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cnts.length;i++)
        	for(int j=0;j<cnts[i];j++)
        		sb.append(i);
        return sb.toString();
    }

	private void remove(String str, int num, Map<Character, Integer> map) {
		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			map.put(c, map.get(c)-num);
		}
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.originalDigits("fviefuro");
    }
}
