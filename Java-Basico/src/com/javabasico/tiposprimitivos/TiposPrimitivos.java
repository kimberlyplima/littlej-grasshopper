/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.tiposprimitivos;
import java.util.Scanner;

/**
 *
 * @author kimberlyplima
 */
public class TiposPrimitivos {
    public TiposPrimitivos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota);        
    }
}
