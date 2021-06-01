package com.example.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Graph myGraph = new Graph();
        Graph g = new Graph();

        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");


        g.addEdges(a,b,10);
        g.addEdges(a,c,15);
        g.addEdges(a,d,8);
        g.addEdges(a,e,8);
        g.addEdges(b,d,5);
        g.addEdges(c,d,8);
        g.addEdges(d,a,8);
        g.addEdges(d,b,3);
        g.addEdges(d,c,1);
        g.addEdges(e,d,8);
        g.addEdges(e,a,8);
        g.addEdges(e,b,3);
        g.addEdges(e,c,1);


        Set<Node> res = g.breadthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        System.out.println(result);
//        List<Edge> edge = a.getNeighbors();
//        String res ="";
//        for (int i = 0; i < edge.size(); i++) {
//            if(edge.get(i).weight == 0){
//                res =res +edge.get(i).getNode().value+" ---->\n";
//            }
//            else{
//                res =res + " --"+edge.get(i).weight+"--> "+edge.get(i).getNode().value +"\n";
//            }
//        }
//        System.out.println(res);


     Graph graph = new Graph();
        Node a = graph.addNodes("a");
        Node b = graph.addNodes("b");
        Node c = graph.addNodes("c");
        Node d = graph.addNodes("d");
        Node e = graph.addNodes("e");
        Node f = graph.addNodes("f");
        Node h = graph.addNodes("h");
        Node g = graph.addNodes("g");
        graph.addEdges(a,b,10);
        graph.addEdges(a,d,15);
        graph.addEdges(b,c,8);
        graph.addEdges(b,d,8);
        graph.addEdges(c,g,5);
        graph.addEdges(d,f,8);
        graph.addEdges(d,h,8);
        graph.addEdges(d,e,8);
        graph.addEdges(f,h,8);

        List<Node> res = graph.depthFirst(a);

        String result = "";
        for (int i = 0; i < res.size(); i++) {
            result += res.get(i).value+" ";
        }
        System.out.println(result);

    }
}
