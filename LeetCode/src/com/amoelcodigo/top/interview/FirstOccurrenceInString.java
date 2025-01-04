package com.amoelcodigo.top.interview;

public class FirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccurrenceInString firstOccurrenceInString = new FirstOccurrenceInString();


        System.out.println("firstOccurrenceInString.strStr() = "
                + firstOccurrenceInString.strStr("hello", "ll"));
        System.out.println("firstOccurrenceInString.strStr() = "
                + firstOccurrenceInString.strStr("sadbutsad", "sad"));
        System.out.println("firstOccurrenceInString.strStr() = "
                + firstOccurrenceInString.strStr("leetcode", "leeto"));
    }
}
