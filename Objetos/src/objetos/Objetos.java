/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author kimberlyplima
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Notebook mac = new Notebook();
        
        mac.bateria = 100;
        mac.marca = "Apple";
        mac.memoria = "79,21Gb";
        
        mac.ligar();
        
        mac.status();
    }
    
}
