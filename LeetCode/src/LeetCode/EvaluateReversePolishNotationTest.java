package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateReversePolishNotationTest {

	@Test
	public void test() {
		EvaluateReversePolishNotation s = new EvaluateReversePolishNotation();
		Assert.assertEquals(9, s.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
		Assert.assertEquals(6, s.evalRPN(new String[]{"4","13","5","/","+"}));
	}

}
