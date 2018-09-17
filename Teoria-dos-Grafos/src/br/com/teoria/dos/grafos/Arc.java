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
public class Arc {
    
    private LinkedList<Vertex> arc;
    
    public Arc(Vertex a, Vertex b){
        arc = new LinkedList<Vertex>();
        
        this.arc.add(a);
        this.arc.add(b);
    }
    
    public void changeVertex(int position, Vertex vertex){
        this.arc.set(position, vertex);
    }
    
    public LinkedList<Vertex> getArc(){ 
        return arc;
    }
    
    public void showArc(){
        System.out.print(arc.get(0).getValue() + " ");
        System.out.println(arc.get(1).getValue());
    }
}
