/* Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * 
 */
package lc.q0557.ReverseWordsinStringIII;

public class Solution {
    public String reverseWords(String s) {
    	char[] arr=s.toCharArray();
    	int i=0;
    	int j=0;
    	while(j<=arr.length)
    	{
    		if(j==arr.length||arr[j]==' ')
    		{
    			reverse(i, j-1, arr);
    			i=j+1;
    		}
    		j++;
    	}
    	return new String(arr);
    }

	private void reverse(int i, int j, char[] arr) {
		while(i<j)
		{
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
}
