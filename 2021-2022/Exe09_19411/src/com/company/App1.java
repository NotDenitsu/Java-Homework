package com.company;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        String[] decimals = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " => " + ((int) Math.round(Double.parseDouble(decimals[i]))));
        }
    }
}