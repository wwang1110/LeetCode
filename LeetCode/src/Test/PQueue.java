package Test;

import java.util.Comparator;
import java.util.PriorityQueue;
class myComparator implements Comparator<Integer> {
	public int compare(Integer x, Integer y) {
		return x - y;
	}
}
public class PQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(2, new myComparator());
		pqueue.add(0);
		System.out.println(pqueue.peek());
		pqueue.add(1);
		System.out.println(pqueue.peek());
		pqueue.poll();
		System.out.println(pqueue.peek());

		pqueue.add(5);
		System.out.println(pqueue.peek());
		pqueue.add(6);
		System.out.println(pqueue.peek());
		pqueue.add(7);
		System.out.println(pqueue.peek());
		pqueue.add(3);
		System.out.println(pqueue.peek());
		pqueue.add(2);
		System.out.println(pqueue.peek());
		pqueue.add(10);
		System.out.println(pqueue.peek());
	}
}
