package LeetCode;


import org.junit.Assert;
import org.junit.Test;

public class IntegertoRomanTest {

	@Test
	public void test1() {
		IntegertoRoman s = new IntegertoRoman();
		Assert.assertEquals("M", s.intToRoman(1000));
		Assert.assertEquals("D", s.intToRoman(500));
		Assert.assertEquals("C", s.intToRoman(100));
		Assert.assertEquals("L", s.intToRoman(50));
		Assert.assertEquals("X", s.intToRoman(10));
		Assert.assertEquals("V", s.intToRoman(5));
		Assert.assertEquals("I", s.intToRoman(1));
	}

	@Test
	public void test2() {
		IntegertoRoman s = new IntegertoRoman();
		Assert.assertEquals("DCCVII", s.intToRoman(707));
		Assert.assertEquals("DCCCXC", s.intToRoman(890));
		Assert.assertEquals("MDCCC", s.intToRoman(1800));
	}
}
