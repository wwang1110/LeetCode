/* Find the total area covered by two rectilinear rectangles in a 2D plane.
 * 
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * 
 * Rectangle Area
 * 
 * Assume that the total area is never beyond the maximum possible value of int.
 * 
 */
package lc.q0223.RectangleArea;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	
    	int totalarea = (int)(Math.abs((C-A)*(D-B)) + Math.abs((G-E)*(H-F))); 
    	if (A >= G || C <= E || B >= H || D <= F)
    		return totalarea;

    	int len = Integer.MAX_VALUE;
    	if (A<=E && G<=C)
    		len = G-E;
    	else if (A>E && G > C)
    		len = C-A;
    	else
    		len = Math.min(Math.abs(C-E), Math.abs(G-A));
    	int height = Integer.MAX_VALUE;
    	if (B<=F && H<=D)
    		height = H-F;
    	else if (B>F && H > D)
    		height = D-B;
    	else
    		height = Math.min(Math.abs(H-B), Math.abs(D-F));
    	
    	return totalarea - len * height;
    }
}
