/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.dijkstra;

/**
 *
 * @author kimberlyplima
 */
public class Edge {
    private Vertex source;
    private Vertex destination;
    private int cost;
    
    public Edge(int source, int destination, int cost){
        this.source = new Vertex(source);
        this.destination = new Vertex(destination);
        this.cost = cost;
    }

    /**
     * @return the source
     */
    public Vertex getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(Vertex source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public Vertex getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    /**
     * @return the cost
     */
    public int getcost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setcost(int cost) {
        this.cost = cost;
    }
}
