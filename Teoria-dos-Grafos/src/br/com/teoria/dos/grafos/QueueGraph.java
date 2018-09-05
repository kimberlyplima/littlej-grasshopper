/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teoria.dos.grafos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kimberlyplima
 */
public class QueueGraph {
    
    private Queue<Vertex> queue;
    
    public QueueGraph(){
        queue = new LinkedList();
    }
    
    public void Enqueue(Vertex vertex){
        queue.add(vertex);
    }
    
    public Vertex Dequeue(){
        return queue.remove();
    }
    
    public int Quantity(){
        return queue.size();
    }
}
