package LeetCode;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class WordLadderTest {

	@Test
	public void test() {
		WordLadder s = new WordLadder();
		HashSet<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		Assert.assertEquals(5, s.ladderLength("hit", "cog", dict));
	}

}
