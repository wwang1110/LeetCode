/* 
Solve a given equation and return the value of x in the form of string "x=#value". The equation contains only '+', '-' operation, the variable x and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of x is an integer.

Example 1:
Input: "x+5-3+x=6+x-2"
Output: "x=2"
Example 2:
Input: "x=x"
Output: "Infinite solutions"
Example 3:
Input: "2x=x"
Output: "x=0"
Example 4:
Input: "2x+3x-6x=x+2"
Output: "x=-1"
Example 5:
Input: "x=x+2"
Output: "No solution"
 * 
 */
package lc.q0640.SolvetheEquation;

public class Solution {
    public String solveEquation(String equation) {
    	equation="+"+equation;
    	char[] arr=equation.toCharArray();
    	boolean foundEqn=false;
		//pre-processing
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]=='=')
    		{
    			foundEqn=true;
    			arr[i]='-';
    		}
    		else if(foundEqn==true&&arr[i]=='+')
    			arr[i]='-';
    		else if(foundEqn==true&&arr[i]=='-')
    			arr[i]='+';
    	}
    	
    	//processing
    	int countX=0;
    	int sum=0;
    	int sign=1;
    	int num=0;
    	for(int i=0;i<=arr.length;i++)
    	{
    		if(i==arr.length||arr[i]=='+'||arr[i]=='-')
    		{
    			sum+= sign*num;
    			num=0;
    			if(i<arr.length)
    				sign=arr[i]=='+'?1:-1;
    		}
    		else if(arr[i]=='x')
    		{
    			if(arr[i-1]=='+'||arr[i-1]=='-')
    				countX+=sign;
    			else
    				countX+=sign*num;
    			num=0;
    		}
    		else
    			num=num*10+(arr[i]-'0');
    	}
    	
    	if(countX==0)
    	{
    		if(sum==0)
    			return "Infinite solutions";
    		else
    			return "No solution";
    	}
   		return "x="+Integer.toString(-sum/countX);
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.solveEquation("x=x");
    }    
}
