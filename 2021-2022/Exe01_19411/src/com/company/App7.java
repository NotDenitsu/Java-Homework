package com.company;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();

            if(currentNumber > max){
                max = currentNumber;
            }
        }
        System.out.println(max);

    }
}
