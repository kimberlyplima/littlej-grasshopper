package br.com.graphs.dijkstra;

/**
 *
 * @author kimberlyplima
 */
public class Vertex {
    private int id;
    private int distance;
    
    public Vertex(int id){
        this.id = id;
        this.distance = -1;
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
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
}
