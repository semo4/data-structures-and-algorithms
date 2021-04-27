package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree<T> extends BinarySearchTree{
//    Node root;

    public BinaryTree() {
        super();
    }

    public BinaryTree(T value) {
        this.root = new Node(value);
    }


    public boolean isEmpty(){
        return root == null;
    }

    public ArrayList<T> preOrder(){
        ArrayList<T> values = new ArrayList<>();
        return preOrder(this.root, values);
    }

    public ArrayList<T> preOrder(Node curr, ArrayList<T> items){
        if(curr == null){
            return items;
        }
        items.add((T)curr.data);
        items = preOrder(curr.left, items);
        items = preOrder(curr.right, items);
        return items;
    }

    public ArrayList<T> inOrder(){
        ArrayList<T> values = new ArrayList<>();
        return inOrder(this.root, values);
    }

    public ArrayList<T> inOrder(Node curr, ArrayList<T> items){
        if(curr == null){
            return items;
        }
        items = preOrder(curr.left, items);
        items.add((T)curr.data);
        items = preOrder(curr.right, items);
        return items;
    }

    public ArrayList<T> postOrder(){
        ArrayList<T> values = new ArrayList<>();
        return postOrder(this.root, values);
    }

    public ArrayList<T> postOrder(Node curr, ArrayList<T> items){
        if(curr == null){
            return items;
        }
        items = preOrder(curr.left, items);
        items = preOrder(curr.right, items);
        items.add((T)curr.data);
        return items;
    }


    public int findMaximumValue(){
        return findMaximumValue(this.root, (Integer)this.root.data);
    }
    public int findMaximumValue(Node curr, int max){
        if(curr== null){
            return max;
        }
        if((Integer)curr.data >= max){
            max = (Integer)curr.data;
        }
        int maxFromLeft = findMaximumValue(curr.left, max);
        int maxFromRight = findMaximumValue(curr.right, max);
        if(maxFromLeft> maxFromRight){
            max = maxFromLeft;
        }else{
            max= maxFromRight;
        }
        return max;
    }


    public ArrayList<Integer> breadthFirst(){

        return breadthFirst(this.root);
    }
    public ArrayList<Integer> breadthFirst(Node curr ){
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> items = new ArrayList<Integer>();
        if(curr == null){
           throw new NullPointerException("Empty tree");
        }else{
            q.add(curr);
            items.add((Integer)curr.data);
            while(!q.isEmpty()){
                Node temp = q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    items.add((Integer)temp.left.data);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    items.add((Integer)temp.right.data);
                }
            }
            return items;
        }
    }

}

