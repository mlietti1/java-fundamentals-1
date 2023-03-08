package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number between 1 and 1000: ");
        int num = Integer.parseInt(scan.nextLine());

        while (num < 1 || num > 1000) {
            System.out.println("Number not valid, try again.");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Let's play FizzBuzz!");
        for (int i = 1; i <= num; i++) {
            String output = Integer.toString(i);
            if (i % 15 == 0) {
                output = "FizzBuzz";
            } else if (i % 3 == 0) {
                output = "Fizz";
            } else if (i % 5 == 0) {
                output = "Buzz";
            }
            System.out.println(output);
        }
        scan.close();
    }
}
