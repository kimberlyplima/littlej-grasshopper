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
public class BfsVisitationVector {
    QueueGraph queue;
    
    public BfsVisitationVector(Graph graph, Integer vertex){
        int v;
        int cont = 0;
        int size = graph.sizeGraph();
        int[] visited = new int[size];
        
        Arrays.fill(visited, -1);
        queue = new QueueGraph();
        
        v = vertex;
        visited[v] = cont++;
        queue.enqueue(v);
        
        while(!queue.isEmpty()){
            v = queue.getInteger();
            queue.dequeue();
            
            if(graph.getAdjList(v) != null){
                Iterator<Integer> i = graph.getAdjList(v).iterator();
            
                while(i.hasNext()){
                    int index = i.next();

                    if(visited[index] == -1){
                        visited[index] = cont++;
                        queue.enqueue(index);
                    } 
                }
            }
        }
        
        for(int j = 0; j < visited.length; j++){
            System.out.print(visited[j] + " ");
        }
    }
}
