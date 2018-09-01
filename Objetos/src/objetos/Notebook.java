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
public class Notebook {
    
    String marca;
    String modelo;
    String tamanhoDaTela;
    String memoria;
    int bateria;
    boolean ligado;
    
    void status(){
        if (this.ligado == true){
            System.out.println("Memória disponível: " + this.memoria);
            System.out.println("Nível de bateria: " + this.bateria + "%");            
        } else {
            System.out.println("Nenhuma informação disponível.");
        }
    }
    
    void ligar(){
        this.ligado = true;
        System.out.println("Computador ligado.");
    }
    
    void desligar(){
        this.ligado = false;
        System.out.println("Computador desligado.");
    }
}
