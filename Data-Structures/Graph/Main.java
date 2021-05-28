package com.example.graph;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Graph g = new Graph();

        Node a = g.addNodes("a");
//        Node b = g.addNodes("b");
//        Node c = g.addNodes("c");
//        Node d = g.addNodes("d");
//        Node e = g.addNodes("e");
//
//
//        g.addEdges(a,b,10);
//        g.addEdges(a,c,15);
//        g.addEdges(a,d,8);
//        g.addEdges(b,d,5);
//        g.addEdges(c,d,8);
//        g.addEdges(d,a,8);
//        g.addEdges(d,b,3);
//        g.addEdges(d,c,1);
//        g.addEdges(e,d,8);
//        g.addEdges(e,a,8);
//        g.addEdges(e,b,3);
//        g.addEdges(e,c,1);

        System.out.println(g.print());
//        System.out.println(a.getNeighbors());
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




    }
}
