package Data-Structures.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestCase {
    @Test
    public void testPushOneValue() {
        Stack s = new Stack();
        s.push(5);
        assertEquals("the outout", 5, s.peek());
    }

    @Test
    public void testPushMultiValue() {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);
        assertEquals("the outout", 3, s.peek());
    }

    @Test
    public void testPopValue() {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);
        assertEquals("the outout", 3, s.pop());
    }

    @Test
    public void testEmptyAfterPopValue() {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();
        assertTrue("the outout", s.isEmpty());
    }

    @Test
    public void testPeek() {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);
        assertEquals("the outout", 3, s.peek());
    }

    @Test
    public void testEmpty() {
        Stack s = new Stack();
        assertTrue("the outout", s.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testPopEmptyStack() {
        Stack s = new Stack();
        assertEquals(new NullPointerException(), s.pop());
    }

    @Test(expected = NullPointerException.class)
    public void testPeekEmptyStack() {
        Stack s = new Stack();
        assertEquals(new NullPointerException(), s.peek());
    }

    @Test
    public void testEnqueueOneValue() {
        Queue q = new Queue();
        q.enqueue(5);
        assertEquals("the outout", 5, q.peek());
    }

    @Test
    public void testEnqueueMultiValue() {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        assertEquals("the outout", 5, q.peek());
    }

    @Test
    public void testDequeueValue() {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        assertEquals("the outout", 5, q.dequeue());
    }

    @Test
    public void testPeekQueue() {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        assertEquals("the outout", 5, q.peek());
    }

    @Test
    public void testEmptyAfterDequeueValue() {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        assertTrue("the outout", q.isEmpty());
    }

    @Test
    public void testEmptyQueue() {
        Queue q = new Queue();
        assertTrue("the outout", q.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testDequeueEmptyQueue() {
        Queue q = new Queue();
        assertEquals(new NullPointerException(), q.dequeue());
    }

    @Test(expected = NullPointerException.class)
    public void testPeekEmptyQueue() {
        Queue q = new Queue();
        assertEquals(new NullPointerException(), q.peek());
    }
}
