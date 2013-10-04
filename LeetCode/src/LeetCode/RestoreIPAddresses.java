package LeetCode;

import java.util.ArrayList;

public class RestoreIPAddresses {
	//Given a string containing only digits, restore it by returning all possible valid IP address combinations.

	//For example:
	//Given "25525511135",

	//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
	
    public ArrayList<String> restoreIpAddresses(String s) {
    	ArrayList<String> ret = new ArrayList<String>();
    	for (int i = 1; i <= 3; i++)
    		for (int j = i + 1; j <= i + 3; j++)
    			for (int k = j + 1; k <= j + 3; k++)
    			{
    				if (s.length() <= k)
    					continue;
    				
    				String ip[] = new String[4];
    				ip[0] = s.substring(0, i);
    				ip[1] = s.substring(i, j);
    				ip[2] = s.substring(j, k);
    				ip[3] = s.substring(k);

    				int valid = 0;
    				for(int m = 0; m < 4; m++)
    					if (ip[m].length() <= 3 && Integer.parseInt(ip[m]) <= 255)
    						if ((ip[m].length() > 1 && ip[m].charAt(0) != '0') || ip[m].length() == 1)
    							valid++;
    				
    				if (valid == 4)
    					ret.add(s.substring(0, i) + "." 
    							+ s.substring(i, j) + "."
    							+ s.substring(j, k) + "."
    							+ s.substring(k));
    			}
    	return ret;
    }
}
