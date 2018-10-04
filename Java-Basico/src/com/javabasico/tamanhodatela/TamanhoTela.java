/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabasico.tamanhodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author kimberlyplima
 */
public class TamanhoTela {
    
    public TamanhoTela(){

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();

        System.out.println ("Tamanho da tela");
        System.out.println ("Altura " + height + "px");
        System.out.println ("Largura " + width + "px");
    }
}
