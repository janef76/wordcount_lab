package com.codeclan.word_count.wordcount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by miguelmorenobaladron and janeflucker on 3/19/18.
 */

public class WordCount {
//    ArrayList<String> inputText;
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    Map<String, Integer> tmap = new TreeMap<String, Integer>(hmap);
//    public WordCount(){
//        this.inputText = new ArrayList<>();
//    }

    public WordCount(){
        this.hmap = new HashMap<>();
    }

//    public int getWordCount(String input) {
//        String text[] = input.split("([\\W\\s]+)");
//        return text.length;
//    }

    public HashMap getHashWordCount(String input) {
        String text[] = input.split("([\\W\\s]+)");
        for (int i=0; i<text.length ; i++) {
            if (hmap.containsKey(text[i])) {
                int cont = hmap.get(text[i]);
                hmap.put(text[i], cont + 1);
            } else {
                hmap.put(text[i], 1);
            }
        }
        return hmap;


    }
}
