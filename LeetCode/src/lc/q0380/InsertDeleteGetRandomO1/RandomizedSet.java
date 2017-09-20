package lc.q0380.InsertDeleteGetRandomO1;
import java.util.*;
public class RandomizedSet {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	List<Integer> list = new ArrayList<Integer>();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if (map.containsKey(val))
    		return false;
    	map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val))
        	return false;
        int idx = map.get(val);
        list.set(idx, list.get(list.size()-1));
        map.put(list.get(list.size()-1), idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int idx = (int)(Math.random()*list.size());
        return list.get(idx);
    }
}
