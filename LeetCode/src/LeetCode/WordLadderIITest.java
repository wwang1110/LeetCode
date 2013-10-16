package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class WordLadderIITest {

	@Test
	public void test() {
		WordLadderII s = new WordLadderII();
		HashSet<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		ArrayList<ArrayList<String>> ret = s.findLadders("hit", "cog", dict);
		Assert.assertEquals(2, ret.size());
		//    ["hit","hot","dot","dog","cog"],
		//    ["hit","hot","lot","log","cog"]
		
	}

}
