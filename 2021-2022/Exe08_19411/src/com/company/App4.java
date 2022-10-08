package com.company;
import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split("");
        char letters[] = new char[input.length];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = input[i].toCharArray()[0];
            System.out.println(letters[i] + " -> " + ((int)letters[i] - 'a'));
        }
    }
}
