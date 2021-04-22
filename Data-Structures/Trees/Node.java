package Trees;

public class Node {

    int data;
    Node right = null;
    Node left = null;


    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node right, Node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }


}
