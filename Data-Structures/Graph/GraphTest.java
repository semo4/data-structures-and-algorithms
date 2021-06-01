package com.example.graph;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
public class GraphTest {

    @Test
    public void addedNodeToGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        assertEquals("Add successfully to graph","a", a.value);
    }
    @Test
    public void addedEdgeToGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        Node b= g.addNodes("b");
        g.addEdges(a,b,10);
        String exp = " Node : 0 : a --10--> b\n" +
                " Node : 1 : b\n";
        assertEquals("Add Edge successfully to graph",exp,g.print());
    }

    @Test
    public void retrieveNodeGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");

        String exp = " Node : 0 : a\n" +
                " Node : 1 : b\n" +
                " Node : 2 : c\n" +
                " Node : 3 : d\n" +
                " Node : 4 : e\n";
        assertEquals("Add Edge successfully to graph",exp,g.print());
    }

    @Test
    public void retrieveneighborsGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");
        g.addEdges(a,b,10);
        g.addEdges(a,c,15);
        g.addEdges(a,d,8);
        List<Edge> edge = a.getNeighbors();
        String res ="";
        for (int i = 0; i < edge.size(); i++) {
            if(edge.get(i).weight == 0){
                res =res +edge.get(i).getNode().value+" ---->\n";
            }
            else{
                res =res + " ----> "+edge.get(i).getNode().value +"\n";
            }
        }
        String exp = " ----> b\n" +
                " ----> c\n" +
                " ----> d\n";
        assertEquals("Add Edge successfully to graph",exp,res);
    }
    @Test
    public void retrieveneighborsWithWeightGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");
        g.addEdges(a,b,10);
        g.addEdges(a,c,15);
        g.addEdges(a,d,8);
        List<Edge> edge = a.getNeighbors();
        String res ="";
        for (int i = 0; i < edge.size(); i++) {
            if(edge.get(i).weight == 0){
                res =res +edge.get(i).getNode().value+" ---->\n";
            }
            else{
                res =res + " --"+edge.get(i).weight+"--> "+edge.get(i).getNode().value +"\n";
            }
        }
        String exp = " --10--> b\n" +
                " --15--> c\n" +
                " --8--> d\n";
        assertEquals("Add Edge successfully to graph",exp,res);
    }

    @Test
    public void sizeGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");

        int exp =5;
        assertEquals("Add Edge successfully to graph",exp,g.size());
    }

    @Test
    public void oneNodeGraph() {
        Graph g = new Graph();
        Node a = g.addNodes("a");
        String exp =" Node : 0 : a\n";
        assertEquals("Add Edge successfully to graph",exp,g.print());
    }
    @Test
    public void nullNodeGraph() {
        Graph g = new Graph();
        assertNull("Add Edge successfully to graph",g.print());
    }

    @Test
    public void testBFSOneNodeWithoutEdge() {
        Graph g = new Graph();

        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");
        System.out.println(g.breadthFirst(a));
        Set<Node> res = g.breadthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        assertEquals("Add Edge successfully to graph","a ",result);
    }

    @Test
    public void testBFSNodeWithEdge() {
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
        Set<Node> res = g.breadthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        assertEquals("Add Edge successfully to graph","c e d b a ",result);
    }

    @Test
    public void testBFSNodeNotInGraph() {
        Graph g = new Graph();

        Node a = new Node("a");
        Set<Node> res = g.breadthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        assertEquals("Add Edge successfully to graph","",result);
    }






      @Test
    public void testDFSOneNodeWithoutEdge() {
        Graph g = new Graph();

        Node a = g.addNodes("a");
        Node b = g.addNodes("b");
        Node c = g.addNodes("c");
        Node d = g.addNodes("d");
        Node e = g.addNodes("e");
        
        List<Node> res = g.depthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        assertEquals("Add Edge successfully to graph","a ",result);
    }

    @Test
    public void testDFSNodeWithEdge() {
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

        assertEquals("Add Edge successfully to graph","a d e h f b c g ",result);
    }

    @Test
    public void testBFSNodeNotInGraph() {
        Graph g = new Graph();

        Node a = new Node("a");
        List<Node> res = g.depthFirst(a);
        String result = "";
        for(Node stock : res){
            result += stock.value+" ";
        }
        assertEquals("Add Edge successfully to graph","",result);
    }




}
