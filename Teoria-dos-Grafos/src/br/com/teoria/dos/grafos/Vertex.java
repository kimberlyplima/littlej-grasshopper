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
public class Vertex {
    
    private String vertex;

    public Vertex(String vertex){
        this.vertex = vertex;
    }

    /**
     * @return the name
     */
    public String getValue() {
        return this.vertex;
    }
    
    public Boolean equalsTo(String value){
        return this.vertex.equals(value);
    }
}
