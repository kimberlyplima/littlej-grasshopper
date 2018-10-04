/*
 * Esta classe verifica se um número passado por parâmetro é primo.
 */
package com.javabasico.primos;

/**
 *
 * @author kimberlyplima
 */
public class Primos {

    public void primo(int num){
        for(int i = 1; i <= num; i++){
            int counter = 0;
            
            for(int j = 1; j <= i; j++){
                if(i % j == 0) ++counter;
            }
            
            if(counter <= 2){
                System.out.println("O número " + i + " é primo.");
            } else System.out.println("O número " + i + " não é primo.");
            
        }
    }
}