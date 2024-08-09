package com.java.grokking.twoPointer;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "I am practising Grokking patterns";
        str = str.trim();
        char[] output = new char[str.length()];

        // Reverse the full string
        for(int i=str.length() - 1, j=0; i>=0; i--, j++) {
            output[j] = str.charAt(i);
            System.out.print(output[j] + "");
        }

        // declare pointers
        int start = 0, end = 0;

        while(end < output.length - 1) {
            // traverse to find space
            while (output[end] != ' ') {
                end++;
            }

            // assign to startRev and endRev and swap the elements
            swap(output, start, end - 1);

            while (output[end] == ' ') {
                end++;
            }
            start = end;
        }

        System.out.println("\n");
        for (char c : output) {
            System.out.print(c);
        }
    }

    private static void swap(char[] output, int start, int end) {
        while(start < end) {
            char temp = output[start];
            output[start++] = output[end];
            output[end--] = temp;
        }
    }
}
