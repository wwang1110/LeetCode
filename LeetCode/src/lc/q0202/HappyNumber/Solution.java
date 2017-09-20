/* Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 * 
 */

package lc.q0202.HappyNumber;

import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        
        int num = n;
        while(num != 1)
        {
            int newnum = 0;
            while(num > 0)
            {
                newnum += (num % 10)*(num % 10);
                num /= 10;
            }
            num = newnum;
            if (set.contains(num))
                return false;
            set.add(num);
        }
        return true;
    }
}