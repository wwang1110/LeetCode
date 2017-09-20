/* Compare two version numbers version1 and version2.
 * 
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * 
 * The . character does not represent a decimal point and is used to separate number sequences.
 * 
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 
 * 0.1 < 1.1 < 1.2 < 13.37
 * 
 */

package lc.q0165.CompareVersionNumbers;

public class Solution {
    public int compareVersion(String version1, String version2) {
    	
    	return compareVersion(version1, 0, version2, 0);
    }

	private int compareVersion(String version1, int i, String version2, int j) {
		if (i >= version1.length() && j >= version2.length())
			return 0;
		int v1 = 0;
		int x = i;
		if (i < version1.length())
		{
			while(x < version1.length() && version1.charAt(x) != '.')
				x++;
			v1 = Integer.parseInt(version1.substring(i, x));
		}
		int v2 = 0;
		int y = j;
		if (j < version2.length())
		{
			while(y < version2.length() && version2.charAt(y) != '.')
				y++;
			v2 = Integer.parseInt(version2.substring(j, y));
		}
		if (v1 > v2)
			return 1;
		if (v1 < v2)
			return -1;
		return compareVersion(version1, x+1, version2, y+1);
	}
}
