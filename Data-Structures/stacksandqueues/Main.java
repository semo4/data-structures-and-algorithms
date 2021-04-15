package Data-Structures.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5);
        System.out.println(s.peek());
        s.push(4);
        System.out.println(s.peek());
        s.push(3);
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.toString());
        System.out.println(s.peek());

        Queue q = new Queue();

        q.enqueue(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(5);
        System.out.println(q.toString());
    }
}

