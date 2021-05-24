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





//////////////////////////////////////////////////////////////////////////////////
//////////////tree_Intersection
/////////////////////////////////////////////////////////////////////////////////

    @Test
    public void testTreeIntersectionEmpty(){
        BinaryTree test = new BinaryTree();
        BinaryTree b = new BinaryTree();
        BinaryTree t = new BinaryTree();

        assertNull("the tree empty",test.tree_Intersection(t,b));
    }

    @Test
    public void testTreeIntersectionEqualTree(){
        BinaryTree test = new BinaryTree();
        BinaryTree t = new BinaryTree();
            t.add(150);
            t.add(100);
            t.add(250);
            t.add(75);
            t.add(160);
            t.add(200);
            t.add(350);
            t.add(125);
            t.add(175);
            t.add(300);
            t.add(500);

        BinaryTree b = new BinaryTree();
            b.add(42);
            b.add(100);
            b.add(600);
            b.add(15);
            b.add(160);
            b.add(200);
            b.add(350);
            b.add(125);
            b.add(175);
            b.add(4);
            b.add(500);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(160);
        a.add(100);
        a.add(500);
        a.add(200);
        a.add(125);
        a.add(350);
        a.add(175);

        assertEquals("the tree full",a,test.tree_Intersection(t,b));
    }

    @Test
    public void testTreeIntersectionNotEqualTree(){
        BinaryTree test = new BinaryTree();
        BinaryTree t = new BinaryTree();
        t.add(150);
        t.add(100);
        t.add(250);
        t.add(75);
        t.add(160);
        t.add(200);
        t.add(350);
        t.add(125);
        t.add(175);
        t.add(300);
        t.add(500);

        BinaryTree b = new BinaryTree();
        b.add(42);
        b.add(100);
        b.add(600);
        b.add(15);
        b.add(160);
        b.add(200);
        b.add(350);
        b.add(125);


        ArrayList<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(125);
        a.add(160);
        a.add(200);
        a.add(350);
        assertEquals("the tree full",a,test.tree_Intersection(t,b));
    }

}
