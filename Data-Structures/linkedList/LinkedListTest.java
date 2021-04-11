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
        String expicted = "{5} -> {6} -> {9} -> NULL";
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
        String expicted = "{5} -> {6} -> {2} -> {4} -> {9} -> NULL";
        assertEquals("the output is", expicted, l.toString());

        LinkedList n = new LinkedList();
        n.insert(5);
        n.insert(6);
        n.insert(4);
        n.insert(9);
        n.addBefore(5, 2);
        String expicted1 = "{2} -> {5} -> {6} -> {4} -> {9} -> NULL";
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
        String expicted = "{5} -> {6} -> {2} -> {4} -> {9} -> NULL";
        assertEquals("the output is", expicted, l.toString());

        LinkedList n = new LinkedList();
        n.insert(5);
        n.insert(6);
        n.insert(4);
        n.insert(9);
        n.addAfter(9, 2);
        String expicted1 = "{5} -> {6} -> {4} -> {9} -> {2} -> NULL";
        assertEquals("the output is", expicted1, n.toString());
    }
    
}
