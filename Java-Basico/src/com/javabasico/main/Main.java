package com.javabasico.main;

import com.javabasico.fibonacci.Fibonacci;
import com.javabasico.horasistema.HoraSistema;
import com.javabasico.idiomasistema.IdiomaSistema;
import com.javabasico.operadores.Operadores;
import com.javabasico.primeiroprograma.HelloWorld;
import com.javabasico.primos.Primos;
import com.javabasico.tamanhodatela.TamanhoTela;
import com.javabasico.testefuncao.TesteFuncao;
import com.javabasico.operacoesmatematicas.Operacoes;
import com.javabasico.tiposprimitivos.TiposPrimitivos;
import com.javabasico.vetores.Vetores;
import com.javabasico.visibilidades.Caneta;

/**
 *
 * @author kimberlyplima
 */
public class Main {
    public static void main(String[] args) {
        /*
        HelloWorld hw = new HelloWorld();

        Fibonacci teste = new Fibonacci();
        teste.showFibonacci();
        
        HoraSistema hs = new HoraSistema();
        
        IdiomaSistema is = new IdiomaSistema();
        
        Vetores v = new Vetores();
        
        Operacoes o = new Operacoes();

        Operadores op = new Operadores();

        Primos testar = new Primos();
        testar.primo(21);
        
        TamanhoTela tt = new TamanhoTela();
        
        TesteFuncao tf = new TesteFuncao();
        System.out.println(TesteFuncao.contador(6,9));
        
        TiposPrimitivos tp = new TiposPrimitivos();
        */
        
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        //c1.carga = 80;
        
        c1.status();
        c1.rabiscar();
    }
}
