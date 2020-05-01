package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrOfStrings = sc.nextLine().split(" ");
        Collections.reverse(Arrays.asList(arrOfStrings));
        System.out.println(String.join(" ", arrOfStrings));
    }
}
