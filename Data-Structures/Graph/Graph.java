package com.example.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph{
    List<Node> graph;

    public Graph() {
        this.graph = new ArrayList<>();
    }

    public Node addNodes(Object value){
        Node node = new Node(value);
        graph.add(node);
        return node;
    }

    public void addEdges(Node nodeOne, Node nodeTwo){
        if(graph.contains(nodeOne) && graph.contains(nodeTwo)){
            Edge edge = new Edge(nodeTwo);
            nodeOne.addNeighbors(edge);
        }else{
            throw new IllegalArgumentException("node not added to the graph");
        }

    }


    public void addEdges(Node nodeOne, Node nodeTwo, int weight){
        if(graph.contains(nodeOne) && graph.contains(nodeTwo)){
            Edge edge = new Edge(nodeTwo, weight);
            nodeOne.addNeighbors(edge);
        }else{
            throw new IllegalArgumentException("node not added to the graph");
        }
    }

    public List<Node> getNodes(){
        if(size() ==0){
            return null;
        }
        return this.graph;
    }

    public List<Edge> getNeighbors(Node node){
        if(node.getNeighbors().size() ==0){
            return null;
        }
        return node.getNeighbors();
    }


    public int size(){
        return this.graph.size();
    }

    public String print(){
        if(size()==0){
            return null;
        }else{
            List<Node> l = getNodes();
            String res = "";
            for (int i = 0; i <l.size() ; i++) {
                List<Edge> edge = l.get(i).getNeighbors();
                res =res +" Node : "+i +" : " + l.get(i).value;
                for (int j = 0; j < edge.size() ; j++) {
                    if(edge.get(j).weight == 0){
                        res =res +edge.get(j).getNode().value+" ---->";
                    }
                    else{
                        res =res + " --"+edge.get(j).weight+"--> "+edge.get(j).getNode().value ;
                    }
                }
                res = res + "\n";
            }
            return res;
        }
    }
}
