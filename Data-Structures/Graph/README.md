# Graphs
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
- Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

- AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
- AddEdge()
    - Adds a new edge between two nodes in the graph
    - Include the ability to have a “weight”
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
- GetNodes()
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
    - Returns a collection of nodes connected to the given node
    - Takes in a given node
    - Include the weight of the connection in the returned collection
- Size()
    - Returns the total number of nodes in the graph

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- The overall structure of the graph would be to have the graph class holds a list of nodes and within those nodes, each of them have their list of edges that indicate which nodes they point to. And so we would have a Node class that holds a value and a list of type Edge and the Edge class would holds the weight of the connection and what Node it points to.

O(1);

## API
<!-- Description of each method publicly available in your Graph -->

- Node addNode(T value): create a node with the input value and add that node to the set of nodes in the graph class and return the created node.
- Edge addEdge(Node node1, Node node2, (optional) int weight): create a new edge object that points to node2 and add that edge object to the list of edges in node1.
- List<Node> getNodes() : just return the list of nodes in the graph class.
- List<Edge> getNeighbors(Node node): return the list of edges in the node object
- int size(): return the size of the set of nodes in the graph class.
- String print() : return whole graph of node and it's edge that connect in each node and it's weight if it exist




################################################### 
# code 36 
# Challenge Summary
<!-- Description of the challenge -->
Implement a breadth-first traversal on a graph. Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.
## Whiteboard Process
<!-- Embedded whiteboard image -->
- [Whiteboard image](https://drive.google.com/file/d/15h1bcxvThWROEh-KbObfYOB0WnYVlCbY/view?usp=sharing)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 This solution utilize a queue to keep track of which nodes to visit next and also a set to keep track which nodes already visited. Since nodes in graph can connect in ways that if we dont keep track of the ones we already visited, we can end up traversing in an endless cycle. And so at every node we visit, we would add all of its neighbor nodes to the back of the queue and also to the set. Then we just dequeue whichever node is in the front of queue and continue to visit the next one.

This solution would take O(n) time since there is a chance that we will visit every nodes. Space-wise, it would take O(n) since we are storing the nodes in the set and also temporarily in the queue.

## Solution
<!-- Show how to run your code, and examples of it in action -->
- create graph object 
- add node to graph 
- add edge between node with weight 
- call the BFS function 
- print the result after the BFS algorithm


##########################################################################
# Challenge Summary
<!-- Description of the challenge -->
Write a function which takes in a graph, and an array of city names. Return whether or not the full trip is possible with direct flights and how much it would cost.

## Whiteboard Process
<!-- Embedded whiteboard image -->
- [Whiteboard image](https://drive.google.com/file/d/1N8YxkGQ9BlwxAZDYoVli7QJGALM9qJNE/view?usp=sharing)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

- getEdge() -----> O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->

- add node to graph
- add edge between node and the weight for the trip from one node to it's neighbors
- create object from GetEdge class
- call the function getEdge 
- send graph and array of cities to the getEdge
- return the result


#####################################################################

# Challenge Summary
<!-- Description of the challenge -->
Create a function that accepts an adjacency list as a graph and conducts a depth first traversal. Return a collectio of nodes in their pre-order depth-first traversal order.

## Whiteboard Process
<!-- Embedded whiteboard image -->
- [Whiteboard image](https://drive.google.com/file/d/1T9EMNKU-EmSsWIEBmqSGUGWs9BfPFLqu/view?usp=sharing)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Similar to how we did breadth-first traversal on a graph, instead of utilizing a queue to keep track of which to nodes to visit next, we will use a stack instead. Essentially, at every node that we visit, we first would put the node onto a list that would be our return collection. Then we would put all of its neighbors onto a stack and also a set that will keep track of which nodes we already visited. At the next iteration, we would just pop a single node off of the stack and that would be our current node. Then we would just repeat the process until the stack is empty in which we traverse every nodes that can be reached in the graph.

This solution will takes O(n) time where n is the total number of nodes in the graph since we might have to traverse through all of the nodes. Space-wise, it would be O(n) as well in the case of where the graph is secretly a linked list and we would have to put all of the nodes onto the stack before we start to pop nodes off.

## Solution
<!-- Show how to run your code, and examples of it in action -->
- create graph object 
- add node to graph 
- add edge between node with weight 
- call the BFDFSS function 
- print the result after the DFS algorithm
