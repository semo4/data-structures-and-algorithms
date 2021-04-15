package Data-Structures.stacksandqueues;

public class Queue {
    private Node front;
    private Node tail;

    public Queue() {
        front = tail = null;

    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (!isEmpty()) {
            tail.next = newNode;
            tail = tail.next;
        } else {
            front = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        int returnValue = -1;
        if (!isEmpty()) {
            returnValue = front.data;
            front = front.next;
            return returnValue;
        }
        return returnValue;
    }

    public int peek() {
        if (!isEmpty()) {
            return front.data;
        } else {
            return -1;
        }
    }

}
