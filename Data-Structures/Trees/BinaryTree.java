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


      public  ArrayList<T> tree_Intersection(BinaryTree treeOne, BinaryTree treeTwo){
        ArrayList<T> itemsTreeOne ;
        ArrayList<T> itemsTreeTwo ;
        if(treeOne.root == null && treeTwo.root==null){
            return null;
        }else if(treeOne.root == null || treeTwo.root==null){
            return null;
        }
        itemsTreeOne = treeOne.inOrder();
        itemsTreeTwo = treeTwo.inOrder();
        ArrayList<T> s = new ArrayList<>();
        int j =0;
        for(int i =0; i< itemsTreeOne.size();i++){
           while(j< itemsTreeTwo.size()){
                if(itemsTreeOne.get(i).equals(itemsTreeTwo.get(j))){
                    s.add(itemsTreeOne.get(i));
                }
                j++;
            }
            j=0;
        }
        return s;
    }
  
     public boolean isSymmetric(Node root) {
        return mirror(root, root);    
    }
    public boolean mirror(Node left, Node right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return (left.data == right.data) && mirror(left.left, right.right) && mirror(left.right, right.left); 
   
    }
  
   public boolean isValidBST(Node root) {
        
         return isBST(root,null,null ) ;
    }
    
    public boolean isBST(Node root, Node left, Node right){
        if (root == null)
            return true;
         if (left != null && root.data <=left.data)
            return false;
        if (right != null && root.data >= right.data)
            return false;
        
        return isBST(root.left, left, root) &&isBST(root.right, root, right);
    }
  
      public int maxDepth(Node root) {
        if (root == null) 
          return 0; 

    // Get the depth of the left and right subtree 
    // using recursion.
        int leftDepth = maxDepth(root.left); 
        int rightDepth = maxDepth(root.right); 

    // Choose the larger one and add the root to it.
       if (leftDepth > rightDepth) 
        return (leftDepth + 1); 
      else 
       return (rightDepth + 1); 
     
    }
  public List<List<Integer>> levelOrder(Node root) {
    
        Queue<Node> queue = new LinkedList<Node>();
        
        queue.add(root);
        List<List<Integer>> values = new ArrayList<List<Integer>>();
        List<Integer> items = new ArrayList<>();
        items.add(root.data);
         values.add(items);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
             List<Integer> item = new ArrayList<>();
       
            if(curr.left != null){
                 queue.add(curr.left);
                 item.add(curr.left.data);
            }
            
             if(curr.right != null){
                 queue.add(curr.right);
                  item.add(curr.right.data);
            }
            if(!item.isEmpty()){
                 values.add(item);
            }
        
           
        }
        
        return values;
    }

}

