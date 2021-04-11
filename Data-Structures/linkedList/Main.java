package Data-Structures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(9);

        l.append(8);
        l.addBefore(6, 1);
        System.out.println(l.toString());
        l.addAfter(10, 0);
    }
}
