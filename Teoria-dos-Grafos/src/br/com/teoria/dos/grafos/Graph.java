/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teoria.dos.grafos;

import java.util.*;

/**
 *
 * @author kimberlyplima
 * 
 * This class implements the graph structure.
 * It's possible to creat an arc and add this arc in the graph.
 * It is, also, possible to get the size of the arc and the adjacencies 
 * of a main vertex (key of the map).
 */
public class Graph{
    
    private HashMap<Vertex, LinkedList> graph;
    private LinkedList<Vertex> adj;
    
    public Graph(){
        graph = new HashMap();
    }
    
    public void addNewArc(String inicialVertex, String finalVertex){
        Vertex v = new Vertex(inicialVertex);
        Vertex w = new Vertex(finalVertex);
        
        if(!graph.containsKey(v)){
            adj = new LinkedList();
            
            adj.add(w);
            graph.put(v, adj);
        } else {
            adj.add(w);
            graph.get(v).add(adj);
        }
    }
    
    public int sizeGraph(){
        return graph.size();
    }
    
    public LinkedList<Vertex> getAdj(Vertex key){        
        return graph.get(key);
    }
    
    public HashMap<Vertex, LinkedList> getGraph(){
        return graph;
    }
}
