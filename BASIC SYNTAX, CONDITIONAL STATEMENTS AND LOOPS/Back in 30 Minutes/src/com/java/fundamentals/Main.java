package com.java.fundamentals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        min += 30;

        if(min >= 60) {
            hour++;
            min -= 60;
        }

        if(hour == 24) {
            hour = 0;
        }

        if(hour > 24) {
            hour -= 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
