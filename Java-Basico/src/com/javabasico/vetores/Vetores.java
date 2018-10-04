/*
* Operações básicas com vetores.
*/ 
package com.javabasico.vetores;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Vetores {
       
    int[] num = {4,2,7,3,10,6};

    public Vetores(){
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
