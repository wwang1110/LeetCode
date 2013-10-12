package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {

	@Test
	public void test() {
		//[1,2],[3,5],[6,7],[8,10],[12,16]
		InsertInterval s = new InsertInterval();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));
		ArrayList<Interval> ret = s.insert(intervals, new Interval(4,9));
		Assert.assertEquals(3, ret.size());
		
	}

}
