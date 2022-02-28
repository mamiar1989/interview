package datastructureandalgoritheme.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsPavan {


    public static void main(String[] args) {

        //approach 1

        int a[] = {30, 50, 20, 10, 60};
        for (int aa : a) {
            System.out.println(aa);
        }

        System.out.println("Array elements before sorting" + Arrays.toString(a));

        // Parallel Sort
        Arrays.parallelSort(a);
        System.out.println("Array elements after sorting" + Arrays.toString(a));
        Arrays.parallelSort(a);
        // Sort in descending order

        Integer arr1[] = {100, 200, 300, 400};
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        // descending order
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));


        //******************************************************************************************

        Integer abc[] = {8, 6, 7, 8, 3, 9, 8,};
        System.out.println(Arrays.toString(abc));
        Arrays.parallelSort(abc);
        System.out.print(Arrays.toString(abc));

//***********************************************************************************************

//descending order
        // In this case our int we have to change it to the class Integer to use it for reverse order


        Arrays.sort(abc,Collections.reverseOrder());


    }

}