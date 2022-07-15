package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isValidInput = true;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter the 3 dimensions of a Triangle:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();

                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle.getType());
                break;
            } catch (Exception e) {
                System.out.println("Invalid type for dimension, should be a number");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
