package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class RestoreIPAddressesTest {

	@Test
	public void test1() {
		RestoreIPAddresses s = new RestoreIPAddresses();
		ArrayList<String> ret = s.restoreIpAddresses("25525511135");
		Assert.assertEquals("255.255.11.135", ret.get(0));
		Assert.assertEquals("255.255.111.35", ret.get(1));
		
		

	}
	@Test
	public void test2() {
		RestoreIPAddresses s = new RestoreIPAddresses();
		ArrayList<String> ret = s.restoreIpAddresses("0279245587303");
		Assert.assertEquals(0, ret.size());
	}

}
