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
  
  // qusetion solved tranning 
  
    // question that i added
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
        if (left != null && (Integer)root.data <=(Integer)left.data)
            return false;
        if (right != null && (Integer)root.data >= (Integer)right.data)
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
        List<List<Integer>> values = new ArrayList<List<Integer>>();
        if(root ==null){
            return values;
        }
        if(root!= null){
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            List<Integer> items = new ArrayList<>();
            items.add((Integer)root.data);
            values.add(items);
            while(!queue.isEmpty()){
               Node curr = queue.poll();
                List<Integer> item = new ArrayList<>();

                if(curr.left != null){
                    queue.add(curr.left);
                    item.add((Integer)curr.left.data);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                    item.add((Integer)curr.right.data);
                }
                if(!item.isEmpty()){
                    values.add(item);
                }


            }


        }
        return values;
    }

    public int treeSum(Node curr){
        if(curr == null){
            return 0;
        }
        int leftSum = treeSum(curr.left);
        int rightSum = treeSum(curr.right);

        return ((Integer)curr.data + leftSum+ rightSum);
    }

    public  boolean inTree(Node curr, int value){
        if(curr== null){
            return false;
        }
        boolean inLeft = inTree(curr.left, value);
        boolean inRight = inTree(curr.right, value);
        return (Integer)curr.data == value || inLeft || inRight;
    }

    public void reverseTree(Node root){
        if(root == null){
            return ;
        }
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;

        reverseTree(root.left);
        reverseTree(root.right);
    }

    public boolean hasPathSum(Node root, int targetSum){
        if(root == null){
            return false;
        }
        targetSum -= (Integer)root.data;
        if(targetSum ==0 && root.left == null && root.right == null){
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);

        return left || right;


    }

    public boolean isSameTree(Node rootOne, Node rootTwo){
        if(rootOne == null && rootTwo == null){
            return true;
        }
        if(rootOne == null || rootTwo == null){
            return false;
        }

        return (Integer)rootOne.data == (Integer)rootTwo.data && isSameTree(rootOne.left, rootTwo.left) && isSameTree(rootOne.right, rootTwo.right);
    }

    public Node mergeTrees(Node t1, Node t2){
        if(t1== null & t2!=null){
            t1=t2;
        }else{
            merge(t1,t2);
        }
        return t1;
    }

    public void merge(Node t1, Node t2){
        if(t1== null & t2!=null){
            t1=t2;
        }else if (t1 != null & t2 !=null){
           int  newValue = ((Integer)t1.data + (Integer)t2.data);
            t1.data  = newValue;
            merge(t1.left, t2.left);
            merge(t1.right, t2.right);

            if(t1.left == null && t2.left!=null){
                t1.left = t2.left;
            }
            if(t1.right == null && t2.right!=null){
                t1.right = t2.right;
            }
        }
    }


    public void zigzagPrint(Node root){
        if(root == null){
            return;
        }
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean leftToRight = true;

        while(!currentLevel.isEmpty()){
            Node curr = currentLevel.pop();

            System.out.print(curr.data +" ");

            if(leftToRight){
                if(curr.left != null){
                    nextLevel.push(curr.left);
                }
                if(curr.right != null){
                    nextLevel.push(curr.right);
                }
            }else{
                if(curr.right != null){
                    nextLevel.push(curr.right);
                }
                if(curr.left != null){
                    nextLevel.push(curr.left);
                }
            }
            if(currentLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    public boolean isMinHeap(int [] arr){
        int n = arr.length-1;

        for (int i = (n/2-1); i >=0 ; i--) {
            if(arr[i] > arr[ 2*i + 1 ]){
                return false;
            }
            if(2*i +2 < n){
                if(arr[i] > arr[ 2*i + 2 ]){
                    return false;
                }
            }

        }
        return true;
    }

   public int countLeaf(){
        return countLeaves(root);
   }

   public int countLeaves(Node root){
        if(root == null){
            return 0;
        }
        if(root.isLeaf()){
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
   }

   public boolean isFullBinaryTree(Node root){
        if(root == null){
            return true;
        }
        else if(root.left ==null && root.right == null){
            return true;
        }
        return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);

   }

   public int minDepth(Node root){
        if(root == null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(root.left == null){
            return left + 1;
        }
       if(root.right == null){
           return right + 1;
       }

       if(left<right){
           return left + 1;
       }else{
           return right + 1;
       }
   }

   public boolean isIdentical(Node rootOne, Node rootTwo){
        if(rootOne== null && rootTwo == null){
            return true;
        }
        return (rootOne!=null && rootTwo!=null) && (rootOne.data == rootTwo.data) &&
                isIdentical(rootOne.left, rootTwo.left)
                && isIdentical(rootOne.right, rootTwo.right);
   }

   public int convertInPlace(Node root){
        if(root ==null){
            return 0;
        }

        int left = convertInPlace(root.left);
        int right = convertInPlace(root.right);

        int temp = (Integer)root.data;
        root.data = left + right;

        return (Integer)root.data + temp;

   }

   public int isSumTree(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return (Integer)root.data;
        }
        if((Integer)root.data == isSumTree(root.left) + isSumTree(root.right)){
            return 2* (Integer)root.data;
        }

        return Integer.MIN_VALUE;
   }

   public void pathToLeaf(Node root){
        Deque<Integer> path = new ArrayDeque<>();
        printPathToLeaf(root, path);
   }

   public void printPathToLeaf(Node root,  Deque<Integer> path ){
        if(root == null){
            return;
        }
        path.addLast((Integer)root.data);

        if(root.isLeaf()){
            System.out.println(path);
        }
       printPathToLeaf(root.left, path);
       printPathToLeaf(root.right, path);

       path.removeLast();
   }

   public boolean printAncestors(Node root, int value){
        if(root == null){
            return false;
        }
        if((Integer)root.data == value){
            return true;
        }

        boolean left = printAncestors(root.left, value);

        boolean right = false;
        if(!left){
            right = printAncestors(root.right, value);
        }
        if(left||right){
            System.out.println(root.data+" ");
        }
        return left || right;
   }

   public void diagonalSum(Node root){
        Map<Integer,Integer> map = new HashMap<>();
       diagonalSum(root, 0, map);
       System.out.println(map.values());
   }

   public void diagonalSum(Node root, int d,  Map<Integer,Integer> map){
        if(root==null){
            return;
        }
        map.put(d, map.getOrDefault(d,0)+ (Integer)root.data);
       diagonalSum(root.left, d+1, map);
       diagonalSum(root.right, d, map);
   }

   public void snikNodes(Node root){
        if(root == null){
            return;
        }
        snikNodes(root.left);
        snikNodes(root.right);

        if((Integer)root.data==0){
            sink(root);
        }
    }

   public void sink(Node root){
        if(root == null){
            return;
        }
        if(root.left!= null && (Integer)root.left.data !=0){
            int temp = (Integer)root.data;
            root.data = root.left.data;
            root.left.data = temp;
            sink(root.left);
        }
        else  if(root.right!= null && (Integer)root.right.data !=0){
            int temp = (Integer)root.data;
            root.data = root.right.data;
            root.right.data = temp;
            sink(root.right);
        }
    }

   public boolean isBalanced(Node root){
        AtomicBoolean isBalance = new AtomicBoolean(true);
        isHeightBalanced(root, isBalance);
        return isBalance.get();
    }

    public int isHeightBalanced(Node root, AtomicBoolean isBalance){
        if(root == null || isBalance.get()){
            return 0;
        }

        int left_height = isHeightBalanced(root.left, isBalance);
        int right_height = isHeightBalanced(root.right, isBalance);

        if(Math.abs(left_height - right_height) > 1){
            isBalance.set(false);
        }
        return Math.max(left_height, right_height)+1;
    }


}

