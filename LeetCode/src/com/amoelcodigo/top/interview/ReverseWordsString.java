package com.amoelcodigo.top.interview;

/**
 * Problem 151
 */
public class ReverseWordsString {

    public String reverseWords(String s) {
        String[] reverse = s.split(" ");
        s = reverse[reverse.length-1];
        for (int i = reverse.length-2; i >= 0; i--) {
            if(reverse[i].length()>0)
               s = s + " " + reverse[i];
        }

        return s;
    }

    public static void main(String[] args) {
        ReverseWordsString reverseWordsString = new ReverseWordsString();

       // System.out.println(reverseWordsString.reverseWords("the sky is blue"));
        System.out.println(reverseWordsString.reverseWords("  hello world  "));
    }
}
