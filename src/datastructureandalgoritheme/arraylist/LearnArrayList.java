package datastructureandalgoritheme.arraylist;

import basic.MainMethod;
import dataReader.LearnDataReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class LearnArrayList {
    // ArrayList is DYNAMIC Array
    // array limitation you can not adda values , if u already assigned a value , if you set a value which is higher than you need
    // you are wasting your memory

    // Arraylist , is a dynamic array that can take more values if needed in the future , //
    // Arraylist will increase the size of your software according to your needs
    // no need to declare array size / Dynamic array
    // Arraylist is a class that extends abstract list and implement list type of interface .........
    // <> diamond braces
    // OBJECT CREATION of array list , this type of array is
    // interview question , what is a raper class ?
    // the array list permit the index insertion
    //Array list can store value and elements
    // array list can assign duplicate values
    //we can have any number og null value in array list
    // array list get method is used to get the values of the Arraylist
    // we can add and remove values from the array list with the  . add and . remove values

    // Arraylist type

    ArrayList<String> studentAddress = new ArrayList<String>();  // Arraylist allows incertion order
    // Arraylist can contain duplicate values
    ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
    ArrayList<Integer> studentMobileNumber = new ArrayList<Integer>();  // integer is a rapper class
    ArrayList<Integer> classNumber = new ArrayList<>();


    public static void main(String[] args) {


        LearnArrayList learn = new LearnArrayList();

        learn.classNumber.add(0);
        learn.classNumber.add(1);
        learn.classNumber.add(2);
        learn.classNumber.add(3);
        learn.classNumber.add(4);
        learn.classNumber.add(5);
        learn.classNumber.add(6);
        learn.classNumber.add(7);


        System.out.println(learn.classNumber.get(2));
        System.out.println(learn.classNumber.size());
        System.out.println(learn.classNumber.get(5));
        System.out.println(learn.classNumber.set(2, 6));  // replace the index with the number 6


        learn.studentAddress.add("New York");
        learn.studentAddress.add("New Jersy");
        learn.studentAddress.add("Pensylvania");
        learn.studentAddress.add("verginia");
        learn.studentAddress.add("chicago");

        System.out.println(learn.studentAddress.get(1));
        System.out.println(learn.studentAddress.get(2));
        System.out.println(learn.studentAddress.get(3));
        System.out.println(learn.studentAddress.get(4));
        System.out.println(learn.phoneNumber.size());  // when we come to ArrayLsit we dont use length we use size
        learn.phoneNumber.add(52);
        learn.phoneNumber.remove(0);


        System.out.println("*************************PhoneNumber*************************************************");

        learn.phoneNumber.add(23);
        learn.phoneNumber.add(56);
        learn.phoneNumber.add(63);
        learn.phoneNumber.add(89);
        learn.phoneNumber.add(11);
        learn.phoneNumber.add(36);
        learn.phoneNumber.add(78);
        System.out.println(learn.phoneNumber.get(1));
        System.out.println(learn.phoneNumber.get(2));
        System.out.println(learn.phoneNumber.get(3));
        System.out.println(learn.phoneNumber.get(4));
        System.out.println("remove : " + learn.phoneNumber.remove(3));
        System.out.println("sorting********************************************************************************");


        System.out.println(" this to get the length of the array " + learn.phoneNumber.size());


        System.out.println("********************************CardName************************************");

        ArrayList<String> cardName = new ArrayList<String>();
        cardName.add("id");
        cardName.add("bus");
        cardName.add("credit");
        cardName.add("debit");
        cardName.add("membership");
        System.out.println(cardName.get(2));
        System.out.println(cardName.get(4));
        System.out.println(cardName.get(1));
        System.out.println(cardName.remove(2));
        System.out.println(cardName.size());

        try {
            System.out.println(cardName.get(6));

        } catch (Exception exception) {
            // exception.printStackTrace();
        } finally {
            System.out.println("This is a an IndexOutOfBoundException");
        }


        System.out.println("*************************Names********************************************************");

        String[] name = new String[20];
        System.out.println(name.length);
        name[0] = "Brad";
        name[1] = "Jhon";
        name[2] = "Jack";
        name[3] = "James";
        name[4] = "Joe";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        for (String st : name) {
            System.out.println(st);


            ArrayList<Short> St = new ArrayList<Short>();
            ArrayList<Integer> In = new ArrayList<Integer>();
            ArrayList<Byte> Bt = new ArrayList<Byte>();
            ArrayList<Short> bt = new ArrayList<Short>();
            ArrayList<Double> DB = new ArrayList<Double>();
            ArrayList<Boolean> Bo = new ArrayList<Boolean>();

            // wrapper class class
            //Integer :int
            // Byte: byte
            //Short : short
            //Double : double
            // Boolean : boolean

            // HOW TO retrieve all the values from the ArrayList

            for (String Nt : cardName) {
                System.out.println(Nt);
            }


        }

        ArrayList<String> computerName = new ArrayList<>();
        computerName.add("Dell");
        computerName.add("Mac");
        computerName.add("Windows");
        computerName.add("ChromeBook ");
        System.out.println(computerName.size());
        for (String cn : computerName) {
            System.out.println(cn);

        }
        System.out.println("*******************al arraylist ");

        ArrayList al = new ArrayList();
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add(true);

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.remove("welcome"));
        System.out.println(al);
        al.add(2, "Amelia");
        System.out.println("*********************AfterInsertion******************");
        System.out.println(al);
        System.out.println(al.get(2));
        al.set(2, "amel");// replace the value with  amel index 2 with amel
        System.out.println(al);
        System.out.println(al.contains("amel"));// return boolean true or false  // contains
        System.out.println(al.isEmpty());

// Read elements using for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

//Read elements using  for each loop

        for (Object al1 : al) {
            System.out.println(al1);

        }
//Iterator


        Iterator it = al.iterator();
        while (it.hasNext()) {  // print element then move to the next element
            System.out.println(it.next());
        }

    }
}