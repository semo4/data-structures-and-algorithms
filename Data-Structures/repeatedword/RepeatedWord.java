package com.example.repeatedword;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class RepeatedWord {
    public static void main(String[] args) {

        String text = "Once upon a time, there was a brave princess who...";
        //String text = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        //String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        System.out.println(getWord(text));
    }

    public static String getWord(String text){
        String [] words = text.toLowerCase().split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if(words[i].equals(words[j]) && i !=j){
                    res =  words[i];
                    return res;
                }

            }
        }
        return "";
    }
}
