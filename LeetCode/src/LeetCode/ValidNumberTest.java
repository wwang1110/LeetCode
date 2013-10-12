package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ValidNumberTest {

	@Test
	public void test() {
		ValidNumber s = new ValidNumber();
		Assert.assertEquals(false, s.isNumber("e"));
		Assert.assertEquals(false, s.isNumber(".15324737"));
		Assert.assertEquals(true, s.isNumber("1"));
	}

}
