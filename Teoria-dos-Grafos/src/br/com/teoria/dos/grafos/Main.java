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
        Vertex um = new Vertex("0");
        Vertex dois = new Vertex("9");        
        Vertex tres = new Vertex("3");
        Vertex quatro = new Vertex("7");
        Vertex cinco = new Vertex("1");
        Vertex seis = new Vertex("2");
        Vertex sete = new Vertex("8");
        
        AdjacencyList lista = new AdjacencyList(um);
        lista.addNewVertex(um, tres);
        lista.addNewVertex(um, dois);
        lista.addNewVertex(um, quatro);
        
        lista.addNewVertex(sete, um);
        lista.addNewVertex(sete, seis);
        
        //lista.showKeys();
        
        lista.showAdjList(um);
        System.out.println();
        lista.showAdjList(sete);
    }
}
