package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsonaLine {
	//Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
    public int maxPoints(Point[] points) {
    	
    	if (points.length <= 2)
    		return points.length;
    	
    	int idx = 1;
    	while (idx < points.length && points[0].x == points[idx].x && points[0].y == points[idx].y)
    		idx++;
    	
    	if (idx == points.length)
    		return idx;
    	
    	Map<String, String> map = new HashMap<String, String>(); 
    	
    	for (int i = 0; i < points.length; i++)
    		for (int j = 0; j < points.length; j++)
    		{
    			int a = points[j].y - points[i].y; 
    			int b = points[i].x - points[j].x;
    			int c = points[j].x * points[i].y - points[i].x * points[j].y;
    			int gcd = GCD(c, GCD(a, b));
    			if (gcd < 0)
    				gcd = -gcd;
    			if (a < 0 || a == 0 && b < 0)
    				gcd = -gcd;
    			if (gcd != 0)
    			{
					a /= gcd;
					b /= gcd;
					c /= gcd;
    			}
    			if (a == 0 && b == 0 && c == 0)
    				continue;
    			
    			String key = "[" + a + "," + b +"," + c +"]";
    			String p1 = "[" + i +"]";
    			String p2 = "[" + j +"]";
    			if (map.containsKey(key))
    			{
					String pts = map.get(key);
					if (!pts.contains(p1))
						pts += p1;
					if (!pts.contains(p2))
						pts += p2;
    				map.put(key, pts);
    			}
    			else
    			{
    				String pts = p1 + p2;
    				map.put(key, pts);
    			}
    		}
    	
    	int count = 0;
    	for (String key: map.keySet())
    	{
    		String[] pts = map.get(key).split("\\[");
    		count = Math.max(pts.length, count);
    	}
        return count - 1;
    }
    private int GCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return GCD(number2, number1%number2);
   }
}
