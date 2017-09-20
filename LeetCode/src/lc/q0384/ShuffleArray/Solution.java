/* Shuffle a set of numbers without duplicates.
 * 
 * Example:
 * 
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * 
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 * 
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 * 
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 * 
 */

package lc.q0384.ShuffleArray;

public class Solution {
	private int[] numbers;
	private int[] origin;
    public Solution(int[] nums) {
    	origin = nums;
    	numbers = new int[nums.length];
    	for(int i=0;i<origin.length;i++)
    		numbers[i]=origin[i];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	for(int i=0;i<origin.length;i++)
    		numbers[i]=origin[i];
    	return numbers;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	for(int i=0;i<numbers.length;i++)
    	{
    		int idx=i+(int)(Math.random()*(numbers.length-i));
    		int tmp = numbers[i];
    		numbers[i]=numbers[idx];
    		numbers[idx]=tmp;
    	}
    	return numbers;
    }
}
