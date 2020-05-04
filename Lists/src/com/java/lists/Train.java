package com.java.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(sc.nextLine());
        List<Integer> newWagons = manipulateList(wagons, capacity);
        printWagons(newWagons);
    }

    public static void printWagons(List<Integer> wagons) {
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i) + " ");
        }
    }

    public static List<Integer> manipulateList(List<Integer> list, Integer cap) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = list;

        while(true) {
            String line = sc.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split(" ");
            if (tokens[0].equals("Add")) {
                wagons.add(Integer.parseInt(tokens[1]));
            } else {
                int value = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int newValue = wagons.get(i) + value;
                    if (newValue <= cap) {
                        wagons.set(i, newValue);
                        break;
                    }
                }
            }
        }

        return wagons;
    }
}
