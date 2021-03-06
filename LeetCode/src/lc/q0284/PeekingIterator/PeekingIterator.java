/* Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().
 * 
 * Here is an example. Assume that the iterator is initialized to the beginning of the list: [1, 2, 3].
 * 
 * Call next() gets you 1, the first element in the list.
 * 
 * Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.
 * 
 * You call next() the final time and it returns 3, the last element. Calling hasNext() after that should return false.
 * 
 * Follow up: How would you extend your design to be generic and work with all types, not just integer?
 * 
 */

package lc.q0284.PeekingIterator;

import java.util.Iterator;

//Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
	
	Integer peek = null;
	Iterator<Integer> iter;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		iter = iterator;
		if (iter.hasNext())
			peek = iter.next();
	}

 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if (peek == null)
			return null;
		int x = peek;
		if (iter.hasNext())
			peek = iter.next();
		else
			peek = null;
		return x;
	}

	@Override
	public boolean hasNext() {
	    return peek != null;
	}
}