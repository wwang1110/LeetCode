package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheEntry {
	public int key;
	public int value;
	public CacheEntry(int key, int value){
		this.key = key;
		this.value = value;
	}
}

public class LRUCache {
	//Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

	//get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
	//set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, 
	//it should invalidate the least recently used item before inserting a new item.
	private final int capacity;
	LinkedList <Integer> keylist = new LinkedList <Integer>(); 
	Map<Integer, CacheEntry> map = new HashMap<Integer, CacheEntry>();
	
    public LRUCache(int capacity) {
    	this.capacity = capacity;
    }
    
    public int get(int key) {
    	if (map.containsKey(key))
    	{
    		CacheEntry cache = map.get(key);
    		moveToHead(cache);
    		return cache.value;
    	}
        return -1;
    }
    
	public void set(int key, int value) {
		if (map.containsKey(key))
		{
    		CacheEntry cache = map.get(key);
    		cache.value = value;
    		map.put(key, cache);
    		moveToHead(cache);
		}
		else
		{
			if (keylist.size() == capacity)
			{
				map.remove(keylist.get(capacity - 1));
				keylist.remove((int)(capacity - 1));
			}
			CacheEntry cache = new CacheEntry(key, value);
			map.put(key, cache);
			keylist.add(0, key);
		}
    }
	
    private void moveToHead(CacheEntry cache) {
    	keylist.remove(cache.key);
    	keylist.add(0, cache.key);
	}
}
