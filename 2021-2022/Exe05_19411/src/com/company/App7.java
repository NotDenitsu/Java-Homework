package com.company;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        while(b != 0){
            int tempB = b;
            b = a % b;
            a = tempB;
        }

        System.out.println("GCD = " + a);
    }
}
