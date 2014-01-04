package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MaxPointsonaLineTest {

	@Test
	public void test() {
		MaxPointsonaLine s = new MaxPointsonaLine();
		//Assert.assertEquals(3, s.maxPoints(new Point[]{new Point(0, 0), new Point(1, 1), new Point(2, 2), new Point(1, 0)}));
		//Assert.assertEquals(4, s.maxPoints(new Point[]{new Point(3, 10), new Point(0, 2), new Point(0, 2), new Point(3, 10)}));
		Point[] pts = new Point[]{
				new Point(-435,-347), 
				new Point(-435,-347), 
				new Point(609,613), 
				new Point(-348,-267),
				new Point(-174,-107),
				new Point(87,133),
				new Point(-87,-27),
				new Point(-609,-507),
				new Point(435,453),
				new Point(-870,-747),
				new Point(-783,-667),
				new Point(0,53),
				new Point(-174,-107),
				new Point(783,773),
				new Point(-261,-187),
				new Point(-609,-507),
				new Point(-261,-187),
				new Point(-87,-27),
				new Point(87,133),
				new Point(783,773),
				new Point(-783,-667),
				new Point(-609,-507),
				new Point(-435,-347),
				new Point(783,773),
				new Point(-870,-747),
				new Point(87,133),
				new Point(87,133),
				new Point(870,853),
				new Point(696,693),
				new Point(0,53),
				new Point(174,213),
				new Point(-783,-667),
				new Point(-609,-507),
				new Point(261,293),
				new Point(435,453),
				new Point(261,293),
				new Point(435,453)
				};
		Assert.assertEquals(37, s.maxPoints(pts));
	}

}
