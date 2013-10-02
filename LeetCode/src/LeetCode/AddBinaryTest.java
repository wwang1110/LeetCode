package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void test() {
		AddBinary s = new AddBinary();
		Assert.assertEquals("100", s.addBinary("1", "11"));
	}

}
