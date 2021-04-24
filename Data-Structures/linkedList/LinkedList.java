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
            Node pointer = h;
            while (pointer != null) {
                msg = msg + "{" + pointer.data + "}" + " -> ";
                pointer = pointer.next;
            }
            msg = msg + "NULL";
            return msg;
        }
    }

    public void insert(int d) {
        Node newNode = new Node(d);
        if (isEmpty()) {
            newNode.next = h;
            h = newNode;
        } else {
            newNode.next = h;
            h = newNode;
        }
    }

    public boolean includes(int d) {
        if (isEmpty()) {
            return false;
        } else {
            Node pointer = h;
            while (pointer != null) {
                if (pointer.data == d) {
                    return true;
                }
                pointer = pointer.next;
            }
            return false;
        }
    }

    public void append(int value) {
        if (isEmpty()) {
            Node newNode = new Node(value);
            newNode.next = h;
            h = newNode;
        } else {
            Node pointer = h;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node(value);
        }
    }

    public void addBefore(int value, int newValue) {
        if (!includes(value)) {
            System.out.println("the value " + value + "Does not Exist");
            throw new NullPointerException("the value Does not Exist");
        } else {
            Node pointer = h;
            if (pointer.data == value) {
                Node newNode = new Node(newValue);
                newNode.next = pointer;
                h = newNode;
            } else {
                while (pointer.next.data != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(newValue);
                newNode.next = pointer.next;
                pointer.next = newNode;
            }

        }

    }

    public void addAfter(int value, int newValue) {
        if (!includes(value)) {
            throw new NullPointerException("the value Does not Exist");
        } else {
            Node pointer = h;
            if (pointer.data == value) {
                Node newNode = new Node(newValue);
                newNode.next = pointer;
                h = newNode;
            } else {
                while (pointer.data != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(newValue);
                Node pointerTwo = pointer.next;
                pointer.next = newNode;
                newNode.next = pointerTwo;
            }
        }
    }

    public int kthValue(int k) {
        Node current = h;
        Node pointer = h;

        if (isEmpty() || k < 0) {
            throw new NullPointerException("The value out of length");
        }
        for (int i = 0; i < k; i++) {
            try {
                pointer = pointer.next;
            } catch (NullPointerException th) {
                throw new NullPointerException("The value out of length");
            }

        }
        while (pointer.next != null) {
            pointer = pointer.next;
            current = current.next;
        }
        return current.data;
    }

    public LinkedList zipLists(LinkedList l1, LinkedList l2) {
        if (l1.isEmpty()) {
            return l2;
        } else if (l2.isEmpty()) {
            return l1;
        } else {
            Node pointer = l1.h;
            Node pointerTwo = pointer.next;
            Node pointerthree = l2.h;

            while (pointerTwo != null && pointerthree != null) {
                pointer.next = pointerthree;
                l2.h = pointerthree.next;
                pointerthree.next = pointerTwo;
                pointer = pointerTwo;
                pointerTwo = pointer.next;
                pointerthree = l2.h;
            }
            // pointer.next = j;
            return l1;
        }
    }

    public LinkedList reverseLinkedlist(LinkedList l) {
        LinkedList newl = new LinkedList();
        Node pointer = l.h;
        while (pointer != null) {
            Node newNode = new Node(pointer.data);
            if (newl.isEmpty()) {
                newl.h = newNode;

            } else {
                newNode.next = newl.h;
                newl.h = newNode;
            }
            pointer = pointer.next;
        }
        return newl;
    }

}
