package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter period of days: ");
        int days = input.nextInt();
        int countOfDoctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            int patientsForTheDay = input.nextInt();

            if(currentDay % 3 == 0 && (untreatedPatients > treatedPatients)){
                countOfDoctors++;
            }

            if(patientsForTheDay > countOfDoctors){
                treatedPatients += countOfDoctors;
                untreatedPatients += patientsForTheDay - countOfDoctors;
            } else {
                treatedPatients += patientsForTheDay;
            }
        }

        System.out.println("Treated patients: " + treatedPatients);
        System.out.println("Untreated patients: " + untreatedPatients);
    }
}
