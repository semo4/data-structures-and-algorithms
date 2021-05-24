package com.example.hashtable;

public class RepeatedWord {

    public static String repeated(String word){
        String [] words = word.toLowerCase().replace(",","").split(" ");
        HashTable h = new HashTable(words.length);
        for (int i = 0; i < words.length; i++) {
            if(h.contains(words[i])){
                return words[i];
            }else{
                h.add(words[i], words[i]);
            }
        }
        return null;
    }
}
