package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class CloneGraphTest {

	@Test
	public void test() {
		CloneGraph s = new CloneGraph();
		UndirectedGraphNode node0 = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		
		node0.neighbors.add(node1);
		node0.neighbors.add(node2);
		
		node1.neighbors.add(node0);
		node1.neighbors.add(node2);

		node2.neighbors.add(node0);
		node2.neighbors.add(node1);
		node2.neighbors.add(node2);
		
		UndirectedGraphNode n = s.cloneGraph(node0);
		Assert.assertEquals(2, n.neighbors.size());
	}
}
