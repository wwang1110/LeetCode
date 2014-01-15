package LeetCode;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class WordBreakIITest {

	@Test
	public void test() {
		WordBreakII s = new WordBreakII();
		Set<String> dict = new HashSet<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		s.wordBreak("catsanddog", dict);
	}

}
