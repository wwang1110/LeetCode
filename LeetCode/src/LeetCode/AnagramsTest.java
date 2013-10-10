package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {

	@Test
	public void test() {
		Anagrams s = new Anagrams();
		ArrayList<String> ret = s.anagrams(new String[]{"abc", "acb", "bca", "cd", "dc", "abcde"});
		Assert.assertEquals(5, ret.size());
	}

}
