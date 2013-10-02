package LeetCode;

public class AddBinary {
	//Given two binary strings, return their sum (also a binary string).

	//For example,
	//a = "11"
	//b = "1"
	//Return "100".
    public String addBinary(String a, String b) {
    	StringBuilder sb = new StringBuilder();
    	int ai = a.length() - 1;
    	int bi = b.length() - 1;
    	
    	int flow = 0;
    	while (ai >= 0 && bi >= 0)
    	{
    		int sum = a.charAt(ai) - '0' + b.charAt(bi) - '0' + flow;
    		flow = sum >> 1;
    		sb.append(sum & 1);
    		ai --;
    		bi --;
    	}
    	
    	while (ai >= 0)
    	{
    		int sum = a.charAt(ai) - '0' + flow;
    		flow = sum >> 1;
    		sb.append(sum & 1);
    		ai --;
    	}
    	
    	while (bi >= 0)
    	{
    		int sum = b.charAt(bi) - '0' + flow;
    		flow = sum >> 1;
    		sb.append(sum & 1);
    		bi --;
    	}

    	if (flow > 0)
    		sb.append("1");
    	
    	return sb.reverse().toString();
    }	
}
