/*
 * Captura e exibe o idioma do sistema operacional.
 */        
package com.javabasico.idiomasistema;

/**
 *
 * @author kimberlyplima
 */
public class IdiomaSistema {
    public IdiomaSistema(){
        String language = System.getProperty("user.language");
        System.out.println("O idioma do sistema é " + language);
    }
}
