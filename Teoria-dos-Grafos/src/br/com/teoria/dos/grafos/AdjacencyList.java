/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teoria.dos.grafos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author kimberlyplima
 */
public class AdjacencyList {
    
    private HashMap<Vertex, LinkedList> graph;
    private LinkedList<Vertex> adjList;
    
    /** 
    * Creates the adjacency list and
    * @param mainVertex inserts the main vertex in the first key
    **/
    public AdjacencyList(Vertex mainVertex){
        graph = new HashMap();
        adjList = new LinkedList();
        
        graph.put(mainVertex, adjList);
    }
    
    public void addNewVertex(Vertex mainVertex, Vertex adjVertex){
        if(!graph.containsKey(mainVertex)){
            adjList = new LinkedList();
            graph.put(mainVertex, adjList);            
        }

        graph.get(mainVertex).add(adjVertex);
    }
    
    public void showAdjList(Vertex mainVertex){        
        Iterator<Vertex> i = graph.get(mainVertex).iterator();
        
        while(i.hasNext()){
            System.out.print(i.next().getName() + " ");
        }

    }
    
    public void showKeys(){
        Iterator<Vertex> i = graph.keySet().iterator();
        
        while(i.hasNext()){
            System.out.println(i.next().getName() + " ");
        }
    }
}
