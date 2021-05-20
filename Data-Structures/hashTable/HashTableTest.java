package com.example.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    HashTable h = new HashTable(1024);
    @Test
    public void emptyHashTable() {
        String exp = "";
        assertEquals("Add successfully to Hashtable",exp, h.toString());
    }
    @Test
    public void addingToHashTable() {
        h.add("osama",10);
        String exp = "Key 10 Value osama \n";
        assertEquals("Add successfully to Hashtable",exp, h.toString());
    }

    @Test
    public void retrievingBasedOnKey() {
        h.add("osama",10);
        String exp = "osama";
        assertEquals("get value from Hashtable",exp, h.get(10));
    }
    @Test
    public void successfullyReturnsNull() {
        h.add("osama",10);
        String exp = null;
        assertEquals("get null from Hashtable",exp, h.getNode(11));
    }

     @Test
    public void successfullyHandleCollision () {
        h.add("osama",10);
        h.add("ahmad",11);
        String exp = "Key 11 Value ahmad \n" +
                "Key 10 Value osama \n";
        assertEquals("get value from Hashtable that repeated",exp, h.toString());
    }

    @Test
    public void successfullyRetrieveValue() {
        h.add("osama",10);
        h.add("ahmad",10);
        String exp = "ahmad";
        assertEquals("get value from Hashtable that repeated",exp, h.get(10));
    }
    @Test
    public void successfullyHashKey() {
        h.add("osama",10);
        int exp = 870;
        assertEquals("get value from Hashtable that repeated",exp, h.hash(10));
    }
}
