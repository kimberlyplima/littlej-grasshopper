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
        
        Vertex um = new Vertex(1);
        Vertex dois = new Vertex(2);        
        Vertex tres = new Vertex(3);
        Vertex quatro = new Vertex(4);
        Vertex cinco = new Vertex(5);
        Vertex seis = new Vertex(6);
        Vertex sete = new Vertex(7);
        
        Graph lista = new Graph(um);
        lista.addNewVertex(um, dois);        
        lista.addNewVertex(um, tres);
        lista.addNewVertex(um, quatro);
        
        lista.addNewVertex(dois, seis);        
        lista.addNewVertex(dois, sete);
        
        /*
        QueueGraph queue = new QueueGraph();
        queue.enqueue(um);
        queue.enqueue(dois);
        queue.enqueue(tres);
        queue.enqueue(quatro);

        System.out.println("O tamanho da fila é: " + queue.queueSize());
        
        queue.showQueue();
        queue.dequeue();
        queue.showQueue();
        */
        
        //System.out.println("\n\nO grafo tem " + lista.sizeGraph() + " nós");
        
        System.out.println(lista.getIndex(sete));
    }
}
