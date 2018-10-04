/*
 * Esta classe exibe a sequência de fibonacci até um valor pré-determinado.
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
}