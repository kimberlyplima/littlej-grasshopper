/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vertex;

/**
 *
 * @author kimberlyplima
 */
public class Arc{
    
    private Vertex v;
    private Vertex w;
    

    /**
     * @return the v
     */
    public Vertex getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Vertex v) {
        this.v = v;
    }

    /**
     * @return the w
     */
    public Vertex getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(Vertex w) {
        this.w = w;
    }

    /**
     * @return the new arc with vertex v and w 
     */    
    public Arc createArc(Vertex v, Vertex w){
        Arc arco = new Arc();

        arco.setV(v);
        arco.setW(w);
        
        return arco;
    }
    
    public void showArcs(Arc arco){
        System.out.println(arco);
    }
}
