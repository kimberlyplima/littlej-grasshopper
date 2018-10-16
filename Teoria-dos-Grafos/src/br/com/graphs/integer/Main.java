/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.integer;

import br.com.graphs.dijkstra.*;
import java.util.Iterator;

/**
 *
 * @author kimberlyplima
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Graph graph = new Graph();
        
        graph.buildGraph(0, 1);
        graph.buildGraph(0, 2);
        //graph.buildGraph(1, 0);
        graph.buildGraph(1, 3);
        //graph.buildGraph(2, 0);
        graph.buildGraph(2, 3);
        //graph.buildGraph(3, 1);
        //graph.buildGraph(3, 2);
        graph.buildGraph(3, 4);
        //graph.buildGraph(4, 3);
        graph.buildGraph(4, 5);
        graph.buildGraph(5, null);
        
        graph.showGraph();
        
        //BfsVisitationVector search = new BfsVisitationVector(graph, 1);
        
        BfsDistanceVector search = new BfsDistanceVector(graph, 0);*/
        
        GraphDijkstra graph = new GraphDijkstra();
        graph.addEdges(0, 1, 3);
        graph.addEdges(0, 2, 20);
        graph.addEdges(1, 3, 4);
        graph.addEdges(2, 1, 10);
        graph.addEdges(2, 3, 1);
        
        /*Iterator<Edge> i = graph.getEdges().iterator();
        while(i.hasNext()){
            Edge nextNode = i.next();
            
            System.out.print(nextNode.getSource().getId() + " ");
            System.out.println(nextNode.getDestination().getId());
        }
        
        System.out.println(graph.getVertices().size());
        
        Iterator<Vertex> i = graph.getVertices().iterator();
        while(i.hasNext()){
            Vertex nextNode = i.next();
            
            System.out.println(nextNode.getId());
        }*/
    }
    
}
