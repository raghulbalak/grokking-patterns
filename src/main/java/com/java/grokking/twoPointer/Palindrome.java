package com.java.grokking.twoPointer;

public class Palindrome {
    public static void main(String[] args) {
        String str = "teset";

        if(str.length() < 2) {
            System.out.println("Input is not a valid string");
        }

        int low = 0;
        int high = str.length() - 1;
        boolean flag = true;

        while(low < high) {
            if(str.charAt(low) != str.charAt(high)) {
                flag = false;
                break;
            }
            low++; high--;
        }
        if(flag) {
            System.out.println("Input is a palindrome");
        } else {
            System.out.println("Input is not a palindrome");
        }
    }
}
