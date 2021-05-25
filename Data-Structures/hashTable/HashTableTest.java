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
//    @Test
//    public void successfullyReturnsNull() {
//        h.add("osama",10);
//        String exp = null;
//        assertEquals("get null from Hashtable",exp, h.getNode(11));
//    }

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


    @Test
    public void returnEmpty() {
        String text = "";
        assertEquals("Return Empty String","", RepeatedWord.repeated(text));
    }

    @Test
    public void returnA() {
        String text = "Once upon a time, there was a brave princess who...";
        assertEquals("Return a","a", RepeatedWord.repeated(text));
    }

    @Test
    public void returnIt() {
        String text = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("Return it","it", RepeatedWord.repeated(text));
    }

    @Test
    public void returnWas() {
        String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("Return was","summer",RepeatedWord.repeated(text));
    }





       @Test
    public void returnEqualLeftJoin() {
        HashMap<String, String> tableOne = new HashMap<String, String>();
        HashMap<String, String> tableTwo = new HashMap<String, String>();

        tableOne.put("fond","enamored");
        tableOne.put("wrath","anger");
        tableOne.put("diligent","employed");
        tableOne.put("outfit","garb");
        tableOne.put("guide","usher");

        tableTwo.put("fond","averse");
        tableTwo.put("wrath","delight");
        tableTwo.put("diligent","idle");
        tableTwo.put("guide","follow");
        tableTwo.put("flow","jam");

        LeftJoin l = new LeftJoin();
        String [][] res = l.leftJoin(tableOne,tableTwo);
        ArrayList exp = new ArrayList();
        exp.add("diligent");
        exp.add("employed");
        exp.add("idle");

        assertEquals("Return the first value ",exp, Arrays.asList(res[0]));
    }

    @Test
    public void returnEmptyLeftJoin() {
        HashMap<String, String> tableOne = new HashMap<String, String>();
        HashMap<String, String> tableTwo = new HashMap<String, String>();
        LeftJoin l = new LeftJoin();
        String [][] res = l.leftJoin(tableOne,tableTwo);
        assertNull("Return null", res);
    }

    @Test
    public void returnOneValueLeftJoin() {
        HashMap<String, String> tableOne = new HashMap<String, String>();
        HashMap<String, String> tableTwo = new HashMap<String, String>();
        tableOne.put("wrath1","anger");
        tableOne.put("diligent1","employed");
        tableOne.put("outfit1","garb");
        tableOne.put("guide1","usher");
        tableOne.put("fond","enamored");

        tableTwo.put("wrath","delight");
        tableTwo.put("diligent","idle");
        tableTwo.put("guide","follow");
        tableTwo.put("flow","jam");
        tableTwo.put("fond","averse");

        LeftJoin l = new LeftJoin();
        String [][] res = l.leftJoin(tableOne,tableTwo);
        ArrayList exp = new ArrayList();
        exp.add("fond");
        exp.add("enamored");
        exp.add("averse");

        assertEquals("Return the first value ",exp, Arrays.asList(res[4]));
    }
}
