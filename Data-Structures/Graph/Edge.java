package com.example.graph;

public class Edge {

    Node node;
    int weight;

    public Edge(Node node) {
        this.node = node;
        this.weight= 0;
    }

    public Edge(Node node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public Node getNode(){
        return node;
    }
}
