/*
 * This is a simple implementation of the BFS search and it returns a 
 * visitation vector.
 */
package br.com.graphs.integer;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class BfsDistanceVector {
    QueueGraph queue;
    
    public BfsDistanceVector(Graph graph, Integer vertex){
        int v;
        int size = graph.sizeGraph();
        int[] distance = new int[size];
        
        Arrays.fill(distance, -1);
        queue = new QueueGraph();
        
        v = vertex;
        distance[v] = 0;
        queue.enqueue(v);
        
        while(!queue.isEmpty()){
            v = queue.getInteger();
            queue.dequeue();
            
            if(graph.getAdjList(v) != null){
                Iterator<Integer> i = graph.getAdjList(v).iterator();
            
                while(i.hasNext()){
                    int index = i.next();

                    if(distance[index] == -1){
                        distance[index] = distance[v]+1;
                        queue.enqueue(index);
                    } 
                }
            }
        }
        
        for(int j = 0; j < distance.length; j++){
            System.out.print(distance[j] + " ");
        }
    }
}
