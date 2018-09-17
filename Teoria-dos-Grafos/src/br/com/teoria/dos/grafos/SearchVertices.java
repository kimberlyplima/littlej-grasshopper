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
    int numVertices;
    QueueGraph queue;
    int cont = 0;
    
    public SearchVertices(Graph graph, Vertex initialVertex){
        numVertices = graph.sizeGraph();
        Vertex visited[] = new Vertex[numVertices];
        queue = new QueueGraph();
        Vertex v;
        
        
        //visited[v] = cont++;
        queue.enqueue(initialVertex);
        
        while(!queue.isEmpty()){
            v = queue.getVertex();
            queue.dequeue();
            
            
        }
        
        
        
    }
}
