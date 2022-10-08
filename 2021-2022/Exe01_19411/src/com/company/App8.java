package com.company;

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();

            if(currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.println(min);

    }
}
