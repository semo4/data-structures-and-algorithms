package Data-Structures.utilities;

public class Queue {
    private Node front;
    private Node tail;

    public Queue(){
        front= tail =null;

    }

    public boolean isEmpty(){
        return front==null ;
    }

    public void enqueue(String  value){
        Node newNode = new Node(value);
        if(!isEmpty()){
            tail.next = newNode;
            tail = tail.next;
        }
        else{
            front = newNode;
            tail = newNode;
        }
    }

    public String dequeue(){

        if(!isEmpty()){
            String  returnValue = front.data;
            front = front.next;
            return returnValue;
        }
        throw new NullPointerException("the Stack is empty");
    }

    public String  peek(){
        if(!isEmpty()){
            return front.data;
        }
        else{
            throw new NullPointerException("the Stack is empty");
        }
    }

}

