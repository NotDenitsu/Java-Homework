package com.company;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {

        String[] input = new Scanner(System.in).nextLine().split(" ");
        String mostCommon = "";
        int biggestCount = 0;

        for (String value : input) {
            int count = 0;
            for (String value2 : input) {
                if(value.equals(value2)){
                    count++;
                } else {
                    if (count > biggestCount) {
                        biggestCount = count;
                        mostCommon = value;
                    }
                    count = 0;
                }
            }
            if (count > biggestCount) {
                biggestCount = count;
                mostCommon = value;
            }
        }
        for (int i = 0; i < biggestCount; i++) {
            System.out.print(mostCommon + " ");
        }
    }
}
