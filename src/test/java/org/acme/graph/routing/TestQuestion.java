package org.acme.graph.routing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.acme.graph.TestGraphFactory;
import org.acme.graph.model.Edge;
import org.acme.graph.model.Graph;
import org.acme.graph.model.Vertex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests fonctionnels sur DijkstraPathFinder
 * 
 * @author MBorne
 *
 */
public class TestQuestion {

	private Graph graph;

	private DijkstraPathFinder finder;

	@Before
	public void setUp() throws Exception {
		this.graph = TestGraphFactory.createGraph01();
		this.finder = new DijkstraPathFinder(graph);
	}
	
	@Test
	public void testBVertex() {
		Vertex a = graph.findVertex("a");
		Vertex b = graph.findVertex("b");
		Vertex c = graph.findVertex("c");
		Assert.assertSame(a, b.getInEdges().get(0).getSource());
		Assert.assertSame(c, b.getOutEdges().get(0).getTarget());
	}
}
