package graph;

public class GraphTest {

    public static void main(String[] args){
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("C", "B");

        graph.removeEdge("A", "B");

        graph.printGraph();
    }
}
