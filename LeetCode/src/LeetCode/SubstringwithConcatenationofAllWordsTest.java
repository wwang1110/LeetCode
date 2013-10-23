package LeetCode;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SubstringwithConcatenationofAllWordsTest {

	@Test
	public void test1() {
		SubstringwithConcatenationofAllWords s = new SubstringwithConcatenationofAllWords();
		ArrayList<Integer> ret = s.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
		Assert.assertEquals(0, (int)ret.get(0));
		Assert.assertEquals(9, (int)ret.get(1));
	}

	@Test
	public void test2() {
		SubstringwithConcatenationofAllWords s = new SubstringwithConcatenationofAllWords();
		ArrayList<Integer> ret = s.findSubstring("barfoobarfoo", new String[] {"foo", "bar"});
		Assert.assertEquals(0, (int)ret.get(0));
		Assert.assertEquals(3, (int)ret.get(1));
		Assert.assertEquals(6, (int)ret.get(2));
	}

	@Test
	public void test3() {
		SubstringwithConcatenationofAllWords s = new SubstringwithConcatenationofAllWords();
		ArrayList<Integer> ret = s.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[] {"fooo","barr","wing","ding","wing"});
		Assert.assertEquals(13, (int)ret.get(0));
	}
}
