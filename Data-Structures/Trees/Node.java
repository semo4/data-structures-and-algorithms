package Trees;

public class Node<T> {

    T data;
    Node right = null;
    Node left = null;


    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node right, Node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }


}
