package Trees;

import java.util.ArrayList;

public class BinaryTree{
    Node root;

    public BinaryTree() {
        this.root = null;
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




    public void add(int value){
        this.root = add(this.root, value);
    }

    public Node add(Node curr, int value){
        if (curr == null){
            curr = new Node(value);
            return  curr;
        }
        else if(curr.data < value){
            curr.right = add(curr.right, value);
        }else{
            curr.left = add(curr.left, value);
        }
        return curr;

    }





    public boolean contains(int value ){
        return contains(this.root, value);
    }

    public boolean contains(Node curr, int value){
        if(curr == null){
            return false;
        }else if(curr.data == value){
            return true;
        }else if(curr.data > value){
            return contains(curr.left, value);
        }else{
            return contains(curr.right, value);
        }
    }




}
