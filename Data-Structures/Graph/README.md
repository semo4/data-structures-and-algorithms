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