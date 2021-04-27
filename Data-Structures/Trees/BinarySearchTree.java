package Trees;

public class BinarySearchTree<T extends Comparable>{
        Node root;
        BinaryTree tree;

    public BinarySearchTree() {
       this.root = null;

    }

    public BinarySearchTree(T value) {
        this.root = new Node(value);
    }

    public void add(T value){

            this.root = add(this.root, value);


    }

    public Node add(Node curr, T value){
        try{
            if (curr == null){
                curr = new Node(value);
                return  curr;
            }
            else if( value.compareTo(curr.data ) > 0){
                curr.right = add(curr.right, value);
            }else{
                curr.left = add(curr.left, value);
            }
            return curr;
        }catch(NullPointerException e){
            throw new NullPointerException("empty list");
        }
    }

    public boolean contains(T value ){
        return contains(this.root, value);
    }

    public boolean contains(Node curr, T value){
        try{
            if(curr == null){
                return false;
            }else if(curr.data == value){
                return true;
            }else if(value.compareTo(curr.data ) < 0){
                return contains(curr.left, value);
            }else{
                return contains(curr.right, value);
            }
        }catch (NullPointerException e){
            throw new NullPointerException("empty list");
        }

    }

}
