package LeetCode;

public class Point {
	public Point(int i, int j) {
		x = i;
		y = j;
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public int x;
	public int y;

	public int hashCode() {
	    int hash = 0; 
	    hash = hash * 31 + x;
	    hash = hash * 31 + y;
	    return hash;
	    };
    public boolean equals(Object o)
    {
    	Point p = (Point)o;
        return this.x == p.x && this.y == p.y;
    }
}
