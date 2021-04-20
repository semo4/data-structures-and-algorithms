public class Stack {
      private Nodes top;

    public Stack(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public void push(char value){
        Nodes newNode = new Nodes(value);
        newNode.next = top;
        top = newNode;
    }

    public char pop(){
        if(!isEmpty()){
            char returnValue = top.data;
            top = top.next;
            return returnValue;
        }
        throw new NullPointerException("the Stack is empty");
    }

    public char peek(){
        if(!isEmpty()){
            return top.data;
        }else{
            throw new NullPointerException("the Stack is empty");
        }

    }
}

class Nodes{
    public char  data;
    public Nodes next;
    public Nodes(char x){
        data = x;
        next = null;
    }
}
