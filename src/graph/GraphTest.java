package graph;

public class GraphTest {

    public static void main(String[] args){
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");

        graph.addEdge("A", "B");

        graph.printGraph();
    }
}
