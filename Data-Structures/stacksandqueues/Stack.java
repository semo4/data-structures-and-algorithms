package Data-Structures.stacksandqueues;

public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (!isEmpty()) {
            int returnValue = top.data;
            top = top.next;
            return returnValue;
        }
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            return -1;
        }

    }

}
