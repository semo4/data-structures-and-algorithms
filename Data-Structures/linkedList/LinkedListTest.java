package Data-Structures.linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testEmpty() {
        LinkedList l = new LinkedList();
        assertTrue("the linkedList is empty", l.isEmpty());
    }

   @Test
    public void testInsert() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(9);
        String expicted = "{9} -> {6} -> {5} -> NULL";
        assertEquals("the output is", expicted, l.toString());
    }

    @Test
    public void testIncludes() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(9);
        assertTrue("the output is", l.includes(5));
    }

    @Test
    public void testAppend() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.append(10);
        String expicted = "{5} -> {10} -> NULL";
        assertEquals("the output is", expicted, l.toString());

        LinkedList n = new LinkedList();
        n.insert(5);
        n.append(11);
        n.append(12);
        String expicted1 = "{5} -> {11} -> {12} -> NULL";
        assertEquals("the output is", expicted1, n.toString());
    }

    @Test
    public void testAddBefore() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        l.addBefore(4, 2);
        String expicted = "{9} -> {2} -> {4} -> {6} -> {5} -> NULL";
        assertEquals("the output is", expicted, l.toString());

        LinkedList n = new LinkedList();
        n.insert(5);
        n.insert(6);
        n.insert(4);
        n.insert(9);
        n.addBefore(9, 2);
        String expicted1 = "{2} -> {9} -> {4} -> {6} -> {5} -> NULL";
        assertEquals("the output is", expicted1, n.toString());
    }

    @Test
    public void testAddAfter() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        l.addAfter(6, 2);
        String expicted = "{9} -> {4} -> {2} -> {6} -> {5} -> NULL";
        assertEquals("the output is", expicted, l.toString());

        LinkedList n = new LinkedList();
        n.insert(5);
        n.insert(6);
        n.insert(4);
        n.insert(9);
        n.addAfter(9, 2);
        String expicted1 = "{9} -> {4} -> {6} -> {5} -> {2} -> NULL";
        assertEquals("the output is", expicted1, n.toString());
    }

    @Test
    public void testIndexNode() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        int expicted = 4;
        int result = l.indexNode(2);
        assertEquals("the output is", expicted, result);
    }

    @Test(expected = NullPointerException.class)
    public void testIndexNodeGrater() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        int result = l.indexNode(6);

    }

    @Test
    public void testIndexNodeLast() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        int expicted = 9;
        int result = l.indexNode(3);
        assertEquals("the output is", expicted, result);
    }

    @Test(expected = NullPointerException.class)
    public void testIndexNodeNegative() {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(4);
        l.insert(9);
        int result = l.indexNode(-2);
    }

    @Test
    public void testIndexNodeOne() {
        LinkedList l = new LinkedList();
        l.insert(5);
        int result = l.indexNode(0);
        int expicted = 5;
        assertEquals("the output is", expicted, result);
    }

    @Test
    public void testZipLinkedList() {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(6);
        l1.insert(4);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(7);

        String out = "{5} -> {5} -> {6} -> {7} -> {4} -> NULL";
        assertEquals("the output is", out, l.zipLists(l1, l2).toString());
    }

    @Test
    public void testZipLinkedListTwo() {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(6);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(7);
        l1.insert(4);

        String out = "{5} -> {5} -> {6} -> {7} -> {4} -> NULL";
        assertEquals("the output is", out, l.zipLists(l1, l2).toString());
    }

    @Test
    public void testZipLinkedListThree() {
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(6);
        l1.insert(3);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(7);
        l1.insert(4);

        String out = "{5} -> {5} -> {6} -> {7} -> {3} -> {4} -> NULL";
        assertEquals("the output is", out, l.zipLists(l1, l2).toString());
    }
}
