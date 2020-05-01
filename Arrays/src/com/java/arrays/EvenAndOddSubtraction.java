package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int even = Arrays.stream(numbers).filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        int odd = Arrays.stream(numbers).filter(x -> x % 2 != 0).reduce(0, (a, b) -> a + b);

        System.out.println(even - odd);
    }
}
