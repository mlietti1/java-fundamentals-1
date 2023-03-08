package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        double pricePerKm = 0.21;
        double discountYoung = 0.2;
        double discountOver = 0.4;

        Scanner scan = new Scanner(System.in);
        System.out.print("How long is your journey? ");
        int kmTot = Integer.parseInt(scan.nextLine());
        System.out.print("Insert your age: ");
        int age = Integer.parseInt(scan.nextLine());

        double fullPrice = ((double) kmTot * pricePerKm);

        double finalPrice;

        if (age < 18) {
            finalPrice = fullPrice - (fullPrice * discountYoung);
        } else if (age >= 65) {
            finalPrice = fullPrice - (fullPrice * discountOver);
        } else {
            finalPrice = fullPrice;
        }

        DecimalFormat decimalFormat = new DecimalFormat("###.00");


        System.out.println("The price of you ticket is: " + decimalFormat.format(finalPrice) + " €");

        scan.close();
    }
}
