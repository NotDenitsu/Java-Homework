package com.company;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
	    int n = input.nextInt();
	    double p1 = 0,p2 = 0,p3 = 0,p4 = 0,p5 = 0;

        for (int i = 0; i < n; i++) {
            int number = input.nextInt();

            if(number <= 199){
                p1++;
            } else if (number >= 200 && number <= 399){
                p2++;
            } else if (number >= 400 && number <= 599){
                p3++;
            } else if (number >= 600 && number <= 799){
                p4++;
            } else{
                p5++;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        p4 = p4 / n * 100;
        p5 = p5 / n * 100;

        System.out.printf("%.2f %% \n%.2f %% \n%.2f %% \n%.2f %% \n%.2f %% \n",p1,p2,p3,p4,p5);

    }
}
