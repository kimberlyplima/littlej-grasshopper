/*
* Operadores lógicos
*/   
package com.javabasico.operadores;

/**
 *
 * @author kimberlyplima
 */
public class Operadores {
    public Operadores(){         
        int n1 = 5;
        int n2 = 3;
        
        int maior = n1>n2? n1:n2;
        System.out.println(maior);
        
        /* Operador ternário:
         * n1 e n2 antes da interrogaçãosão os operandos (valores que serão comparados)
         * n1 depois da interrogação representa o valor atribuido se a declaração for verdadeira
         * n2 depois dos : representa o valor atribuido se a declaração for falsa
         * 
         * Analogamente a um if tradicional:
         * n1 : -> if == true
         * : n2 -> else
         */
        
        // Comparando strings:
        
        String nome1 = "Kimberly";
        String nome2 = "Maria";
        String nome3 = new String("Kimberly");
        String result;
        String result2;
        
        result2 = nome1==nome2?"Nomes 1 e 2 são iguais":"Nomes 1 e 2 são diferentes";
        System.out.println(result2);
        
        result = (nome1.equals(nome3))?"Nomes 1 e 3 são iguais":"Nomes 1 e 3 são diferentes";
        System.out.println(result);
        
        /* Quando comparamos "objetos" iguais, podemos utilizar == 
         * (nome 1 e nome 2 têm a mesma estrutura, são variáveis do tipo String)
         *
         * Quando comparamos objetos diferentes, utilizamos o método equals
         * (nome 1 é uma variável e nome 3 é um objeto da classe String)
         */
    }
}
