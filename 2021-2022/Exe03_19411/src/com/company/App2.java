package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Lily's age: ");
        int age = input.nextInt();
        System.out.print("Enter the washing machine's price: ");
        double washingMachine = input.nextDouble();
        System.out.print("Enter the price per toy: ");
        int toyPrice = input.nextInt();
        int moneyGiven = 10;
        int money = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0){
                money += moneyGiven - 1;
                moneyGiven += 10;
            } else {
                toys++;
            }
        }

        if(money + (toys * toyPrice) >= washingMachine){
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
        System.out.println(Math.abs(washingMachine - (money + (toys * toyPrice))));


    }
}
