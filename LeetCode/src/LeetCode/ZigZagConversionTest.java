package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

	@Test
	public void testConvert() {
		ZigZagConversion solution = new ZigZagConversion();
		Assert.assertEquals("PAHNAPLSIIGYIR",solution.convert("PAYPALISHIRING", 3));
		Assert.assertEquals("A",solution.convert("A", 1));
	}

}
