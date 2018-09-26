/*
 * This is an implementation of a simple graph of integers.
 */
package br.com.teoria.dos.grafos;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Graph {
    private Map<Integer, LinkedList<Integer>> graph;
    
    public Graph(){
        graph = new HashMap();
    }
    
    public void buildGraph(Integer inicialVertex, Integer finalVertex){
        if(!graph.containsKey(inicialVertex)){
            graph.put(inicialVertex, new LinkedList());
            graph.get(inicialVertex).add(finalVertex);
        } else graph.get(inicialVertex).add(finalVertex);
    }
    
    public void showGraph(){
        Iterator<Map.Entry<Integer, LinkedList<Integer>>> i;
        i = graph.entrySet().iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
    public Integer sizeGraph(){
        return graph.size();
    }

    /**
     * @return the graph
     */
    public LinkedList<Integer> getAdjList(Integer vertex) {
        if(graph.get(vertex).contains(null)){
            return null;
        } else return graph.get(vertex);
    }
}
