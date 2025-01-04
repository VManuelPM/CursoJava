package com.amoelcodigo.top.interview;

/**
 * Problem 125
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean f = false;
        char[] charArray = s.replaceAll("[^a-zA-Z0-9]+", "")
                .toCharArray();

        System.out.println(s);
        for (int i = 0, j=charArray.length-1; i < charArray.length/2 ; i++) {
            if(String.valueOf(charArray[i]).equalsIgnoreCase(String.valueOf(charArray[j]))){
                f = true;
            }else{
                f = false;
            }
            j--;
        }

        if(charArray.length==0 || charArray.length==1){
            f = true;
        }

        return f;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
      //  validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
       // validPalindrome.isPalindrome("race a car");
        //validPalindrome.isPalindrome(" ");
    //    validPalindrome.isPalindrome(",; W;:GlG:;l ;,");
    }
}
