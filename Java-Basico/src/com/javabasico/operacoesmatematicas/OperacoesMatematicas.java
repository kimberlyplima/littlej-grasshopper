/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.operacoesmatematicas;

/**
 *
 * @author kimberlyplima
 */
public class OperacoesMatematicas {
    
    public static void main(String[] args) {
        
        // Métodos da classe Math para arredondar valores:
        float v1 = 9.2f;
        
        int minimo = (int) Math.floor(v1); // arredondamento é feito sempre para baixo
        System.out.println("Arredondamento p/ baixo: " + minimo);
        
        int maximo = (int) Math.ceil(v1); // arredondamento é feito sempre para cima
        System.out.println("Arredondamento p/ cima: " + maximo);
        
        int aritmetico = (int) Math.round(v1);
        System.out.println("Arredondamento aritmítico: " + aritmetico + "\n"); // arredondamento feito é o aritmético
        
        System.out.println(Math.abs(-10)); // retorna o valor absoluto
        
        // Métodos da classe Math para gerar valores aleatórios:
        
        float v2 = (float) Math.random(); // gera um valor aleatório entre 0 e 1
        System.out.println(v2);
        
        float v3 = 0 + v2 * (10 - 0); // gera um valor decimal aleatório entre 0 e 10
        System.out.println(v3);
        
        System.out.println(Math.round(v3)); // arredonda valor gerado na linha acima
    }
    
}
