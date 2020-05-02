package com.java.methods;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        int[] inputs = readNumbersFromConsole(3);
        int max = getMinNumber(inputs);

        System.out.println(max);
    }

    public static int[] readNumbersFromConsole(int n) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[n];

        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(sc.nextLine());
        }

        return inputs;
    }

    public static int getMinNumber(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
}
