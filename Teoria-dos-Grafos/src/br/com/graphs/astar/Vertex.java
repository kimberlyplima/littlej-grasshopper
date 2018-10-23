/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.astar;

/**
 *
 * @author kimberlyplima
 */
public class Vertex {
    private String label;
    private int f;
    
    public Vertex(String label){
        this.label = label;
        this.f = 0;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the f
     */
    public int getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(int f) {
        this.f = f;
    }
}
