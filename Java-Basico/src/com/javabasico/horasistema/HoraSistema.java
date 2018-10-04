/*
 * Captura e exibe a hora do sistema operacional.
 */
package com.javabasico.horasistema;

import java.util.Date;

/**
 *
 * @author kimberlyplima
 */
public class HoraSistema {
    public HoraSistema(){
        Date watch = new Date();

        System.out.print("A hora/data do sistema é ");
        System.out.println(watch.toString());
    }
}
