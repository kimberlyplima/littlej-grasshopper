package br.com.graphs.dijkstra;

/**
 *
 * @author kimberlyplima
 */
public class Vertex {
    private int id;
    private int cost;
    
    public Vertex(int id){
        this.id = id;
        this.cost = -1;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
