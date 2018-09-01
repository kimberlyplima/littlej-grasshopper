/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vertex;

/**
 *
 * @author kimberlyplima
 */
public class Main {
    
    public static void main(String[] args) {
        Vertex v = new Vertex();
        Vertex w = new Vertex();
        
        v.setVertex(2);
        w.setVertex(7);
        
        Arc arco = new Arc();
        
        System.out.println(arco.getV());
        System.out.println(arco.getW());
    }
}
