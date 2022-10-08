package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");

        sortArray(numbers);
    }

    public static void sortArray(String myARR[]){
        for (int i = 0; i < myARR.length / 2; i++) {
            String temp = myARR[i];
            myARR[i] = myARR[myARR.length - 1 - i];
            myARR[myARR.length - 1 - i] = temp;
        }
        for (int i = 0; i < myARR.length; i++) {
            System.out.print(myARR[i] + " ");
        }
    }
}