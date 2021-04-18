package Data-Structures.stacksandqueues;


import java.util.NoSuchElementException;

public class PseudoQueue {

  Stack stack1 ;
  Stack stack2 ;

    public PseudoQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new NoSuchElementException("Unable to dequeue will two stack is empty");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
}