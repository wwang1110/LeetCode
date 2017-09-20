/* Given a nested list of integers, implement an iterator to flatten it.
 * 
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * 
 * Example 2:
 * Given the list [1,[4,[6]]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 * 
 */

package lc.skipped.q0341.FlattenNestedListIterator;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {

    public NestedIterator(List<NestedIterator> nestedList) {
    }

    @Override
    public Integer next() {
    	return this.next();
    }

    @Override
    public boolean hasNext() {
        return this.hasNext();
    }
}
