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
public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;
    
    public Graph(){
        vertices = new LinkedList();
        edges = new LinkedList();
    }
    
    public void addEdges(int sourceNode, int destinationNode, int weight){
        Vertex source = new Vertex(sourceNode);
        Vertex destination = new Vertex(destinationNode);        
        
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
        
        if(!vertices.contains(source)){
            vertices.add(source);
        }
    }
    
    
}
