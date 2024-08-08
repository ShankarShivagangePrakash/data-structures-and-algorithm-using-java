package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    // This hash map will represent the adjacency list and used to store vertex and edges in the form adjacency list.
    HashMap<String, ArrayList<String>> adjacencyList =
            new HashMap<String, ArrayList<String>>();

    /* This method just adds the vertex to adjacency list, but no edges
     so adjacency list will look like, "A" = []
     empty array means no edges present.*/
    public boolean addVertex(String vertex){
        // we have to make sure, that vertex doesn't exist then only add else return false.
        if(adjacencyList.get(vertex) == null){
            // add vertex but no edges.
            adjacencyList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(adjacencyList);
    }
}
