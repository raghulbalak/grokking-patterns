package com.java.grokking.twoPointer;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = new int[] {1,2,3,4,5,6,7};
        int target = 5;
        int sum = 0;

        // sort the array
        Arrays.sort(input);

        // iterate the full loop upto input.length() - 2
        outerLoop:
        for(int i=0; i<input.length - 2; i++) {
            int low = i+1;
            int high = input.length - 1;
            sum = 0;
            while(low < high) {
                sum = input[i] + input[low] + input[high];
                System.out.println("sum " + sum + " low " + low + " high " + high);
                if(sum == target) {
                    System.out.println("indexes are " + i + " " + low + " " + high);
                    break outerLoop;
                } else if (sum > target) {
                    System.out.println("high value decremented");
                    high--;
                } else {
                    System.out.println("low value incremented");
                    low++;
                }
            }
        }
    }
}
