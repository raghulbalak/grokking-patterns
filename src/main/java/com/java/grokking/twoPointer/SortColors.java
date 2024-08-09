package com.java.grokking.twoPointer;

public class SortColors {
    public static void main(String[] args) {
        // initialize the array
        int[] colors = {0,2,0,0,2,1,1,2,1,0};

        // declare the pointers for the sorting
        int left = 0, current = 0, right = colors.length - 1;

        // iterate upto current greater than equal to rights
        while(current <= right) {
            if(colors[current] == 0) {
                swap(colors, left, current);
                left++; current++;
            } else if (colors[current] == 1) {
                current++;
            } else {
                swap(colors, current, right);
                right--;
            }
        }

        for (int color : colors) {
            System.out.print(color + " ");
        }


    }

    private static void swap(int[] colors, int pos1, int pos2) {
        int temp = colors[pos1];
        colors[pos1] = colors[pos2];
        colors[pos2] = temp;

    }
}
