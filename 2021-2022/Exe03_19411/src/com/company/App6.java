package com.company;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of cargo: ");
        int cargo = input.nextInt();
        int sumWeight = 0;
        int sumPrice = 0;
        int minibusWeight = 0;
        int truckWeight = 0;
        int trainWeight = 0;

        for (int i = 0; i < cargo; i++) {
            int weightInTons = input.nextInt();
            sumWeight += weightInTons;

            if(weightInTons <= 3){
                sumPrice += weightInTons * 200;
                minibusWeight += weightInTons;
            } else if (weightInTons > 3 && weightInTons <= 11) {
                sumPrice += weightInTons * 175;
                truckWeight += weightInTons;
            } else if (weightInTons > 11) {
                sumPrice += weightInTons * 120;
                trainWeight += weightInTons;
            }
        }


        double sumAverage = (double) sumPrice / sumWeight;
        double minibusPercentage = (double) minibusWeight / sumWeight * 100;
        double truckPercentage = (double) truckWeight / sumWeight * 100;
        double trainPercentage = (double) trainWeight / sumWeight * 100;

        System.out.printf("%.2f \n%.2f %% \n%.2f %% \n%.2f %%",sumAverage,minibusPercentage,truckPercentage,trainPercentage);

    }
}
