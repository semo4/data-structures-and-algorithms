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

    public int findMaximumValue() {
        return findMaximumValue(this.root, this.root.data);
    }

    public int findMaximumValue(Node curr, int max) {
        if (curr == null) {
            return max;
        }
        if (curr.data >= max) {
            max = curr.data;
        }
        int maxFromLeft = findMaximumValue(curr.left, max);
        int maxFromRight = findMaximumValue(curr.right, max);
        if (maxFromLeft > maxFromRight) {
            max = maxFromLeft;
        } else {
            max = maxFromRight;
        }
        return max;
    }


}
