package Data-Structures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(6);
        l1.insert(3);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(7);
        l1.insert(4);

        System.out.println(l.zipLists(l1, l2));
    }
}
