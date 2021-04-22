package Trees;

import java.util.ArrayList;

public class BinaryTree extends BinarySearchTree{
    // Node root;

    public BinaryTree() {
       super();
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }


    public boolean isEmpty(){
        return root == null;
    }

    public ArrayList<Integer> preOrder(){
        ArrayList<Integer> values = new ArrayList<>();
        return preOrder(this.root, values);
    }

    public ArrayList<Integer> preOrder(Node curr, ArrayList<Integer> items){
        if(curr == null){
            return items;
        }
        items.add(curr.data);
        items = preOrder(curr.left, items);
        items = preOrder(curr.right, items);
        return items;
    }

    public ArrayList<Integer> inOrder(){
        ArrayList<Integer> values = new ArrayList<>();
        return inOrder(this.root, values);
    }

    public ArrayList<Integer> inOrder(Node curr, ArrayList<Integer> items){
        if(curr == null){
            return items;
        }
        items = preOrder(curr.left, items);
        items.add(curr.data);
        items = preOrder(curr.right, items);
        return items;
    }

    public ArrayList<Integer> postOrder(){
        ArrayList<Integer> values = new ArrayList<>();
        return postOrder(this.root, values);
    }

    public ArrayList<Integer> postOrder(Node curr, ArrayList<Integer> items){
        if(curr == null){
            return items;
        }
        items = preOrder(curr.left, items);
        items = preOrder(curr.right, items);
        items.add(curr.data);
        return items;
    }


}
