package com.java.arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());

        if (day >= 1 && day <= 7) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
