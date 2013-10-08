package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class LetterCombinationsofaPhoneNumberTest {

	@Test
	public void test() {
		LetterCombinationsofaPhoneNumber s = new LetterCombinationsofaPhoneNumber();
		ArrayList<String> ret = s.letterCombinations("23");
		Assert.assertEquals(9, ret.size());
	}

}
