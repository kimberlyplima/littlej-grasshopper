/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.dijkstra;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class GraphDijkstra {
    private Map<Vertex, LinkedList<Edge>> graph;
    
    public GraphDijkstra(){
        this.graph = new HashMap();
    }
    
    public void addEdges(int source, int destination, int cost){
        Edge edge = new Edge(source, destination, cost);
        
        if(graph.containsKey(edge));
    }
}
