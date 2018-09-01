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
    public String getV() {
        return v.getVertex();
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
    public String getW() {
        return w.getVertex();
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
}
