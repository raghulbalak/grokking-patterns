package com.java.grokking.twoPointer;

public class ValidTwoStringAbbrevation {
    public static void main(String[] args) {
        String word = "test";
        String abbrevation = "1e1t";

        // Declare two pointer in word and abbrevation
        int wp = 0;
        int ap = 0;
        boolean flag = true;
        boolean cont = false;

        // loop until the end of abbreviation is reached
        while(abbrevation.length() > ap) {
            if(abbrevation.charAt(ap) == 48 || cont) {
                flag = false;
                break;
            }
            if(abbrevation.charAt(ap) > 48 && abbrevation.charAt(ap) < 58) {

                wp += abbrevation.charAt(ap) - '0' - 1;
                cont = true;
            } else if(word.charAt(wp) != abbrevation.charAt(ap)) {
                flag = false;
                cont = false;
                break;
            }
            ap++;
            wp++;
        }

        if(flag) {
            System.out.println("Valid two string abbreviation");
        } else {
            System.out.println("Not a valid two string abbreviation");
        }
    }
}
