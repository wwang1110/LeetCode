package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GenerateParenthesesTest {

	@Test
	public void test() {
		GenerateParentheses s = new GenerateParentheses();
		ArrayList<String> ret = s.generateParenthesis(3);
		Assert.assertEquals(5, ret.size());
	}

}
