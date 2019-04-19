package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        int inputNumber = 0;
        int result = 0;

        //Prompt user for input the number
        System.out.print("Enter the last number in the range: ");
        //Extract the last number in the range
        inputNumber = keyboard.nextInt();

        //Loop through all the numbers up until the range and print if prime or not
        for (i = 1; i <= inputNumber; i++) {

            //1 is not a prime number
            if (i == 1) {
                System.out.println("1 is not a prime number.");
            } else {
                result = check_prime(i);
                if(result == 0) {
                    System.out.printf("%d is not prime\n", i);
                } else {
                    System.out.printf("%d is a prime number\n", i);
                }
            }
        }
    }
    //Method check_prime which inputs a number and algorithm checks to see if prime or not
    //Input: integer number to check if prime or not
    //Output: 1 is not a prime number
    //        0 is a prime number
    public static int check_prime(int a) {
        int c;

        for (c = 2; c <= a - 1; c++) {
            if (a % c == 0)
                return 0;
        }
        if (c == a)
            return 1;
        else
            return 0;
    }
}