package lc;
import java.util.*;

public class GraphNode {
	public int label;
	public List<GraphNode> neighbors;
	public GraphNode(int x) { label = x; neighbors = new ArrayList<GraphNode>(); }
}
