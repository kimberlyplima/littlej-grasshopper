/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.matrix;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class AdjacencyMatrix {
    static int[] v = {1,2,3,4,5,6};
    static Map<Integer, LinkedList<Integer>> a = new HashMap();
    static int[][] matrix = new int[5][5];
    
    public static void main(String[] args) {
        a.put(1, new LinkedList());
        a.put(2, new LinkedList());
        a.put(3, new LinkedList());
        a.put(4, new LinkedList());
        a.put(5, new LinkedList());
        
        a.get(1).add(2);
        a.get(1).add(3);
        a.get(2).add(4);
        a.get(3).add(4);
        a.get(4).add(5);
        a.get(5).add(6);
        
        System.out.println(a);
        
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.size(); j++){
                if(a.containsKey(i)){
                    if(a.get(i) != null){
                        LinkedList<Integer> value = a.get(i);
                        
                        for(Integer num : value){
                            if(num.equals(j)){
                                matrix[i][j] = 1;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.size(); j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
