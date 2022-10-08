package com.company;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        int n = input.nextInt();
        double p1 = 0,p2 = 0,p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = input.nextInt();

            if(number % 2 == 0){
                p1++;
            }
            if (number % 3 == 0){
                p2++;
            }
            if (number % 4 == 0){
                p3++;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;


        System.out.printf("%.2f %% \n%.2f %% \n%.2f %% \n",p1,p2,p3);

    }
}
