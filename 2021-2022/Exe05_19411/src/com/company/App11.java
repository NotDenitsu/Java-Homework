package com.company;

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("Enter even number: ");
            n = input.nextInt();

            if(n % 2 == 0){break;}
            System.out.println("The number is not even.");
        }
        System.out.println("Even number entered: " + n);
    }
}
