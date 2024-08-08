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

    public boolean addEdge(String vertex1, String vertex2){
        // we have to make sure that both the vertices exist
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null){
            /* Now get the adjacency list for each vertex then add other vertex which represents edge
             For example, you want to add edge between A and B
             Get adjacency list of A, to that list add B
             similarly get Adjacency list for B, add A to that list*/
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        // we have to make sure that both the vertices exist
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null){
             /* Now get the adjacency list for each vertex then remove other vertex which represents edge
             For example, you want to remove edge between A and B
             Get adjacency list of A, from that list remove B
             similarly get Adjacency list for B, from that list remove B*/
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(adjacencyList);
    }
}
