/* Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 */

package lc.q0238.ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int[] products = new int[nums.length];
    	
    	int product = 1;
    	for (int i = 0; i < nums.length-1; i++)
    	{
    		product *= nums[i];
    		products[i] = product;
    	}
    	
    	product = 1;
    	for(int i = nums.length-1;i>=0;i--)
    	{
            if (i == 0)
                products[i] = product;
            else
            {
                products[i] = products[i-1]*product;
                product *= nums[i];
            }
    	}
    	return products;
    }
}
