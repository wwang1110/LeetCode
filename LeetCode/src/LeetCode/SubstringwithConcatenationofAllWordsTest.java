package LeetCode;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SubstringwithConcatenationofAllWordsTest {

	@Test
	public void test() {
		SubstringwithConcatenationofAllWords s = new SubstringwithConcatenationofAllWords();
		ArrayList<Integer> ret = s.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
		Assert.assertEquals(0, (int)ret.get(0));
		Assert.assertEquals(9, (int)ret.get(1));
	}

}
