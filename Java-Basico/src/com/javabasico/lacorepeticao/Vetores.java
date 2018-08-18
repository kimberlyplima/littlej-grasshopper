/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.lacorepeticao;

import java.util.Arrays;

/**
 *
 * @author kimberlyplima
 */
public class Vetores {
    
    public static void main(String[] args) {
        
        int num[] = {4,2,7,3,10,6};
        
        System.out.println("Tamanho do vetor: " + num.length);
        
        Arrays.sort(num); // ordena os valores do vetor
        
        // for each
        for(int valor: num){
            System.out.print(valor + " ");
        }
        
        int pos = Arrays.binarySearch(num, 3);
        System.out.println("\n\n3 foi encontrado na posição " + pos + " do vetor.");
    }
}
