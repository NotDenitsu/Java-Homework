package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        String[] input = new Scanner(System.in).nextLine().split(" ");
        String mostCommon = "";
        int biggestCount = 0;

        for (String value : input) {
            int count = 0;
            for (String value2 : input) {
                count += (value.equals(value2)) ? 1 : 0;
            }
            if (count > biggestCount) {
                biggestCount = count;
                mostCommon = value;
            }
        }
        System.out.print(mostCommon);
    }
}
