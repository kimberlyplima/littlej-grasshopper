/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.idiomadosistema;

/**
 *
 * @author kimberlyplima
 */
public class IdiomaSistema {
    
    public static void main (String[] args){

    String language = System.getProperty("user.language");

    System.out.println("O idioma do sistema é " + language);
  }
}
