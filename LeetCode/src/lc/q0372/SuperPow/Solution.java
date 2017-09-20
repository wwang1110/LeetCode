/* Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.
 * 
 * Example1:
 * a = 2
 * b = [3]
 * Result: 8
 *  
 * Example2:
 *  * a = 2
 * b = [1,0]
 * Result: 1024
 * 
 */

package lc.q0372.SuperPow;

public class Solution {
    public int superPow(int a, int[] b) {
        return superPow(a, b, b.length, 1337);
    }
    
    private int superPow(int a, int[] b, int length, int k) {
        if (length == 1) {
            return powMod(a, b[0], k);
        }
        
        return powMod(superPow(a, b, length - 1, k), 10, k) * powMod(a, b[length - 1], k) % k;
    }
    
    
    //x^y mod k
    private int powMod(int x, int y, int k) {
        x %= k;
        int pow = 1;
        for (int i = 0; i < y; i++) {
            pow = (pow * x) % k;
        }
        return pow; 
    }
}
