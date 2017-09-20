/* There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
 * 
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 * 
 * Note:
 * The solution is guaranteed to be unique.
 * 
 */

package lc.q0134.GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int size=gas.length;
        int sum=0;
        int res=0;
        int total=0;
        for(int i=0; i<size; ++i){
            sum+=gas[i]-cost[i];
            if(sum<0){
                total+=sum;
                sum=0;
                res=i+1;
            }
        }
        total+=sum;
        return total<0?-1:res;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.canCompleteCircuit(new int[] {2,4}, new int[] {3,4});
    }    
}
