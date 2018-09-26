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
public class SearchVertices{ 
    QueueGraph queue;
    Vertex v;
    int[] visited;
    int cont = 0;
    int index = 0;
    
    public SearchVertices(Graph graph, Vertex inicialVertex){
        queue = new QueueGraph();
        
        Arrays.fill(visited, -1);
        
        index = Integer.parseInt(inicialVertex.getValue());
        visited[index] = cont++;
        queue.enqueue(inicialVertex);
        
        while(!queue.isEmpty()){
            v = queue.getVertex();
            index = Integer.parseInt(v.getValue());
            queue.dequeue();
            
            if(graph.getAdj(v) != null){
                Iterator<Vertex> i = graph.getAdj(v).iterator();
                
                while(i.hasNext()){
                    Vertex next = i.next();
                    index = Integer.parseInt(next.getValue());
                    
                    if(visited[index] == -1){
                        visited[index] = cont++;
                        queue.enqueue(next);
                    }
                }
            }
        }
    }
    
    public int[] getVisited(){
        return visited;
    }
}
