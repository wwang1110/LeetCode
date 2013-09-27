package LeetCode;

public class PalindromeNumber {
	//Determine whether an integer is a palindrome. Do this without extra space.

	//click to show spoilers.

	//Some hints:
	//Could negative integers be palindromes? (ie, -1)

	//If you are thinking of converting the integer to string, note the restriction of using extra space.

	//You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

	//There is a more generic way of solving this problem.
    public boolean isPalindrome(int x) {
    	if (x < 0)
    		return false;

    	int len = 0;
    	
    	int y = x;
    	while (y > 0)
    	{
    		len ++;
    		y /= 10;
    	}
    	
    	for (int i = 0; i < len/2; i++)
    	{
    		long div1 = 1;
    		for (int j = 0; j < len - i; j++)
    			div1 *= 10;
    		long div2 = 1;
    		for (int k = 0; k < i; k++)
    			div2 *= 10;
    		long left = (x % div1) / (div1/10);
    		long right = (x % (div2 * 10)) / div2; 
    		if (left != right)
    			return false;
    	}
    	
    	return true;
    }
}
