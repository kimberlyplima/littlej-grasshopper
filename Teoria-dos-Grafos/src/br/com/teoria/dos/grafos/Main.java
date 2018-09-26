/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teoria.dos.grafos;

/**
 *
 * @author kimberlyplima
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        graph.buildGraph(0, 1);
        graph.buildGraph(0, 2);
        graph.buildGraph(1, 0);
        graph.buildGraph(1, 3);
        graph.buildGraph(2, 0);
        graph.buildGraph(2, 3);
        graph.buildGraph(3, 1);
        graph.buildGraph(3, 2);
        graph.buildGraph(3, 4);
        graph.buildGraph(4, 3);
        graph.buildGraph(4, 5);
        graph.buildGraph(5, null);
        
        graph.showGraph();
        
        BfsVisitationVector search = new BfsVisitationVector(graph, 1);
        
        //System.out.println("\n" + graph.sizeGraph());
    }
    
}
