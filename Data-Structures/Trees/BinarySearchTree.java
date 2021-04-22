package Trees;

public class BinarySearchTree{
        Node root;
        BinaryTree tree;

    public BinarySearchTree() {
       this.root = null;

    }

    public BinarySearchTree(int value) {
        this.root = new Node(value);
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


































