/*
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */
package lc.q0680.ValidPalindromeII;

public class Solution {
    public boolean validPalindrome(String s) {
    	char[] arr=s.toCharArray();
    	return validPalindrome(0,arr.length-1,1,arr);
    }

	private boolean validPalindrome(int i, int j, int count, char[] arr) {
		if(count<0)
			return false;
		while(i<j&&arr[i]==arr[j])
		{
			i++;
			j--;
		}
		if(i<j)
			return validPalindrome(i+1, j, count-1, arr)||validPalindrome(i, j-1, count-1, arr);
		return true;
	}
}
