package Trees;

public class FizzBuzzTree {
    public BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> curr){
        fizzBuzzTree(curr.root);
        return curr;
    }
    public void fizzBuzzTree(Node curr){
        if(curr == null){
            return;
        }
        if((Integer)curr.data %3 ==0 && (Integer)curr.data%5==0){
            curr.data = "FizzBuzz";
        }else if((Integer)curr.data %3 ==0 ){
            curr.data = "Fizz";
        }else if((Integer)curr.data %5 ==0 ){
            curr.data = "Buzz";
        }else{
            curr.data = curr.data+"" ;
        }
        fizzBuzzTree(curr.left);
        fizzBuzzTree(curr.right);

    }
}