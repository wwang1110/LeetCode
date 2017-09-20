/* Given the coordinates of four points in 2D space, return whether the four points could construct a square.
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 * 
 * Example:
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * Output: True
 * Note:
 * All the input integers are in the range [-10000, 10000].
 * A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 * Input points have no order.
 * 
 */
package lc.q0593.ValidSquare;

public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int e12=length(p1,p2);
        int e23=length(p2,p3);
        int e31=length(p3,p1);
        if(e12==0||e23==0||e31==0)
        	return false;
        if(e12==e23&&e12+e23==e31)
        	return e31==length(p2,p4)&&e23==length(p3,p4)&&e23==length(p1,p4);
        if(e23==e31&&e23+e31==e12)
        	return e12==length(p3,p4)&&e31==length(p1,p4)&&e31==length(p2,p4);
        if(e31==e12&&e31+e12==e23)
        	return e23==length(p1,p4)&&e12==length(p2,p4)&&e12==length(p3,p4);
        return false;
    }
    private int length(int[] p1, int[] p2)
    {
    	return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}
