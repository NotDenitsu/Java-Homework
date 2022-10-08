package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int[] parsedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            parsedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        bubbleSort(parsedNumbers.length, parsedNumbers);


    }

    public static void bubbleSort(int n, int myARR[]){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(myARR[j] > myARR[j + 1]){
                    int temp = myARR[j];
                    myARR[j] = myARR[j + 1];
                    myARR[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < myARR.length; i++) {
            System.out.print((i == myARR.length - 1) ? myARR[i] : myARR[i] + ",");
        }
    }
}