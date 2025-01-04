package com.amoelcodigo.top.interview;

import java.util.Arrays;

/**
 * Problem 58
 */
public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String words[] = new String[]{};
        int lastWordLength = 0;
        words = s.split(" ");
        for (String w : words
        ) {
            lastWordLength = w.length();
        }

        return lastWordLength;
    }

    public static void main(String[] args) {
        LengthLastWord lengthLastWord = new LengthLastWord();
        System.out.println(lengthLastWord.lengthOfLastWord("Hello World"));
    }
}
