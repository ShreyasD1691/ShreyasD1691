package com.saasAssignments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter 2 integer inputs:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                AckermannFunction ackfun = new AckermannFunction(num1, num2);
                System.out.println("Output of A(" + num1 + "," + num2 + ") is " + ackfun.getResult());
                break;
            } catch(Exception e){
                System.out.println("Invalid type, should be integer");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}