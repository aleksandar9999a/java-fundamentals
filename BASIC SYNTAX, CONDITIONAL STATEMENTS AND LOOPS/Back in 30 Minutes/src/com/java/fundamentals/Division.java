package com.java.fundamentals;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int theBiggestDivisibleNumber = 0;

        if (input % 10 == 0) theBiggestDivisibleNumber = 10;
        else if (input % 7 == 0) theBiggestDivisibleNumber = 7;
        else if (input % 6 == 0) theBiggestDivisibleNumber = 6;
        else if (input % 3 == 0) theBiggestDivisibleNumber = 3;
        else if (input % 2 == 0) theBiggestDivisibleNumber = 2;

        if (theBiggestDivisibleNumber != 0) {
            System.out.println("The number is divisible by " + theBiggestDivisibleNumber);
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
