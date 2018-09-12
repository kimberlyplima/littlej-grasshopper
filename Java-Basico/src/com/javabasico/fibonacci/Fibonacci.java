/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.fibonacci;

/**
 *
 * @author kimberlyplima
 */
public class Fibonacci {

    private int numOne = 0;
    private int numTwo = 1;
    private int sum;
    
    public void showFibonacci(){
        for(int i = 0; i < 20; i++){
            sum = numOne + numTwo;
            
            System.out.print(numOne + " ");
            
            numOne = numTwo;
            numTwo = sum;
        }
    }
    
    public static void main(String[] args) {
        Fibonacci teste = new Fibonacci();
        
        teste.showFibonacci();
    }
}