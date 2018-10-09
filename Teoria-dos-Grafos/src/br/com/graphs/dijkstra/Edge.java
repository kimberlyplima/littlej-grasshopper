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
    private int weight;
    
    public Edge(Vertex source, Vertex destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * @return the source
     */
    public Vertex getSourceNode() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSourceNode(Vertex source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public Vertex getDestinationNode() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestinationNode(Vertex destination) {
        this.destination = destination;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
