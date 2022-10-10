package graph;

public class Main {
    public static void main(String args[])
    {

        // Object of graph is created.
        Graph<Integer> g = new Graph<Integer>(true);

        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        g.addEdge(0, 1);

        g.addEdge(1, 2);
        g.addEdge(1,4);

        g.addEdge(2,3);

        g.addEdge(3,1);

        g.addEdge(4, 0);
        g.addEdge(4,3);

        // Printing the graph
        System.out.println("Graph:\n"
                + g.toString());

        // Gives the no of vertices in the graph.
        g.getVertexCount();

        // Gives the no of edges in the graph.
        g.getEdgesCount();

        // Tells whether the edge is present or not.
        g.hasEdge(4, 3);

        // Tells whether vertex is present or not
        g.hasVertex(5);
    }
}
