package LeetCode;

public class GasStation {
	//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

	//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

	//Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

	//Note:
	//The solution is guaranteed to be unique.
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int stations[] = new int[gas.length];
        int sum = 0;
        for (int i = 0; i < stations.length; i++)
        {
        	stations[i] = gas[i] - cost[i];
        	sum += stations[i];
        }
        if (sum < 0)
        	return -1;
        
        int start = 0;
        while (start < stations.length)
        {
        	if (stations[start] < 0)
        		start++;
        	else
        	{
        		int s = stations[start];
        		int idx = start + 1; 
        		while (s >= 0 && idx % (stations.length) != start)
        		{
        			s += stations[idx %(stations.length)];
        			idx++;
        		}
        		
        		if (s < 0)
        			start = idx;
        		else
        			return start;
        	}
        }
        
        return -1;
    }	
}
