package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RomantoIntegerTest {

	@Test
	public void test1() {
		RomantoInteger s = new RomantoInteger();
		Assert.assertEquals(1, s.romanToInt("I"));
		Assert.assertEquals(5, s.romanToInt("V"));
		Assert.assertEquals(10, s.romanToInt("X"));
		Assert.assertEquals(50, s.romanToInt("L"));
		Assert.assertEquals(100, s.romanToInt("C"));
		Assert.assertEquals(500, s.romanToInt("D"));
		Assert.assertEquals(1000, s.romanToInt("M"));
	}

	@Test
	public void test2() {
		RomantoInteger s = new RomantoInteger();
		Assert.assertEquals(707, s.romanToInt("DCCVII"));
		Assert.assertEquals(890, s.romanToInt("DCCCXC"));
		Assert.assertEquals(1800, s.romanToInt("MDCCC"));
		
	}
}
