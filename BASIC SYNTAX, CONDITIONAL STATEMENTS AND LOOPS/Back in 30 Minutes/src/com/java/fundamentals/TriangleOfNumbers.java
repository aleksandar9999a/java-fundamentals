package com.java.fundamentals;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            String line = Integer.toString(i).repeat(i);
            System.out.println(line);
        }
    }
}
