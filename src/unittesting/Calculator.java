package unittesting;

public class Calculator {

    /**
     * to do the summation of two numbers
     *
     * @param number1
     * @param number2
     * @return Author : Maria
     */


    public static int doSum(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total Value is " + total);
        return total;
    }

    /**
     * This Method describes the subtraction of 2 values
     *
     * @param number1
     * @param number2
     * @return Author: maria
     */
    public static int doSub(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        System.out.println("The subtraction of two values  " + (num1 - num2));
        return num1 - num2;
    }

    /**
     * @param number1
     * @param number2
     * @return Author:Maria
     */
    public static double doMultiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Author maria
     */


}

