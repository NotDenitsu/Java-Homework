package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heritage = input.nextDouble();
        int yearToLive = input.nextInt();
        int ageOfIvancho = 18;

        for (int i = 1800; i <= yearToLive; i++) {
            if(i % 2 == 0){
                heritage -= 12000;
            } else {
                heritage -= 12000 + 50 * ageOfIvancho;
            }
            ageOfIvancho++;
        }

        if(heritage >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",Math.abs(heritage));
        } else {
            System.out.printf("He will need %.2f dollars to survive!", Math.abs(heritage));
        }
    }
}
