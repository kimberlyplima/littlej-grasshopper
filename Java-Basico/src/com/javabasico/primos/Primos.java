/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public static void main(String[] args) {
        Primos teste = new Primos();
        
        teste.primo(21);
    }
}