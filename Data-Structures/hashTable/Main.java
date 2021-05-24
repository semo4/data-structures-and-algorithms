package com.example.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable h = new HashTable();

        h.add("osama","10");
        h.add("ahmad","11");
        h.add("osama","15");


//        System.out.println(h.toString());
//        System.out.println(h.contains("osama"));

        String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        RepeatedWord r = new RepeatedWord();
        System.out.println(r.repeated(text));


    }
}
