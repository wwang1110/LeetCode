package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	public void test1() {
		LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
		int maxlen = solution.lengthOfLongestSubstring("abcabcbb");
		Assert.assertEquals(3, maxlen);
	}
	
	
	@Test
	public void test2() {
		LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
		int maxlen = solution.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco");
		Assert.assertEquals(12, maxlen);
	}

}
