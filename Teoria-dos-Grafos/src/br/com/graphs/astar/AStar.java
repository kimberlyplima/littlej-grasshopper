/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.astar;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class AStar {
    private List<Vertex> openList;
    private List<Vertex> closedList;
    
    public AStar(Vertex node){
        openList = new LinkedList();
        closedList = new LinkedList();
        
        openList.add(node);
    }
    
    public void searchNode(){
        while(!openList.isEmpty()){
            int minorValue = Integer.MAX_VALUE;
            Vertex q;

            for(int i = 0; i < openList.size(); i++){
                if(openList.get(i).getF() < minorValue){
                    minorValue = openList.get(i).getF();
                }
            }
            
            
        }
    }
}
