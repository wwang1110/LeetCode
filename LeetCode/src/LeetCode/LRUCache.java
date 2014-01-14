package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	//Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

	//get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
	//set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, 
	//it should invalidate the least recently used item before inserting a new item.
	private final int capacity;
	private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
    public LRUCache(int capacity) {
    	this.capacity = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key))
        {
        	map.put(key, map.get(key) + 1);
        	return cache.get(key);
        }
        return -1;
    }
    
    public void set(int key, int value) {
    	if (capacity <= 0)
    		return;
    	
    	if (cache.containsKey(key))
    		return;
    	
        if (cache.size() >= capacity)
        {
        	int LRUkey = 0;
        	int count = Integer.MAX_VALUE;
        	for (int k : cache.keySet())
        	{
        		if (map.get(k) < count)
        		{
        			count = map.get(k);
        			LRUkey = k;
        		}
        	}
        	map.remove(LRUkey);
        	cache.remove(LRUkey);
        }
    	cache.put(key, value);
    	map.put(key, 1);
    }	
}
