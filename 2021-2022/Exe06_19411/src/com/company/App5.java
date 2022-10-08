package com.company;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int firstNum = (n / 100);
        int secondNum = (((n - (100 * (n / 100))) / 10));
        int thirdNum = (n % 10);
        int N = firstNum + secondNum;
        int M = firstNum + thirdNum;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(n % 5 == 0){
                    n -= firstNum;
                    System.out.print(n + " ");
                } else if (n % 3 == 0){
                    n -= secondNum;
                    System.out.print(n + " ");
                } else {
                    n += thirdNum;
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
