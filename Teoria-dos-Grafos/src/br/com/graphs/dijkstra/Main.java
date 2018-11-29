/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graphs.dijkstra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vertex zero = new Vertex("0");
        Vertex um = new Vertex("1");
        Vertex dois = new Vertex("2");
        Vertex tres = new Vertex("3");
        Vertex quatro = new Vertex("4");
        Vertex cinco = new Vertex("5");

        zero.addNeighbour(new Edge(5, zero, um));
        zero.addNeighbour(new Edge(15, zero, quatro));
        zero.addNeighbour(new Edge(2, zero, cinco));
        um.addNeighbour(new Edge(5, um, zero));
        um.addNeighbour(new Edge(9, um, tres));
        um.addNeighbour(new Edge(22, um, quatro));
        um.addNeighbour(new Edge(4, um, cinco));
        dois.addNeighbour(new Edge(12, dois, tres));
        dois.addNeighbour(new Edge(1, dois, quatro));
        tres.addNeighbour(new Edge(9, tres, um));
        tres.addNeighbour(new Edge(12, tres, dois));
        tres.addNeighbour(new Edge(6, tres, cinco));
        quatro.addNeighbour(new Edge(15, quatro, zero));
        quatro.addNeighbour(new Edge(1, quatro, dois));
        cinco.addNeighbour(new Edge(2, cinco, zero));
        cinco.addNeighbour(new Edge(4, cinco, um));
        cinco.addNeighbour(new Edge(6, cinco, tres));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(zero);

        System.out.println(dijkstra.getShortestPathTo(dois));
    }
}