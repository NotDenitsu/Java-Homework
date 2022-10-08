package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] myARR = new int[n];

        for (int i = 0; i < myARR.length; i++) {
            myARR[i] = input.nextInt();
        }

        for (int i = myARR.length - 1; i >= 0; i--) {
            System.out.print((i == 0) ? myARR[i] : myARR[i] + ",");
        }

    }
}