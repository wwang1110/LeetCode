/* Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * 
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 * 
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * 
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * Visually, the graph looks like the following:
 * 
 */
package lc.q0133.CloneGraph;

import java.util.*;

import lc.UndirectedGraphNode;

public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	return clone(node,new HashMap<UndirectedGraphNode,UndirectedGraphNode>());
    }

	private UndirectedGraphNode clone(UndirectedGraphNode node, Map<UndirectedGraphNode, UndirectedGraphNode> map) {
		if (node == null)
			return null;
		if (map.containsKey(node))
			return map.get(node);
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
		map.put(node, newNode);
		for (UndirectedGraphNode neighbor : node.neighbors)
			newNode.neighbors.add(clone(neighbor, map));
		return newNode;
	}
}
