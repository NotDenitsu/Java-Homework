package com.company;

import java.util.Scanner;

public class App12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f0 = 1;
        int f1 = 1;
        int n = input.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int target = f0 + f1;
            f0 = f1;
            f1 = target;
        }
        System.out.println(f1);

    }
}
