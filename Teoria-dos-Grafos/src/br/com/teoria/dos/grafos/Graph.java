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
 */
public class Graph{
    
    private HashMap<Vertex, LinkedList> graph;
    private LinkedList<Vertex> adjList;
    
    /** 
    * Creates the adjacency list and
    * @param mainVertex inserts the main vertex in the first key
    **/
    public Graph(Vertex firstVertex){
        graph = new HashMap();
        adjList = new LinkedList();
        
        graph.put(firstVertex, adjList);
    }
    
    public void addNewVertex(Vertex mainVertex, Vertex adjVertex){
        if(!graph.containsKey(mainVertex)){
            adjList = new LinkedList();
            graph.put(mainVertex, adjList);            
        }

        graph.get(mainVertex).add(adjVertex);
    }
    
    public int sizeGraph(){
        int sizeGraph = graph.size();
        Iterator<LinkedList> i = graph.values().iterator();
        
        while(i.hasNext()){
            sizeGraph += i.next().size();
        }
        
        return sizeGraph;
    }
    
    public LinkedList<Vertex> getAdjList(Vertex position){
        LinkedList adjList = new LinkedList();
        adjList = graph.get(position);
        
        return adjList;
    }
    
    public int getIndex(Vertex vertex){
        int index = 0;
        
        Iterator<Vertex> i = graph.keySet().iterator();
        
        while(i.hasNext()){
            index++;
            if(!i.next().getValue().equals(vertex)){
                index++;
            } else break;
        } 
        
        return index;
    }
}
