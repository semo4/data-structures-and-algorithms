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
    
}
