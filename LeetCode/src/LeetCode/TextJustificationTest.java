package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TextJustificationTest {

	@Test
	public void test1() {
		TextJustification s = new TextJustification();
		ArrayList<String> ret = s.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
		Assert.assertEquals(3, ret.size());
	}

	@Test
	public void test2() {
		TextJustification s = new TextJustification();
		ArrayList<String> ret = s.fullJustify(new String[]{"What","must","be","shall","be."}, 12);
		Assert.assertEquals(2, ret.size());
	}
}
