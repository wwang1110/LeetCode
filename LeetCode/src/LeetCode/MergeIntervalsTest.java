package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {

	@Test
	public void test1() {
		//Given [1,3],[2,6],[8,10],[15,18],
		//return [1,6],[8,10],[15,18].
		MergeIntervals s = new MergeIntervals();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));
		ArrayList<Interval> ret = s.merge(intervals);
		Assert.assertEquals(3, ret.size());
	}

	@Test
	public void test2() {
		MergeIntervals s = new MergeIntervals();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(2, 3));
		intervals.add(new Interval(4, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 9));
		intervals.add(new Interval(1, 10));
		ArrayList<Interval> ret = s.merge(intervals);
		Assert.assertEquals(1, ret.size());
	}
}
