package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");

        if (scanner.hasNextLong()) {
            String str = scanner.next();
            descendingOrder(str);
        } else
            System.out.println("Wrong data");
    }

    public static void descendingOrder(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        Arrays.sort(arr);
        System.out.println("Number with descending order of digits:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }

}
