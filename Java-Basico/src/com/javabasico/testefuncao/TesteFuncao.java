/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.testefuncao;

/**
 *
 * @author kimberlyplima
 */
public class TesteFuncao {
    
    static void soma(int a, int b){
        int s = a+b;
        System.out.println("A primeira soma é " + s);
    }
    
    static int soma2(int a, int b){
        int s = a+b;
        return s;
    }
    
    // static: não é necessário instanciar a classe para utilizar os métodos dela
    public static String contador (int i, int f){
        String s = "";

        for(int c = i; c <= f; c++){
            s += c + " ";
        }

        return s;
    }
    
    public TesteFuncao(){
        soma(5,2);
        int resultado = soma2(3,9);
        
        System.out.println("O resultado da segunda soma é " + resultado);
    }
        
}
