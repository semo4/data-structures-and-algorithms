package com.example.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable h = new HashTable(1024);

        h.add("osama",10);


        System.out.println(h.toString());
        System.out.println(h.get(60));
        System.out.println(h.contains(60));
        System.out.println(h.hash(10));

    }
}
