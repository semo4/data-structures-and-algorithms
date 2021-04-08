package Data-Structures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(9);
        System.out.println(l.toString());
        System.out.println(l.includes(5));
    }
}
