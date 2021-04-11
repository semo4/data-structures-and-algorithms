package Data-Structures.linkedList;

public class LinkedList {

    private Node h;

    public LinkedList() {
        h = null;
    }

    public boolean isEmpty() {
        return h == null;
    }

    public String toString() {
        String msg = "";
        if (isEmpty()) {
            return null;
        } else {
            Node k = h;
            while (k != null) {
                msg = msg + "{" + k.data + "}" + " -> ";
                k = k.next;
            }
            msg = msg + "NULL";
            return msg;
        }
    }

    public void insert(int d) {
        if (isEmpty()) {
            Node y = new Node(d);
            y.next = h;
            h = y;
        } else {
            Node k = h;
            while (k.next != null) {
                k = k.next;
                ;
            }
            k.next = new Node(d);
        }
    }

    public boolean includes(int d) {
        if (isEmpty()) {
            return false;
        } else {
            Node k = h;
            while (k.next != null) {
                if (k.data == d) {
                    return true;
                }
                k = k.next;
            }
            return false;
        }
    }
    
    public void append(int value) {
        if (isEmpty()) {
            Node y = new Node(value);
            y.next = h;
            h = y;
        } else {
            Node k = h;
            while (k.next != null) {
                k = k.next;
            }
            k.next = new Node(value);
        }
    }

    public void addBefore(int value, int newValue) {
        if (!includes(value)) {
            System.out.println("the value " + value + "Does not Exist");
            throw new NullPointerException("the value Does not Exist");
        } else {
            Node k = h;
            if (k.data == value) {
                Node y = new Node(newValue);
                y.next = k;
                h = y;
            } else {
                while (k.next.data != value) {
                    k = k.next;
                }
                Node y = new Node(newValue);
                y.next = k.next;
                k.next = y;
            }

        }

    }

    public void addAfter(int value, int newValue) {
        if (!includes(value)) {
            // System.out.println("the value "+ value+ " Does not Exist");
            throw new NullPointerException("the value Does not Exist");
        } else {
            Node k = h;
            if (k.data == value) {
                Node y = new Node(newValue);
                y.next = k;
                h = y;
            } else {
                while (k.data != value) {
                    k = k.next;
                }
                Node y = new Node(newValue);
                Node j = k.next;
                k.next = y;
                y.next = j;
            }
        }
    }

}
