package datastructureandalgoritheme.sort;

import java.util.Arrays;
import java.util.Collections;

public class LearnReverseOrder {


    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/sorting-in-java/
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}

