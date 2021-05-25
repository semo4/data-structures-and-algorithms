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


        HashMap<String, String> tableOne = new HashMap<String, String>();
        HashMap<String, String> tableTwo = new HashMap<String, String>();

        tableOne.put("wrath","anger");
        tableOne.put("diligent","employed");
        tableOne.put("outfit","garb");
        tableOne.put("guide","usher");
        tableOne.put("fond","enamored");

        tableTwo.put("wrath","delight");
        tableTwo.put("diligent","idle");
        tableTwo.put("guide","follow");
        tableTwo.put("flow","jam");
        tableTwo.put("fond","averse");
        LeftJoin l = new LeftJoin();
        String [][] res = l.leftJoin(tableOne,tableTwo);

        System.out.println(Arrays.asList(res[0]));


    }
}
