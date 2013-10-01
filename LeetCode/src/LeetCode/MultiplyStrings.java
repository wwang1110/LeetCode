package LeetCode;

public class MultiplyStrings {
	//Given two numbers represented as strings, return multiplication of the numbers as a string.

	//Note: The numbers can be arbitrarily large and are non-negative.
    private String add(String num1, String num2) {
    	int i = num1.length() - 1;
    	int j = num2.length() - 1;
    	int flow = 0;
    	StringBuilder sb = new StringBuilder();
    	while (i >= 0 && j >= 0)
    	{
    		int n = (num1.charAt(i) - '0' + num2.charAt(j) - '0' + flow); 
    		sb.append(n % 10);
    		flow = n / 10;
    		i--;
    		j--;
    	}
    	if (i >= 0)
    	{
    		while (i >= 0)
    		{
    			int n = num1.charAt(i) - '0' + flow;
    			sb.append(n % 10);
    			flow = n / 10;
    			i--;
    		}
    	}
    	else
    	{
    		while (j >= 0)
    		{
    			int n = num2.charAt(j) - '0' + flow;
    			sb.append(n % 10);
    			flow = n / 10;
    			j--;
    		}
    	}
    	if (flow > 0) sb.append('1');
    	return sb.reverse().toString();
    }
    public String multiply(String num1, String num2) {
    	if (num1.equals("0") || num2.equals("0"))
    		return "0";
    	String tb[] = new String[10];
    	tb[0] = "0";
    	for (int i = 1; i < 10; i++)
    		tb[i] = add(tb[i-1], num1);
    	
    	int len = num2.length();
    	String sum = "0";
    	String div = "";
    	for (int i = len - 1; i >= 0; i--)
    	{
    		String mul = tb[num2.charAt(i) - '0'] + div;
    		sum = add(sum, mul);
    		div += "0";
    	}
    	return sum;
    }
}
