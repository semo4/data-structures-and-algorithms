package com.example.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetEdge {

    public String getEdges(Graph cityGraph, Node [] cities){
        if(cities.length<2 ){
            return "False, $0";
        }

        int cost = 0;
        boolean nextCity = false;
        List<Node> citiesNode = cityGraph.getNodes();
        for (int i = 0; i < cities.length; i++) {
            System.out.println("loop "+i);
            for(Node city: citiesNode){
                if(city.value.equals(cities[i].value)){
                    List<Edge> cityNode =city.getNeighbors();
                    for(Edge edge: cityNode){
                        for(int j =0; j<cities.length ; j++){
                            if(edge.getNode().value.equals(cities[j].value)){
                                cost = cost + edge.weight;
                                if(edge.getNode().equals(cities[cities.length-1])){
                                    nextCity = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if(nextCity){
            return "True, $"+cost;
        }else{
            return "False, $0";
        }
    }
}
