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
public class Main {
    
    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex inicialVertex = new Vertex("0");
        
        g.addNewArc("0", "1");
        g.addNewArc("0", "2");
        g.addNewArc("1", "0");
        g.addNewArc("1", "2");
        g.addNewArc("2", "0");
        g.addNewArc("2", "1");
        
        SearchVertices sv = new SearchVertices(g, inicialVertex);
        
        int size = sv.visited.length;
        
        for(int i = 0; i < size; i++){
            System.out.print(sv.visited[i] + " ");
        }
    }
}
