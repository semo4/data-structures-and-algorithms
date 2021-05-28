package com.example.graph;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class Node {
    Object value;
     List<Edge> neighbors;

    public Node(Object value) {
        this.value = value;
        this.neighbors = new ArrayList<Edge>();
    }

    public List<Edge> getNeighbors(){
        return neighbors;
    }

    public void addNeighbors(Edge neighbors){
        this.neighbors.add(neighbors);
    }
}
