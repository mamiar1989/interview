package datastructureandalgoritheme.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArraylistMoreExamples {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
// USE add all method to add all this element to my array list
        // group 2 arraylists


        al.add("X");
        al.add("B");
        al.add("D");
        al.add("A");
        al.add("C");
        al.add("Y");

        ArrayList al_duplicate = new ArrayList<>();
        al_duplicate.addAll(al);
        System.out.println(al_duplicate);
        al_duplicate.removeAll(al);
        System.out.println(al_duplicate);

        //***********************Sort an arrayList
        // Sort .......... Collection.sort()

        System.out.println(al);
        Collections.sort(al);//  [A, B, C, D, X, Y]
        // elements in the arrayList After Sorting
        System.out.println(al);
        // sort in the reverse or decending order
        Collections.sort((al), Collections.reverseOrder());//[Y, X, D, C, B, A]
        System.out.println(al);
        Collections.shuffle(al);// [C, B, A, X, D, Y]
        System.out.println(al);


        String arr[] = {"cat", "dog", "elephant",};
        for (
                String value : arr) {
            System.out.println(value); // this loop will read the values fron array

            ArrayList alllll = new ArrayList(Arrays.asList(arr));
            System.out.println(alllll);

        }
    }

}

